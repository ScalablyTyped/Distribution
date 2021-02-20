package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FSxWindowsFileServerVolumeConfiguration extends StObject {
  
  /**
    * The authorization configuration details for the Amazon FSx for Windows File Server file system.
    */
  var authorizationConfig: FSxWindowsFileServerAuthorizationConfig = js.native
  
  /**
    * The Amazon FSx for Windows File Server file system ID to use.
    */
  var fileSystemId: String = js.native
  
  /**
    * The directory within the Amazon FSx for Windows File Server file system to mount as the root directory inside the host.
    */
  var rootDirectory: String = js.native
}
object FSxWindowsFileServerVolumeConfiguration {
  
  @scala.inline
  def apply(
    authorizationConfig: FSxWindowsFileServerAuthorizationConfig,
    fileSystemId: String,
    rootDirectory: String
  ): FSxWindowsFileServerVolumeConfiguration = {
    val __obj = js.Dynamic.literal(authorizationConfig = authorizationConfig.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], rootDirectory = rootDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSxWindowsFileServerVolumeConfiguration]
  }
  
  @scala.inline
  implicit class FSxWindowsFileServerVolumeConfigurationMutableBuilder[Self <: FSxWindowsFileServerVolumeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationConfig(value: FSxWindowsFileServerAuthorizationConfig): Self = StObject.set(x, "authorizationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
  }
}
