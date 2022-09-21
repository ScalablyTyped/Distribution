package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPointDescription extends StObject {
  
  /**
    * The unique Amazon Resource Name (ARN) associated with the access point.
    */
  var AccessPointArn: js.UndefOr[typings.awsSdk.efsMod.AccessPointArn] = js.undefined
  
  /**
    * The ID of the access point, assigned by Amazon EFS.
    */
  var AccessPointId: js.UndefOr[typings.awsSdk.efsMod.AccessPointId] = js.undefined
  
  /**
    * The opaque string specified in the request to ensure idempotent creation.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.efsMod.ClientToken] = js.undefined
  
  /**
    * The ID of the EFS file system that the access point applies to.
    */
  var FileSystemId: js.UndefOr[typings.awsSdk.efsMod.FileSystemId] = js.undefined
  
  /**
    * Identifies the lifecycle phase of the access point.
    */
  var LifeCycleState: js.UndefOr[typings.awsSdk.efsMod.LifeCycleState] = js.undefined
  
  /**
    * The name of the access point. This is the value of the Name tag.
    */
  var Name: js.UndefOr[typings.awsSdk.efsMod.Name] = js.undefined
  
  /**
    * Identified the Amazon Web Services account that owns the access point resource.
    */
  var OwnerId: js.UndefOr[AwsAccountId] = js.undefined
  
  /**
    * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point that is used for all file operations by NFS clients using the access point.
    */
  var PosixUser: js.UndefOr[typings.awsSdk.efsMod.PosixUser] = js.undefined
  
  /**
    * The directory on the Amazon EFS file system that the access point exposes as the root directory to NFS clients using the access point.
    */
  var RootDirectory: js.UndefOr[typings.awsSdk.efsMod.RootDirectory] = js.undefined
  
  /**
    * The tags associated with the access point, presented as an array of Tag objects.
    */
  var Tags: js.UndefOr[typings.awsSdk.efsMod.Tags] = js.undefined
}
object AccessPointDescription {
  
  inline def apply(): AccessPointDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPointDescription]
  }
  
  extension [Self <: AccessPointDescription](x: Self) {
    
    inline def setAccessPointArn(value: AccessPointArn): Self = StObject.set(x, "AccessPointArn", value.asInstanceOf[js.Any])
    
    inline def setAccessPointArnUndefined: Self = StObject.set(x, "AccessPointArn", js.undefined)
    
    inline def setAccessPointId(value: AccessPointId): Self = StObject.set(x, "AccessPointId", value.asInstanceOf[js.Any])
    
    inline def setAccessPointIdUndefined: Self = StObject.set(x, "AccessPointId", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    inline def setLifeCycleState(value: LifeCycleState): Self = StObject.set(x, "LifeCycleState", value.asInstanceOf[js.Any])
    
    inline def setLifeCycleStateUndefined: Self = StObject.set(x, "LifeCycleState", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwnerId(value: AwsAccountId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setPosixUser(value: PosixUser): Self = StObject.set(x, "PosixUser", value.asInstanceOf[js.Any])
    
    inline def setPosixUserUndefined: Self = StObject.set(x, "PosixUser", js.undefined)
    
    inline def setRootDirectory(value: RootDirectory): Self = StObject.set(x, "RootDirectory", value.asInstanceOf[js.Any])
    
    inline def setRootDirectoryUndefined: Self = StObject.set(x, "RootDirectory", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
