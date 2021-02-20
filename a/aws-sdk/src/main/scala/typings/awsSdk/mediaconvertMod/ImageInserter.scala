package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageInserter extends StObject {
  
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
  implicit class ImageInserterMutableBuilder[Self <: ImageInserter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertableImages(value: listOfInsertableImage): Self = StObject.set(x, "InsertableImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertableImagesUndefined: Self = StObject.set(x, "InsertableImages", js.undefined)
    
    @scala.inline
    def setInsertableImagesVarargs(value: InsertableImage*): Self = StObject.set(x, "InsertableImages", js.Array(value :_*))
  }
}
