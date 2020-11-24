package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemConfig extends js.Object {
  
  /**
    * The default POSIX group ID (GID). If not specified, defaults to 100.
    */
  var DefaultGid: js.UndefOr[typings.awsSdk.sagemakerMod.DefaultGid] = js.native
  
  /**
    * The default POSIX user ID (UID). If not specified, defaults to 1000.
    */
  var DefaultUid: js.UndefOr[typings.awsSdk.sagemakerMod.DefaultUid] = js.native
  
  /**
    * The path within the image to mount the user's EFS home directory. The directory should be empty. If not specified, defaults to /home/sagemaker-user.
    */
  var MountPath: js.UndefOr[typings.awsSdk.sagemakerMod.MountPath] = js.native
}
object FileSystemConfig {
  
  @scala.inline
  def apply(): FileSystemConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemConfig]
  }
  
  @scala.inline
  implicit class FileSystemConfigOps[Self <: FileSystemConfig] (val x: Self) extends AnyVal {
    
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
    def setDefaultGid(value: DefaultGid): Self = this.set("DefaultGid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultGid: Self = this.set("DefaultGid", js.undefined)
    
    @scala.inline
    def setDefaultUid(value: DefaultUid): Self = this.set("DefaultUid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultUid: Self = this.set("DefaultUid", js.undefined)
    
    @scala.inline
    def setMountPath(value: MountPath): Self = this.set("MountPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountPath: Self = this.set("MountPath", js.undefined)
  }
}
