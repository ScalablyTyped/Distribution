package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShotSegment extends js.Object {
  /**
    * The confidence that Amazon Rekognition Video has in the accuracy of the detected segment.
    */
  var Confidence: js.UndefOr[SegmentConfidence] = js.native
  /**
    * An Identifier for a shot detection segment detected in a video 
    */
  var Index: js.UndefOr[ULong] = js.native
}

object ShotSegment {
  @scala.inline
  def apply(Confidence: js.UndefOr[SegmentConfidence] = js.undefined, Index: js.UndefOr[ULong] = js.undefined): ShotSegment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Index)) __obj.updateDynamic("Index")(Index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShotSegment]
  }
}

