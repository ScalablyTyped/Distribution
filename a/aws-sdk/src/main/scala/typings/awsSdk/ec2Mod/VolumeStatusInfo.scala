package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeStatusInfo extends js.Object {
  /**
    * The details of the volume status.
    */
  var Details: js.UndefOr[VolumeStatusDetailsList] = js.native
  /**
    * The status of the volume.
    */
  var Status: js.UndefOr[VolumeStatusInfoStatus] = js.native
}

object VolumeStatusInfo {
  @scala.inline
  def apply(): VolumeStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatusInfo]
  }
  @scala.inline
  implicit class VolumeStatusInfoOps[Self <: VolumeStatusInfo] (val x: Self) extends AnyVal {
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
    def setDetailsVarargs(value: VolumeStatusDetails*): Self = this.set("Details", js.Array(value :_*))
    @scala.inline
    def setDetails(value: VolumeStatusDetailsList): Self = this.set("Details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("Details", js.undefined)
    @scala.inline
    def setStatus(value: VolumeStatusInfoStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

