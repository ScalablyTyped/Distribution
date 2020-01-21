package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptSharedDirectoryResult extends js.Object {
  /**
    * The shared directory in the directory consumer account.
    */
  var SharedDirectory: js.UndefOr[typings.awsSdk.directoryserviceMod.SharedDirectory] = js.native
}

object AcceptSharedDirectoryResult {
  @scala.inline
  def apply(SharedDirectory: SharedDirectory = null): AcceptSharedDirectoryResult = {
    val __obj = js.Dynamic.literal()
    if (SharedDirectory != null) __obj.updateDynamic("SharedDirectory")(SharedDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptSharedDirectoryResult]
  }
}

