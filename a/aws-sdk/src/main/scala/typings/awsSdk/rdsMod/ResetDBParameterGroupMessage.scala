package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetDBParameterGroupMessage extends js.Object {
  /**
    * The name of the DB parameter group. Constraints:   Must match the name of an existing DBParameterGroup.  
    */
  var DBParameterGroupName: String = js.native
  /**
    * To reset the entire DB parameter group, specify the DBParameterGroup name and ResetAllParameters parameters. To reset specific parameters, provide a list of the following: ParameterName and ApplyMethod. A maximum of 20 parameters can be modified in a single request.  MySQL  Valid Values (for Apply method): immediate | pending-reboot  You can use the immediate value with dynamic parameters only. You can use the pending-reboot value for both dynamic and static parameters, and changes are applied when DB instance reboots.  MariaDB  Valid Values (for Apply method): immediate | pending-reboot  You can use the immediate value with dynamic parameters only. You can use the pending-reboot value for both dynamic and static parameters, and changes are applied when DB instance reboots.  Oracle  Valid Values (for Apply method): pending-reboot 
    */
  var Parameters: js.UndefOr[ParametersList] = js.native
  /**
    *  A value that indicates whether to reset all parameters in the DB parameter group to default values. By default, all parameters in the DB parameter group are reset to default values. 
    */
  var ResetAllParameters: js.UndefOr[Boolean] = js.native
}

object ResetDBParameterGroupMessage {
  @scala.inline
  def apply(DBParameterGroupName: String): ResetDBParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBParameterGroupName = DBParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetDBParameterGroupMessage]
  }
  @scala.inline
  implicit class ResetDBParameterGroupMessageOps[Self <: ResetDBParameterGroupMessage] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    @scala.inline
    def setResetAllParameters(value: Boolean): Self = this.set("ResetAllParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetAllParameters: Self = this.set("ResetAllParameters", js.undefined)
  }
  
}

