package typings
package chromeDashAppsLib.chromeNs.bluetoothNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AdapterState extends js.Object {
  /** The address of the adapter, in the format 'XX:XX:XX:XX:XX:XX'. */
  var address: java.lang.String
  /** Indicates whether or not the adapter is available (i.e. enabled). */
  var available: scala.Boolean
  /** Indicates whether or not the adapter is currently discovering. */
  var discovering: scala.Boolean
  /** The human-readable name of the adapter. */
  var name: java.lang.String
  /** Indicates whether or not the adapter has power. */
  var powered: scala.Boolean
}

