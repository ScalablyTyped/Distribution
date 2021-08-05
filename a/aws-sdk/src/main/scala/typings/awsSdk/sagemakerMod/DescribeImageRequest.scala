package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImageRequest extends StObject {
  
  /**
    * The name of the image to describe.
    */
  var ImageName: typings.awsSdk.sagemakerMod.ImageName
}
object DescribeImageRequest {
  
  inline def apply(ImageName: ImageName): DescribeImageRequest = {
    val __obj = js.Dynamic.literal(ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImageRequest]
  }
  
  extension [Self <: DescribeImageRequest](x: Self) {
    
    inline def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
  }
}
