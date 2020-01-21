package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageInserter extends js.Object {
  /**
    * Specify the images that you want to overlay on your video. The images must be PNG or TGA files.
    */
  var InsertableImages: js.UndefOr[listOfInsertableImage] = js.native
}

object ImageInserter {
  @scala.inline
  def apply(InsertableImages: listOfInsertableImage = null): ImageInserter = {
    val __obj = js.Dynamic.literal()
    if (InsertableImages != null) __obj.updateDynamic("InsertableImages")(InsertableImages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInserter]
  }
}

