package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDetectorModelResponse extends js.Object {
  /**
    * Information about how the detector model is configured.
    */
  var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration] = js.native
}

object CreateDetectorModelResponse {
  @scala.inline
  def apply(detectorModelConfiguration: DetectorModelConfiguration = null): CreateDetectorModelResponse = {
    val __obj = js.Dynamic.literal()
    if (detectorModelConfiguration != null) __obj.updateDynamic("detectorModelConfiguration")(detectorModelConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDetectorModelResponse]
  }
}

