package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDetectorModelResponse extends js.Object {
  /**
    * Information about the detector model.
    */
  var detectorModel: js.UndefOr[DetectorModel] = js.native
}

object DescribeDetectorModelResponse {
  @scala.inline
  def apply(): DescribeDetectorModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDetectorModelResponse]
  }
  @scala.inline
  implicit class DescribeDetectorModelResponseOps[Self <: DescribeDetectorModelResponse] (val x: Self) extends AnyVal {
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
    def setDetectorModel(value: DetectorModel): Self = this.set("detectorModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorModel: Self = this.set("detectorModel", js.undefined)
  }
  
}

