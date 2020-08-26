package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootDirectory extends js.Object {
  /**
    * (Optional) Specifies the POSIX IDs and permissions to apply to the access point's RootDirectory. If the RootDirectory &gt; Path specified does not exist, EFS creates the root directory using the CreationInfo settings when a client connects to an access point. When specifying the CreationInfo, you must provide values for all properties.   If you do not provide CreationInfo and the specified RootDirectory &gt; Path does not exist, attempts to mount the file system using the access point will fail. 
    */
  var CreationInfo: js.UndefOr[typings.awsSdk.efsMod.CreationInfo] = js.native
  /**
    * Specifies the path on the EFS file system to expose as the root directory to NFS clients using the access point to access the EFS file system. A path can have up to four subdirectories. If the specified path does not exist, you are required to provide the CreationInfo.
    */
  var Path: js.UndefOr[typings.awsSdk.efsMod.Path] = js.native
}

object RootDirectory {
  @scala.inline
  def apply(): RootDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootDirectory]
  }
  @scala.inline
  implicit class RootDirectoryOps[Self <: RootDirectory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationInfo(value: CreationInfo): Self = this.set("CreationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationInfo: Self = this.set("CreationInfo", js.undefined)
    @scala.inline
    def setPath(value: Path): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
  }
  
}

