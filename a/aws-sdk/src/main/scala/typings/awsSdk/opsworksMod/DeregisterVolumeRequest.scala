package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterVolumeRequest extends js.Object {
  /**
    * The AWS OpsWorks Stacks volume ID, which is the GUID that AWS OpsWorks Stacks assigned to the instance when you registered the volume with the stack, not the Amazon EC2 volume ID.
    */
  var VolumeId: String = js.native
}

object DeregisterVolumeRequest {
  @scala.inline
  def apply(VolumeId: String): DeregisterVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterVolumeRequest]
  }
  @scala.inline
  implicit class DeregisterVolumeRequestOps[Self <: DeregisterVolumeRequest] (val x: Self) extends AnyVal {
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
    def setVolumeId(value: String): Self = this.set("VolumeId", value.asInstanceOf[js.Any])
  }
  
}

