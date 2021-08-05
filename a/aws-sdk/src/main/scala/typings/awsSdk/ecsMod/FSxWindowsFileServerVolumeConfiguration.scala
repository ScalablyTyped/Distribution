package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FSxWindowsFileServerVolumeConfiguration extends StObject {
  
  /**
    * The authorization configuration details for the Amazon FSx for Windows File Server file system.
    */
  var authorizationConfig: FSxWindowsFileServerAuthorizationConfig
  
  /**
    * The Amazon FSx for Windows File Server file system ID to use.
    */
  var fileSystemId: String
  
  /**
    * The directory within the Amazon FSx for Windows File Server file system to mount as the root directory inside the host.
    */
  var rootDirectory: String
}
object FSxWindowsFileServerVolumeConfiguration {
  
  inline def apply(
    authorizationConfig: FSxWindowsFileServerAuthorizationConfig,
    fileSystemId: String,
    rootDirectory: String
  ): FSxWindowsFileServerVolumeConfiguration = {
    val __obj = js.Dynamic.literal(authorizationConfig = authorizationConfig.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], rootDirectory = rootDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSxWindowsFileServerVolumeConfiguration]
  }
  
  extension [Self <: FSxWindowsFileServerVolumeConfiguration](x: Self) {
    
    inline def setAuthorizationConfig(value: FSxWindowsFileServerAuthorizationConfig): Self = StObject.set(x, "authorizationConfig", value.asInstanceOf[js.Any])
    
    inline def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    inline def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
  }
}
