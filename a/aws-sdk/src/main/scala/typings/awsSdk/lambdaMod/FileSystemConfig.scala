package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemConfig extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access to the file system.
    */
  var Arn: FileSystemArn = js.native
  
  /**
    * The path where the function can access the file system, starting with /mnt/.
    */
  var LocalMountPath: typings.awsSdk.lambdaMod.LocalMountPath = js.native
}
object FileSystemConfig {
  
  @scala.inline
  def apply(Arn: FileSystemArn, LocalMountPath: LocalMountPath): FileSystemConfig = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], LocalMountPath = LocalMountPath.asInstanceOf[js.Any])
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
    def setArn(value: FileSystemArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalMountPath(value: LocalMountPath): Self = this.set("LocalMountPath", value.asInstanceOf[js.Any])
  }
}
