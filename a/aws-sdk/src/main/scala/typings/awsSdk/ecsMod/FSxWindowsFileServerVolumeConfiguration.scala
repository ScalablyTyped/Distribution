package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FSxWindowsFileServerVolumeConfiguration extends js.Object {
  
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
  implicit class FSxWindowsFileServerVolumeConfigurationOps[Self <: FSxWindowsFileServerVolumeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthorizationConfig(value: FSxWindowsFileServerAuthorizationConfig): Self = this.set("authorizationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemId(value: String): Self = this.set("fileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDirectory(value: String): Self = this.set("rootDirectory", value.asInstanceOf[js.Any])
  }
}
