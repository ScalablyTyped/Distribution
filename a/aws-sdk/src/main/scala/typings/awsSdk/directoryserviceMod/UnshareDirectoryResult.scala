package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnshareDirectoryResult extends js.Object {
  /**
    * Identifier of the directory stored in the directory consumer account that is to be unshared from the specified directory (DirectoryId).
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.native
}

object UnshareDirectoryResult {
  @scala.inline
  def apply(SharedDirectoryId: DirectoryId = null): UnshareDirectoryResult = {
    val __obj = js.Dynamic.literal()
    if (SharedDirectoryId != null) __obj.updateDynamic("SharedDirectoryId")(SharedDirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnshareDirectoryResult]
  }
}

