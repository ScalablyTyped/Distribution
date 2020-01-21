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
  def apply(detectorModelName: DetectorModelName, detectorModelVersion: DetectorModelVersion = null): DescribeDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
    if (detectorModelVersion != null) __obj.updateDynamic("detectorModelVersion")(detectorModelVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDetectorModelRequest]
  }
}

