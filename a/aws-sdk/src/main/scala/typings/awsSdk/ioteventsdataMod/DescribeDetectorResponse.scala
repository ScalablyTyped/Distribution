package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDetectorResponse extends js.Object {
  /**
    * Information about the detector (instance).
    */
  var detector: js.UndefOr[Detector] = js.native
}

object DescribeDetectorResponse {
  @scala.inline
  def apply(detector: Detector = null): DescribeDetectorResponse = {
    val __obj = js.Dynamic.literal()
    if (detector != null) __obj.updateDynamic("detector")(detector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDetectorResponse]
  }
}

