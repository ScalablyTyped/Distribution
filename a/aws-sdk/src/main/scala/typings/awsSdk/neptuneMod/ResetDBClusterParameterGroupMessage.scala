package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetDBClusterParameterGroupMessage extends StObject {
  
  /**
    * The name of the DB cluster parameter group to reset.
    */
  var DBClusterParameterGroupName: String
  
  /**
    * A list of parameter names in the DB cluster parameter group to reset to the default values. You can't use this parameter if the ResetAllParameters parameter is set to true.
    */
  var Parameters: js.UndefOr[ParametersList] = js.undefined
  
  /**
    * A value that is set to true to reset all parameters in the DB cluster parameter group to their default values, and false otherwise. You can't use this parameter if there is a list of parameter names specified for the Parameters parameter.
    */
  var ResetAllParameters: js.UndefOr[Boolean] = js.undefined
}
object ResetDBClusterParameterGroupMessage {
  
  @scala.inline
  def apply(DBClusterParameterGroupName: String): ResetDBClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBClusterParameterGroupName = DBClusterParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetDBClusterParameterGroupMessage]
  }
  
  @scala.inline
  implicit class ResetDBClusterParameterGroupMessageMutableBuilder[Self <: ResetDBClusterParameterGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterParameterGroupName(value: String): Self = StObject.set(x, "DBClusterParameterGroupName", value.asInstanceOf[js.Any])
    
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
