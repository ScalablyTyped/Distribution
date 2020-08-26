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
  def apply(): RegionOfInterest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionOfInterest]
  }
  @scala.inline
  implicit class RegionOfInterestOps[Self <: RegionOfInterest] (val x: Self) extends AnyVal {
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
    def setBoundingBox(value: BoundingBox): Self = this.set("BoundingBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundingBox: Self = this.set("BoundingBox", js.undefined)
  }
  
}

