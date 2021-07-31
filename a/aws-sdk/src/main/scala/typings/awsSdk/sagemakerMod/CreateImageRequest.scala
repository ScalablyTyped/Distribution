package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImageRequest extends StObject {
  
  /**
    * The description of the image.
    */
  var Description: js.UndefOr[ImageDescription] = js.undefined
  
  /**
    * The display name of the image. If not provided, ImageName is displayed.
    */
  var DisplayName: js.UndefOr[ImageDisplayName] = js.undefined
  
  /**
    * The name of the image. Must be unique to your account.
    */
  var ImageName: typings.awsSdk.sagemakerMod.ImageName
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your behalf.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn
  
  /**
    * A list of tags to apply to the image.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateImageRequest {
  
  @scala.inline
  def apply(ImageName: ImageName, RoleArn: RoleArn): CreateImageRequest = {
    val __obj = js.Dynamic.literal(ImageName = ImageName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageRequest]
  }
  
  @scala.inline
  implicit class CreateImageRequestMutableBuilder[Self <: CreateImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: ImageDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: ImageDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
