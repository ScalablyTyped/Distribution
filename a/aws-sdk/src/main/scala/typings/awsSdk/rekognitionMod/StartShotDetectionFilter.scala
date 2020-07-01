package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartShotDetectionFilter extends js.Object {
  /**
    * Specifies the minimum confidence that Amazon Rekognition Video must have in order to return a detected segment. Confidence represents how certain Amazon Rekognition is that a segment is correctly identified. 0 is the lowest confidence. 100 is the highest confidence. Amazon Rekognition Video doesn't return any segments with a confidence level lower than this specified value. If you don't specify MinSegmentConfidence, the GetSegmentDetection returns segments with confidence values greater than or equal to 50 percent.
    */
  var MinSegmentConfidence: js.UndefOr[SegmentConfidence] = js.native
}

object StartShotDetectionFilter {
  @scala.inline
  def apply(MinSegmentConfidence: js.UndefOr[SegmentConfidence] = js.undefined): StartShotDetectionFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MinSegmentConfidence)) __obj.updateDynamic("MinSegmentConfidence")(MinSegmentConfidence.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartShotDetectionFilter]
  }
}

