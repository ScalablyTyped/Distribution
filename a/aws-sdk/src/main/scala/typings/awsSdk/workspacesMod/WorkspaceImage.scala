package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceImage extends StObject {
  
  /**
    * The date when the image was created. If the image has been shared, the AWS account that the image has been shared with sees the original creation date of the image.
    */
  var Created: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the image.
    */
  var Description: js.UndefOr[WorkspaceImageDescription] = js.native
  
  /**
    * The error code that is returned for the image.
    */
  var ErrorCode: js.UndefOr[WorkspaceImageErrorCode] = js.native
  
  /**
    * The text of the error message that is returned for the image.
    */
  var ErrorMessage: js.UndefOr[Description] = js.native
  
  /**
    * The identifier of the image.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.native
  
  /**
    * The name of the image.
    */
  var Name: js.UndefOr[WorkspaceImageName] = js.native
  
  /**
    * The operating system that the image is running. 
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.workspacesMod.OperatingSystem] = js.native
  
  /**
    * The identifier of the AWS account that owns the image.
    */
  var OwnerAccountId: js.UndefOr[AwsAccount] = js.native
  
  /**
    * Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is enabled, this value is set to DEDICATED. For more information, see Bring Your Own Windows Desktop Images.
    */
  var RequiredTenancy: js.UndefOr[WorkspaceImageRequiredTenancy] = js.native
  
  /**
    * The status of the image.
    */
  var State: js.UndefOr[WorkspaceImageState] = js.native
}
object WorkspaceImage {
  
  @scala.inline
  def apply(): WorkspaceImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceImage]
  }
  
  @scala.inline
  implicit class WorkspaceImageMutableBuilder[Self <: WorkspaceImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: Timestamp): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    @scala.inline
    def setDescription(value: WorkspaceImageDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setErrorCode(value: WorkspaceImageErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: Description): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setImageId(value: WorkspaceImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    @scala.inline
    def setName(value: WorkspaceImageName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
    
    @scala.inline
    def setOwnerAccountId(value: AwsAccount): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    @scala.inline
    def setRequiredTenancy(value: WorkspaceImageRequiredTenancy): Self = StObject.set(x, "RequiredTenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredTenancyUndefined: Self = StObject.set(x, "RequiredTenancy", js.undefined)
    
    @scala.inline
    def setState(value: WorkspaceImageState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
