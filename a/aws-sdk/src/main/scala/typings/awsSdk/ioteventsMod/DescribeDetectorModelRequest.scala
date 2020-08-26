package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDetectorModelRequest extends js.Object {
  /**
    * The name of the detector model.
    */
  var detectorModelName: DetectorModelName = js.native
  /**
    * The version of the detector model.
    */
  var detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.native
}

object DescribeDetectorModelRequest {
  @scala.inline
  def apply(detectorModelName: DetectorModelName): DescribeDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDetectorModelRequest]
  }
  @scala.inline
  implicit class DescribeDetectorModelRequestOps[Self <: DescribeDetectorModelRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setDetectorModelVersion(value: DetectorModelVersion): Self = this.set("detectorModelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorModelVersion: Self = this.set("detectorModelVersion", js.undefined)
  }
  
}

