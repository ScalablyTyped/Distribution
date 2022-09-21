package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedFileSystemConfiguration extends StObject {
  
  /**
    * The endpoint of the shared file system that is accessed by the studio component resource.
    */
  var endpoint: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * The unique identifier for a file system.
    */
  var fileSystemId: js.UndefOr[String] = js.undefined
  
  /**
    * The mount location for a shared file system on a Linux virtual workstation.
    */
  var linuxMountPoint: js.UndefOr[LinuxMountPoint] = js.undefined
  
  /**
    * The name of the file share.
    */
  var shareName: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * The mount location for a shared file system on a Windows virtual workstation.
    */
  var windowsMountDrive: js.UndefOr[WindowsMountDrive] = js.undefined
}
object SharedFileSystemConfiguration {
  
  inline def apply(): SharedFileSystemConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedFileSystemConfiguration]
  }
  
  extension [Self <: SharedFileSystemConfiguration](x: Self) {
    
    inline def setEndpoint(value: SensitiveString): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    inline def setFileSystemIdUndefined: Self = StObject.set(x, "fileSystemId", js.undefined)
    
    inline def setLinuxMountPoint(value: LinuxMountPoint): Self = StObject.set(x, "linuxMountPoint", value.asInstanceOf[js.Any])
    
    inline def setLinuxMountPointUndefined: Self = StObject.set(x, "linuxMountPoint", js.undefined)
    
    inline def setShareName(value: SensitiveString): Self = StObject.set(x, "shareName", value.asInstanceOf[js.Any])
    
    inline def setShareNameUndefined: Self = StObject.set(x, "shareName", js.undefined)
    
    inline def setWindowsMountDrive(value: WindowsMountDrive): Self = StObject.set(x, "windowsMountDrive", value.asInstanceOf[js.Any])
    
    inline def setWindowsMountDriveUndefined: Self = StObject.set(x, "windowsMountDrive", js.undefined)
  }
}
