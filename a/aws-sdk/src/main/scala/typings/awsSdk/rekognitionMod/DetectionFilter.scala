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
  def apply(): DetectionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectionFilter]
  }
  @scala.inline
  implicit class DetectionFilterOps[Self <: DetectionFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMinBoundingBoxHeight(value: BoundingBoxHeight): Self = this.set("MinBoundingBoxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinBoundingBoxHeight: Self = this.set("MinBoundingBoxHeight", js.undefined)
    @scala.inline
    def setMinBoundingBoxWidth(value: BoundingBoxWidth): Self = this.set("MinBoundingBoxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinBoundingBoxWidth: Self = this.set("MinBoundingBoxWidth", js.undefined)
    @scala.inline
    def setMinConfidence(value: Percent): Self = this.set("MinConfidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinConfidence: Self = this.set("MinConfidence", js.undefined)
  }
  
}

