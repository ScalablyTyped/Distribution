package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateImageRequest extends js.Object {
  
  /**
    * A list of properties to delete. Only the Description and DisplayName properties can be deleted.
    */
  var DeleteProperties: js.UndefOr[ImageDeletePropertyList] = js.native
  
  /**
    * The new description for the image.
    */
  var Description: js.UndefOr[ImageDescription] = js.native
  
  /**
    * The new display name for the image.
    */
  var DisplayName: js.UndefOr[ImageDisplayName] = js.native
  
  /**
    * The name of the image to update.
    */
  var ImageName: typings.awsSdk.sagemakerMod.ImageName = js.native
  
  /**
    * The new Amazon Resource Name (ARN) for the IAM role that enables Amazon SageMaker to perform tasks on your behalf.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.sagemakerMod.RoleArn] = js.native
}
object UpdateImageRequest {
  
  @scala.inline
  def apply(ImageName: ImageName): UpdateImageRequest = {
    val __obj = js.Dynamic.literal(ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateImageRequest]
  }
  
  @scala.inline
  implicit class UpdateImageRequestOps[Self <: UpdateImageRequest] (val x: Self) extends AnyVal {
    
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
    def setImageName(value: ImageName): Self = this.set("ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletePropertiesVarargs(value: ImageDeleteProperty*): Self = this.set("DeleteProperties", js.Array(value :_*))
    
    @scala.inline
    def setDeleteProperties(value: ImageDeletePropertyList): Self = this.set("DeleteProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteProperties: Self = this.set("DeleteProperties", js.undefined)
    
    @scala.inline
    def setDescription(value: ImageDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: ImageDisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
  }
}
