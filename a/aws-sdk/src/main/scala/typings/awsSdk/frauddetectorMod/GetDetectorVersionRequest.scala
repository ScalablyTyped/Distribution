package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDetectorVersionRequest extends js.Object {
  /**
    * The detector ID.
    */
  var detectorId: identifier = js.native
  /**
    * The detector version ID.
    */
  var detectorVersionId: wholeNumberVersionString = js.native
}

object GetDetectorVersionRequest {
  @scala.inline
  def apply(detectorId: identifier, detectorVersionId: wholeNumberVersionString): GetDetectorVersionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetectorVersionRequest]
  }
  @scala.inline
  implicit class GetDetectorVersionRequestOps[Self <: GetDetectorVersionRequest] (val x: Self) extends AnyVal {
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

