package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceBundle extends StObject {
  
  /**
    * The bundle identifier.
    */
  var BundleId: js.UndefOr[typings.awsSdk.workspacesMod.BundleId] = js.undefined
  
  /**
    * The compute type. For more information, see Amazon WorkSpaces Bundles.
    */
  var ComputeType: js.UndefOr[typings.awsSdk.workspacesMod.ComputeType] = js.undefined
  
  /**
    * A description.
    */
  var Description: js.UndefOr[typings.awsSdk.workspacesMod.Description] = js.undefined
  
  /**
    * The image identifier of the bundle.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
  
  /**
    * The last time that the bundle was updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the bundle.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The owner of the bundle. This is the account identifier of the owner, or AMAZON if the bundle is provided by AWS.
    */
  var Owner: js.UndefOr[BundleOwner] = js.undefined
  
  /**
    * The size of the root volume.
    */
  var RootStorage: js.UndefOr[typings.awsSdk.workspacesMod.RootStorage] = js.undefined
  
  /**
    * The size of the user storage.
    */
  var UserStorage: js.UndefOr[typings.awsSdk.workspacesMod.UserStorage] = js.undefined
}
object WorkspaceBundle {
  
  inline def apply(): WorkspaceBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceBundle]
  }
  
  extension [Self <: WorkspaceBundle](x: Self) {
    
    inline def setBundleId(value: BundleId): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "BundleId", js.undefined)
    
    inline def setComputeType(value: ComputeType): Self = StObject.set(x, "ComputeType", value.asInstanceOf[js.Any])
    
    inline def setComputeTypeUndefined: Self = StObject.set(x, "ComputeType", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setImageId(value: WorkspaceImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setLastUpdatedTime(value: Timestamp): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
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
