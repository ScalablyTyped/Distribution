package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomImage extends StObject {
  
  /**
    * The name of the AppImageConfig.
    */
  var AppImageConfigName: typings.awsSdk.sagemakerMod.AppImageConfigName = js.native
  
  /**
    * The name of the CustomImage. Must be unique to your account.
    */
  var ImageName: typings.awsSdk.sagemakerMod.ImageName = js.native
  
  /**
    * The version number of the CustomImage.
    */
  var ImageVersionNumber: js.UndefOr[typings.awsSdk.sagemakerMod.ImageVersionNumber] = js.native
}
object CustomImage {
  
  @scala.inline
  def apply(AppImageConfigName: AppImageConfigName, ImageName: ImageName): CustomImage = {
    val __obj = js.Dynamic.literal(AppImageConfigName = AppImageConfigName.asInstanceOf[js.Any], ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomImage]
  }
  
  @scala.inline
  implicit class CustomImageMutableBuilder[Self <: CustomImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppImageConfigName(value: AppImageConfigName): Self = StObject.set(x, "AppImageConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersionNumber(value: ImageVersionNumber): Self = StObject.set(x, "ImageVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersionNumberUndefined: Self = StObject.set(x, "ImageVersionNumber", js.undefined)
  }
}
