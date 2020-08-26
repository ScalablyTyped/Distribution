package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCommandsRequest extends js.Object {
  /**
    * An array of command IDs. If you include this parameter, DescribeCommands returns a description of the specified commands. Otherwise, it returns a description of every command.
    */
  var CommandIds: js.UndefOr[Strings] = js.native
  /**
    * The deployment ID. If you include this parameter, DescribeCommands returns a description of the commands associated with the specified deployment.
    */
  var DeploymentId: js.UndefOr[String] = js.native
  /**
    * The instance ID. If you include this parameter, DescribeCommands returns a description of the commands associated with the specified instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
}

object DescribeCommandsRequest {
  @scala.inline
  def apply(): DescribeCommandsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCommandsRequest]
  }
  @scala.inline
  implicit class DescribeCommandsRequestOps[Self <: DescribeCommandsRequest] (val x: Self) extends AnyVal {
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
    def setCommandIdsVarargs(value: String*): Self = this.set("CommandIds", js.Array(value :_*))
    @scala.inline
    def setCommandIds(value: Strings): Self = this.set("CommandIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommandIds: Self = this.set("CommandIds", js.undefined)
    @scala.inline
    def setDeploymentId(value: String): Self = this.set("DeploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentId: Self = this.set("DeploymentId", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
  }
  
}

