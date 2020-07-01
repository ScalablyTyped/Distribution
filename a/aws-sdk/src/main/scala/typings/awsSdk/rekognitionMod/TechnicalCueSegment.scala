package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TechnicalCueSegment extends js.Object {
  /**
    * The confidence that Amazon Rekognition Video has in the accuracy of the detected segment.
    */
  var Confidence: js.UndefOr[SegmentConfidence] = js.native
  /**
    * The type of the technical cue.
    */
  var Type: js.UndefOr[TechnicalCueType] = js.native
}

object TechnicalCueSegment {
  @scala.inline
  def apply(Confidence: js.UndefOr[SegmentConfidence] = js.undefined, Type: TechnicalCueType = null): TechnicalCueSegment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence.get.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TechnicalCueSegment]
  }
}

