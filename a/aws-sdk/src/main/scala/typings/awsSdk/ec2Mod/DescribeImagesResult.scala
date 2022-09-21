package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImagesResult extends StObject {
  
  /**
    * Information about the images.
    */
  var Images: js.UndefOr[ImageList] = js.undefined
}
object DescribeImagesResult {
  
  inline def apply(): DescribeImagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImagesResult]
  }
  
  extension [Self <: DescribeImagesResult](x: Self) {
    
    inline def setImages(value: ImageList): Self = StObject.set(x, "Images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "Images", js.undefined)
    
    inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "Images", js.Array(value*))
  }
}
