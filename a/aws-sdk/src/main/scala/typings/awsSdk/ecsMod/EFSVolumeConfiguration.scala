package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EFSVolumeConfiguration extends js.Object {
  /**
    * The Amazon EFS file system ID to use.
    */
  var fileSystemId: String = js.native
  /**
    * The directory within the Amazon EFS file system to mount as the root directory inside the host.
    */
  var rootDirectory: js.UndefOr[String] = js.native
}

object EFSVolumeConfiguration {
  @scala.inline
  def apply(fileSystemId: String, rootDirectory: String = null): EFSVolumeConfiguration = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
    if (rootDirectory != null) __obj.updateDynamic("rootDirectory")(rootDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[EFSVolumeConfiguration]
  }
}

