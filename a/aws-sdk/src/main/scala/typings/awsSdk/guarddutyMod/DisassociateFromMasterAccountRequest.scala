package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateFromMasterAccountRequest extends js.Object {
  /**
    * The unique ID of the detector of the GuardDuty member account.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}

object DisassociateFromMasterAccountRequest {
  @scala.inline
  def apply(DetectorId: DetectorId): DisassociateFromMasterAccountRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateFromMasterAccountRequest]
  }
  @scala.inline
  implicit class DisassociateFromMasterAccountRequestOps[Self <: DisassociateFromMasterAccountRequest] (val x: Self) extends AnyVal {
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
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
  }
  
}

