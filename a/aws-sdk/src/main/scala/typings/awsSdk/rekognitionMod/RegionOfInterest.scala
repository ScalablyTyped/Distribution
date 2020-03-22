package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionOfInterest extends js.Object {
  /**
    * The box representing a region of interest on screen.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.native
}

object RegionOfInterest {
  @scala.inline
  def apply(BoundingBox: BoundingBox = null): RegionOfInterest = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionOfInterest]
  }
}

