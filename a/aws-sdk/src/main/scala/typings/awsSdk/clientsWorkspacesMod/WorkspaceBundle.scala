package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceBundle extends StObject {
  
  /**
    * The identifier of the bundle.
    */
  var BundleId: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.BundleId] = js.undefined
  
  /**
    * The compute type of the bundle. For more information, see Amazon WorkSpaces Bundles.
    */
  var ComputeType: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.ComputeType] = js.undefined
  
  /**
    * The time when the bundle was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the bundle.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.Description] = js.undefined
  
  /**
    * The identifier of the image that was used to create the bundle.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
  
  /**
    * The last time that the bundle was updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the bundle.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The owner of the bundle. This is the account identifier of the owner, or AMAZON if the bundle is provided by Amazon Web Services.
    */
  var Owner: js.UndefOr[BundleOwner] = js.undefined
  
  /**
    * The size of the root volume.
    */
  var RootStorage: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.RootStorage] = js.undefined
  
  /**
    * The size of the user volume.
    */
  var UserStorage: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.UserStorage] = js.undefined
}
object WorkspaceBundle {
  
  inline def apply(): WorkspaceBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceBundle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceBundle] (val x: Self) extends AnyVal {
    
    inline def setBundleId(value: BundleId): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "BundleId", js.undefined)
    
    inline def setComputeType(value: ComputeType): Self = StObject.set(x, "ComputeType", value.asInstanceOf[js.Any])
    
    inline def setComputeTypeUndefined: Self = StObject.set(x, "ComputeType", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setImageId(value: WorkspaceImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwner(value: BundleOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setRootStorage(value: RootStorage): Self = StObject.set(x, "RootStorage", value.asInstanceOf[js.Any])
    
    inline def setRootStorageUndefined: Self = StObject.set(x, "RootStorage", js.undefined)
    
    inline def setUserStorage(value: UserStorage): Self = StObject.set(x, "UserStorage", value.asInstanceOf[js.Any])
    
    inline def setUserStorageUndefined: Self = StObject.set(x, "UserStorage", js.undefined)
  }
}
