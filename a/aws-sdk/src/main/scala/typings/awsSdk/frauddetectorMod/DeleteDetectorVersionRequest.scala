package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDetectorVersionRequest extends js.Object {
  /**
    * The ID of the parent detector for the detector version to delete.
    */
  var detectorId: identifier = js.native
  /**
    * The ID of the detector version to delete.
    */
  var detectorVersionId: wholeNumberVersionString = js.native
}

object DeleteDetectorVersionRequest {
  @scala.inline
  def apply(detectorId: identifier, detectorVersionId: wholeNumberVersionString): DeleteDetectorVersionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDetectorVersionRequest]
  }
  @scala.inline
  implicit class DeleteDetectorVersionRequestOps[Self <: DeleteDetectorVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetectorId(value: identifier): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetectorVersionId(value: wholeNumberVersionString): Self = this.set("detectorVersionId", value.asInstanceOf[js.Any])
  }
  
}

