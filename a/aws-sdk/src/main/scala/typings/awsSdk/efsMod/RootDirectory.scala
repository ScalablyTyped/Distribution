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
  def apply(CreationInfo: CreationInfo = null, Path: Path = null): RootDirectory = {
    val __obj = js.Dynamic.literal()
    if (CreationInfo != null) __obj.updateDynamic("CreationInfo")(CreationInfo.asInstanceOf[js.Any])
    if (Path != null) __obj.updateDynamic("Path")(Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootDirectory]
  }
}

