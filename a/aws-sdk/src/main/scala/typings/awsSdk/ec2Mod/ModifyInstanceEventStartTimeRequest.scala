package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceEventStartTimeRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the event whose date and time you are modifying.
    */
  var InstanceEventId: String = js.native
  /**
    * The ID of the instance with the scheduled event.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
  /**
    * The new date and time when the event will take place.
    */
  var NotBefore: DateTime = js.native
}

object ModifyInstanceEventStartTimeRequest {
  @scala.inline
  def apply(InstanceEventId: String, InstanceId: InstanceId, NotBefore: DateTime): ModifyInstanceEventStartTimeRequest = {
    val __obj = js.Dynamic.literal(InstanceEventId = InstanceEventId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], NotBefore = NotBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceEventStartTimeRequest]
  }
  @scala.inline
  implicit class ModifyInstanceEventStartTimeRequestOps[Self <: ModifyInstanceEventStartTimeRequest] (val x: Self) extends AnyVal {
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
    def setInstanceEventId(value: String): Self = this.set("InstanceEventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotBefore(value: DateTime): Self = this.set("NotBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

