package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFileSystemResponse extends js.Object {
  /**
    * The configuration of the file system that was created.
    */
  var FileSystem: js.UndefOr[typings.awsSdk.fsxMod.FileSystem] = js.native
}

object CreateFileSystemResponse {
  @scala.inline
  def apply(FileSystem: FileSystem = null): CreateFileSystemResponse = {
    val __obj = js.Dynamic.literal()
    if (FileSystem != null) __obj.updateDynamic("FileSystem")(FileSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemResponse]
  }
}

