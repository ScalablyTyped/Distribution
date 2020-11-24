package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageInserter extends js.Object {
  
  /**
    * Specify the images that you want to overlay on your video. The images must be PNG or TGA files.
    */
  var InsertableImages: js.UndefOr[listOfInsertableImage] = js.native
}
object ImageInserter {
  
  @scala.inline
  def apply(): ImageInserter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageInserter]
  }
  
  @scala.inline
  implicit class ImageInserterOps[Self <: ImageInserter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInsertableImagesVarargs(value: InsertableImage*): Self = this.set("InsertableImages", js.Array(value :_*))
    
    @scala.inline
    def setInsertableImages(value: listOfInsertableImage): Self = this.set("InsertableImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertableImages: Self = this.set("InsertableImages", js.undefined)
  }
}
