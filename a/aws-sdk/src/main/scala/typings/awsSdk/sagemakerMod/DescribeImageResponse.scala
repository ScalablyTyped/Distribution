package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImageResponse extends StObject {
  
  /**
    * When the image was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The description of the image.
    */
  var Description: js.UndefOr[ImageDescription] = js.undefined
  
  /**
    * The name of the image as displayed.
    */
  var DisplayName: js.UndefOr[ImageDisplayName] = js.undefined
  
  /**
    * When a create, update, or delete operation fails, the reason for the failure.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the image.
    */
  var ImageArn: js.UndefOr[typings.awsSdk.sagemakerMod.ImageArn] = js.undefined
  
  /**
    * The name of the image.
    */
  var ImageName: js.UndefOr[typings.awsSdk.sagemakerMod.ImageName] = js.undefined
  
  /**
    * The status of the image.
    */
  var ImageStatus: js.UndefOr[typings.awsSdk.sagemakerMod.ImageStatus] = js.undefined
  
  /**
    * When the image was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that enables Amazon SageMaker to perform tasks on your behalf.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.sagemakerMod.RoleArn] = js.undefined
}
object DescribeImageResponse {
  
  @scala.inline
  def apply(): DescribeImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImageResponse]
  }
  
  @scala.inline
  implicit class DescribeImageResponseMutableBuilder[Self <: DescribeImageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: ImageDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: ImageDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setImageArn(value: ImageArn): Self = StObject.set(x, "ImageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageArnUndefined: Self = StObject.set(x, "ImageArn", js.undefined)
    
    @scala.inline
    def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageNameUndefined: Self = StObject.set(x, "ImageName", js.undefined)
    
    @scala.inline
    def setImageStatus(value: ImageStatus): Self = StObject.set(x, "ImageStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageStatusUndefined: Self = StObject.set(x, "ImageStatus", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
