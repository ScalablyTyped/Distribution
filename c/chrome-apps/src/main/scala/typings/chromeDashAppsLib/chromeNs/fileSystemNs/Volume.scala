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

