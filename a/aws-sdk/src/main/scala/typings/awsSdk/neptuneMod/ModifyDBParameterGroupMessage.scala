package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBParameterGroupMessage extends js.Object {
  /**
    * The name of the DB parameter group. Constraints:   If supplied, must match the name of an existing DBParameterGroup.  
    */
  var DBParameterGroupName: String = js.native
  /**
    * An array of parameter names, values, and the apply method for the parameter update. At least one parameter name, value, and apply method must be supplied; subsequent arguments are optional. A maximum of 20 parameters can be modified in a single request. Valid Values (for the application method): immediate | pending-reboot   You can use the immediate value with dynamic parameters only. You can use the pending-reboot value for both dynamic and static parameters, and changes are applied when you reboot the DB instance without failover. 
    */
  var Parameters: ParametersList = js.native
}

object ModifyDBParameterGroupMessage {
  @scala.inline
  def apply(DBParameterGroupName: String, Parameters: ParametersList): ModifyDBParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBParameterGroupName = DBParameterGroupName.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBParameterGroupMessage]
  }
  @scala.inline
  implicit class ModifyDBParameterGroupMessageOps[Self <: ModifyDBParameterGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDBParameterGroupName(value: String): Self = this.set("DBParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = this.set("Parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: ParametersList): Self = this.set("Parameters", value.asInstanceOf[js.Any])
  }
  
}

