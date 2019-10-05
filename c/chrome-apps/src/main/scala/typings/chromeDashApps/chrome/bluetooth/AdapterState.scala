package typings.chromeDashApps.chrome.bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdapterState extends js.Object {
  /** The address of the adapter, in the format 'XX:XX:XX:XX:XX:XX'. */
  var address: String
  /** Indicates whether or not the adapter is available (i.e. enabled). */
  var available: Boolean
  /** Indicates whether or not the adapter is currently discovering. */
  var discovering: Boolean
  /** The human-readable name of the adapter. */
  var name: String
  /** Indicates whether or not the adapter has power. */
  var powered: Boolean
}

object AdapterState {
  @scala.inline
  def apply(address: String, available: Boolean, discovering: Boolean, name: String, powered: Boolean): AdapterState = {
    val __obj = js.Dynamic.literal(address = address, available = available, discovering = discovering, name = name, powered = powered)
  
    __obj.asInstanceOf[AdapterState]
  }
}

