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

object InterfaceDescriptor {
  @scala.inline
  def apply(
    alternateSetting: chromeDashAppsLib.chromeNs.integer,
    endpoints: js.Array[EndpointDescriptor],
    extra_data: stdLib.ArrayBuffer,
    interfaceClass: chromeDashAppsLib.chromeNs.integer,
    interfaceNumber: chromeDashAppsLib.chromeNs.integer,
    interfaceProtocol: chromeDashAppsLib.chromeNs.integer,
    interfaceSubclass: chromeDashAppsLib.chromeNs.integer,
    description: java.lang.String = null
  ): InterfaceDescriptor = {
    val __obj = js.Dynamic.literal(alternateSetting = alternateSetting, endpoints = endpoints, extra_data = extra_data, interfaceClass = interfaceClass, interfaceNumber = interfaceNumber, interfaceProtocol = interfaceProtocol, interfaceSubclass = interfaceSubclass)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[InterfaceDescriptor]
  }
}

