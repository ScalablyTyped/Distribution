package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImagesResult extends StObject {
  
  /**
    * Information about the images.
    */
  var Images: js.UndefOr[ImageList] = js.native
}
object DescribeImagesResult {
  
  @scala.inline
  def apply(): DescribeImagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImagesResult]
  }
  
  @scala.inline
  implicit class DescribeImagesResultMutableBuilder[Self <: DescribeImagesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImages(value: ImageList): Self = StObject.set(x, "Images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "Images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: Image*): Self = StObject.set(x, "Images", js.Array(value :_*))
  }
}
