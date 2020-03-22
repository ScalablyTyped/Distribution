package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectionFilter extends js.Object {
  /**
    * Sets the minimum height of the word bounding box. Words with bounding box heights lesser than this value will be excluded from the result. Value is relative to the video frame height.
    */
  var MinBoundingBoxHeight: js.UndefOr[BoundingBoxHeight] = js.native
  /**
    * Sets the minimum width of the word bounding box. Words with bounding boxes widths lesser than this value will be excluded from the result. Value is relative to the video frame width.
    */
  var MinBoundingBoxWidth: js.UndefOr[BoundingBoxWidth] = js.native
  /**
    * Sets confidence of word detection. Words with detection confidence below this will be excluded from the result. Values should be between 0.5 and 1 as Text in Video will not return any result below 0.5.
    */
  var MinConfidence: js.UndefOr[Percent] = js.native
}

object DetectionFilter {
  @scala.inline
  def apply(
    MinBoundingBoxHeight: Int | Double = null,
    MinBoundingBoxWidth: Int | Double = null,
    MinConfidence: Int | Double = null
  ): DetectionFilter = {
    val __obj = js.Dynamic.literal()
    if (MinBoundingBoxHeight != null) __obj.updateDynamic("MinBoundingBoxHeight")(MinBoundingBoxHeight.asInstanceOf[js.Any])
    if (MinBoundingBoxWidth != null) __obj.updateDynamic("MinBoundingBoxWidth")(MinBoundingBoxWidth.asInstanceOf[js.Any])
    if (MinConfidence != null) __obj.updateDynamic("MinConfidence")(MinConfidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectionFilter]
  }
}

