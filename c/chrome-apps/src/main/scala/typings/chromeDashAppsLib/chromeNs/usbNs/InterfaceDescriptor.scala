package typings
package chromeDashAppsLib.chromeNs.usbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 29. */

trait InterfaceDescriptor extends js.Object {
  /**
               * The interface alternate setting number.
               * @default 0
               */
  var alternateSetting: chromeDashAppsLib.chromeNs.integer
  /** Description of the interface */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Available endpoints. */
  var endpoints: js.Array[EndpointDescriptor]
  /**
               * Extra descriptor data associated with this interface.
               * @since Chrome 39.
               */
  var extra_data: stdLib.ArrayBuffer
  /** The USB interface class. */
  var interfaceClass: chromeDashAppsLib.chromeNs.integer
  /** The interface number */
  var interfaceNumber: chromeDashAppsLib.chromeNs.integer
  /** The USB interface protocol. */
  var interfaceProtocol: chromeDashAppsLib.chromeNs.integer
  /** The USB interface sub-class. */
  var interfaceSubclass: chromeDashAppsLib.chromeNs.integer
}

