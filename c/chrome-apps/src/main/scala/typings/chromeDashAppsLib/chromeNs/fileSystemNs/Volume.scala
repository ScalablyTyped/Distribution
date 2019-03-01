package typings
package chromeDashAppsLib.chromeNs.fileSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since Chrome 44.
  */
trait Volume extends js.Object {
  /** The ID of the requested volume. */
  var volumeId: java.lang.String
  /**
    * Whether the requested file system should be writable. The default is read-only.
    * @default false
    **/
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}

object Volume {
  @scala.inline
  def apply(volumeId: java.lang.String, writable: js.UndefOr[scala.Boolean] = js.undefined): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("volumeId")(volumeId)
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[Volume]
  }
}

