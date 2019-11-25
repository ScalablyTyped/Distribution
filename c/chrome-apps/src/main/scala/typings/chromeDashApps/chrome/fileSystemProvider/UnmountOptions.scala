package typings.chromeDashApps.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmountOptions extends js.Object {
  /** The identifier of the file system to be unmounted. */
  var fileSystemId: String
}

object UnmountOptions {
  @scala.inline
  def apply(fileSystemId: String): UnmountOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnmountOptions]
  }
}

