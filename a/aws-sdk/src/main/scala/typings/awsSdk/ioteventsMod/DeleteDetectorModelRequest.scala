package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDetectorModelRequest extends js.Object {
  /**
    * The name of the detector model to be deleted.
    */
  var detectorModelName: DetectorModelName = js.native
}

object DeleteDetectorModelRequest {
  @scala.inline
  def apply(detectorModelName: DetectorModelName): DeleteDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDetectorModelRequest]
  }
  @scala.inline
  implicit class DeleteDetectorModelRequestOps[Self <: DeleteDetectorModelRequest] (val x: Self) extends AnyVal {
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
    def setDetectorModelName(value: DetectorModelName): Self = this.set("detectorModelName", value.asInstanceOf[js.Any])
  }
  
}

