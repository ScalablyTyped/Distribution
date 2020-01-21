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
  def apply(detectorModel: DetectorModel = null): DescribeDetectorModelResponse = {
    val __obj = js.Dynamic.literal()
    if (detectorModel != null) __obj.updateDynamic("detectorModel")(detectorModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDetectorModelResponse]
  }
}

