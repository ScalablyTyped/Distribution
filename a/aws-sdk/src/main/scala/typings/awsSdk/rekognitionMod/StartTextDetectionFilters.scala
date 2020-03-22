package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTextDetectionFilters extends js.Object {
  /**
    * Filter focusing on a certain area of the frame. Uses a BoundingBox object to set the region of the screen.
    */
  var RegionsOfInterest: js.UndefOr[typings.awsSdk.rekognitionMod.RegionsOfInterest] = js.native
  /**
    * Filters focusing on qualities of the text, such as confidence or size.
    */
  var WordFilter: js.UndefOr[DetectionFilter] = js.native
}

object StartTextDetectionFilters {
  @scala.inline
  def apply(RegionsOfInterest: RegionsOfInterest = null, WordFilter: DetectionFilter = null): StartTextDetectionFilters = {
    val __obj = js.Dynamic.literal()
    if (RegionsOfInterest != null) __obj.updateDynamic("RegionsOfInterest")(RegionsOfInterest.asInstanceOf[js.Any])
    if (WordFilter != null) __obj.updateDynamic("WordFilter")(WordFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTextDetectionFilters]
  }
}

