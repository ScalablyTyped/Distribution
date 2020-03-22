package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectTextFilters extends js.Object {
  /**
    *  A Filter focusing on a certain area of the image. Uses a BoundingBox object to set the region of the image.
    */
  var RegionsOfInterest: js.UndefOr[typings.awsSdk.rekognitionMod.RegionsOfInterest] = js.native
  var WordFilter: js.UndefOr[DetectionFilter] = js.native
}

object DetectTextFilters {
  @scala.inline
  def apply(RegionsOfInterest: RegionsOfInterest = null, WordFilter: DetectionFilter = null): DetectTextFilters = {
    val __obj = js.Dynamic.literal()
    if (RegionsOfInterest != null) __obj.updateDynamic("RegionsOfInterest")(RegionsOfInterest.asInstanceOf[js.Any])
    if (WordFilter != null) __obj.updateDynamic("WordFilter")(WordFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectTextFilters]
  }
}

