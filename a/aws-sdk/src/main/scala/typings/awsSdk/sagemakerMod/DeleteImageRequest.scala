package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImageRequest extends StObject {
  
  /**
    * The name of the image to delete.
    */
  var ImageName: typings.awsSdk.sagemakerMod.ImageName
}
object DeleteImageRequest {
  
  @scala.inline
  def apply(ImageName: ImageName): DeleteImageRequest = {
    val __obj = js.Dynamic.literal(ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageRequest]
  }
  
  @scala.inline
  implicit class DeleteImageRequestMutableBuilder[Self <: DeleteImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
  }
}
