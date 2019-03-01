package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmountOptions extends js.Object {
  /** The identifier of the file system to be unmounted. */
  var fileSystemId: java.lang.String
}

object UnmountOptions {
  @scala.inline
  def apply(fileSystemId: java.lang.String): UnmountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.asInstanceOf[UnmountOptions]
  }
}

