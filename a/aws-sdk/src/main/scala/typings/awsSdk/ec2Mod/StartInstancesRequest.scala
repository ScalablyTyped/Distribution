package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartInstancesRequest extends js.Object {
  /**
    * Reserved.
    */
  var AdditionalInfo: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the instances.
    */
  var InstanceIds: InstanceIdStringList = js.native
}

object StartInstancesRequest {
  @scala.inline
  def apply(InstanceIds: InstanceIdStringList): StartInstancesRequest = {
    val __obj = js.Dynamic.literal(InstanceIds = InstanceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartInstancesRequest]
  }
  @scala.inline
  implicit class StartInstancesRequestOps[Self <: StartInstancesRequest] (val x: Self) extends AnyVal {
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
    def setInstanceIdsVarargs(value: InstanceId*): Self = this.set("InstanceIds", js.Array(value :_*))
    @scala.inline
    def setInstanceIds(value: InstanceIdStringList): Self = this.set("InstanceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditionalInfo(value: String): Self = this.set("AdditionalInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalInfo: Self = this.set("AdditionalInfo", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

