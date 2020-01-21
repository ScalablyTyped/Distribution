package typings.chromeApps.chrome.fileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since Chrome 44.
  */
trait Volume extends js.Object {
  /** The ID of the requested volume. */
  var volumeId: String
  /**
    * Whether the requested file system should be writable. The default is read-only.
    * @default false
    **/
  var writable: js.UndefOr[Boolean] = js.undefined
}

object Volume {
  @scala.inline
  def apply(volumeId: String, writable: js.UndefOr[Boolean] = js.undefined): Volume = {
    val __obj = js.Dynamic.literal(volumeId = volumeId.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
}

