package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBParameterGroupMessage extends StObject {
  
  /**
    * The name of the DB parameter group. Constraints:   If supplied, must match the name of an existing DBParameterGroup.  
    */
  var DBParameterGroupName: String
  
  /**
    * An array of parameter names, values, and the apply method for the parameter update. At least one parameter name, value, and apply method must be supplied; later arguments are optional. A maximum of 20 parameters can be modified in a single request. Valid Values (for the application method): immediate | pending-reboot   You can use the immediate value with dynamic parameters only. You can use the pending-reboot value for both dynamic and static parameters, and changes are applied when you reboot the DB instance without failover. 
    */
  var Parameters: ParametersList
}
object ModifyDBParameterGroupMessage {
  
  @scala.inline
  def apply(DBParameterGroupName: String, Parameters: ParametersList): ModifyDBParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBParameterGroupName = DBParameterGroupName.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBParameterGroupMessage]
  }
  
  @scala.inline
  implicit class ModifyDBParameterGroupMessageMutableBuilder[Self <: ModifyDBParameterGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBParameterGroupName(value: String): Self = StObject.set(x, "DBParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: ParametersList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
  }
}
