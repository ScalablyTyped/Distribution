package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceImage extends StObject {
  
  /**
    * The date when the image was created. If the image has been shared, the Amazon Web Services account that the image has been shared with sees the original creation date of the image.
    */
  var Created: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the image.
    */
  var Description: js.UndefOr[WorkspaceImageDescription] = js.undefined
  
  /**
    * The error code that is returned for the image.
    */
  var ErrorCode: js.UndefOr[WorkspaceImageErrorCode] = js.undefined
  
  /**
    * The text of the error message that is returned for the image.
    */
  var ErrorMessage: js.UndefOr[Description] = js.undefined
  
  /**
    * The identifier of the image.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
  
  /**
    * The name of the image.
    */
  var Name: js.UndefOr[WorkspaceImageName] = js.undefined
  
  /**
    * The operating system that the image is running. 
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.workspacesMod.OperatingSystem] = js.undefined
  
  /**
    * The identifier of the Amazon Web Services account that owns the image.
    */
  var OwnerAccountId: js.UndefOr[AwsAccount] = js.undefined
  
  /**
    * Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is enabled, this value is set to DEDICATED. For more information, see Bring Your Own Windows Desktop Images.
    */
  var RequiredTenancy: js.UndefOr[WorkspaceImageRequiredTenancy] = js.undefined
  
  /**
    * The status of the image.
    */
  var State: js.UndefOr[WorkspaceImageState] = js.undefined
  
  /**
    * The updates (if any) that are available for the specified image.
    */
  var Updates: js.UndefOr[UpdateResult] = js.undefined
}
object WorkspaceImage {
  
  inline def apply(): WorkspaceImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceImage]
  }
  
  extension [Self <: WorkspaceImage](x: Self) {
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    inline def setDescription(value: WorkspaceImageDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setErrorCode(value: WorkspaceImageErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: Description): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setImageId(value: WorkspaceImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setName(value: WorkspaceImageName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
    
    inline def setOwnerAccountId(value: AwsAccount): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    inline def setRequiredTenancy(value: WorkspaceImageRequiredTenancy): Self = StObject.set(x, "RequiredTenancy", value.asInstanceOf[js.Any])
    
    inline def setRequiredTenancyUndefined: Self = StObject.set(x, "RequiredTenancy", js.undefined)
    
    inline def setState(value: WorkspaceImageState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setUpdates(value: UpdateResult): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesUndefined: Self = StObject.set(x, "Updates", js.undefined)
  }
}
