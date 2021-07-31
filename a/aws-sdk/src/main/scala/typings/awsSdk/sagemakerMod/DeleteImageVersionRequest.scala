package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImageVersionRequest extends StObject {
  
  /**
    * The name of the image.
    */
  var ImageName: typings.awsSdk.sagemakerMod.ImageName
  
  /**
    * The version to delete.
    */
  var Version: ImageVersionNumber
}
object DeleteImageVersionRequest {
  
  @scala.inline
  def apply(ImageName: ImageName, Version: ImageVersionNumber): DeleteImageVersionRequest = {
    val __obj = js.Dynamic.literal(ImageName = ImageName.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageVersionRequest]
  }
  
  @scala.inline
  implicit class DeleteImageVersionRequestMutableBuilder[Self <: DeleteImageVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: ImageVersionNumber): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
