package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkspaceImageResult extends StObject {
  
  /**
    * The date when the image was created.
    */
  var Created: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the image.
    */
  var Description: js.UndefOr[WorkspaceImageDescription] = js.undefined
  
  /**
    * The identifier of the new WorkSpace image.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
  
  /**
    * The name of the image.
    */
  var Name: js.UndefOr[WorkspaceImageName] = js.undefined
  
  /**
    * The operating system that the image is running.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.OperatingSystem] = js.undefined
  
  /**
    * The identifier of the Amazon Web Services account that owns the image.
    */
  var OwnerAccountId: js.UndefOr[AwsAccount] = js.undefined
  
  /**
    * Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is enabled, this value is set to DEDICATED. For more information, see  Bring Your Own Windows Desktop Images..
    */
  var RequiredTenancy: js.UndefOr[WorkspaceImageRequiredTenancy] = js.undefined
  
  /**
    * The availability status of the image.
    */
  var State: js.UndefOr[WorkspaceImageState] = js.undefined
}
object CreateWorkspaceImageResult {
  
  inline def apply(): CreateWorkspaceImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkspaceImageResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorkspaceImageResult] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    inline def setDescription(value: WorkspaceImageDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
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
  }
}
