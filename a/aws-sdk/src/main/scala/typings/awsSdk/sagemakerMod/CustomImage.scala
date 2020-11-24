package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomImage extends js.Object {
  
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
  implicit class CustomImageOps[Self <: CustomImage] (val x: Self) extends AnyVal {
    
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
    def setAppImageConfigName(value: AppImageConfigName): Self = this.set("AppImageConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageName(value: ImageName): Self = this.set("ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersionNumber(value: ImageVersionNumber): Self = this.set("ImageVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageVersionNumber: Self = this.set("ImageVersionNumber", js.undefined)
  }
}
