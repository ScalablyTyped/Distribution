package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetDBParameterGroupMessage extends StObject {
  
  /**
    * The name of the DB parameter group. Constraints:   Must match the name of an existing DBParameterGroup.  
    */
  var DBParameterGroupName: String
  
  /**
    * To reset the entire DB parameter group, specify the DBParameterGroup name and ResetAllParameters parameters. To reset specific parameters, provide a list of the following: ParameterName and ApplyMethod. A maximum of 20 parameters can be modified in a single request. Valid Values (for Apply method): pending-reboot 
    */
  var Parameters: js.UndefOr[ParametersList] = js.undefined
  
  /**
    * Specifies whether (true) or not (false) to reset all parameters in the DB parameter group to default values. Default: true 
    */
  var ResetAllParameters: js.UndefOr[Boolean] = js.undefined
}
object ResetDBParameterGroupMessage {
  
  @scala.inline
  def apply(DBParameterGroupName: String): ResetDBParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBParameterGroupName = DBParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetDBParameterGroupMessage]
  }
  
  @scala.inline
  implicit class ResetDBParameterGroupMessageMutableBuilder[Self <: ResetDBParameterGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBParameterGroupName(value: String): Self = StObject.set(x, "DBParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: ParametersList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
    
    @scala.inline
    def setResetAllParameters(value: Boolean): Self = StObject.set(x, "ResetAllParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetAllParametersUndefined: Self = StObject.set(x, "ResetAllParameters", js.undefined)
  }
}
