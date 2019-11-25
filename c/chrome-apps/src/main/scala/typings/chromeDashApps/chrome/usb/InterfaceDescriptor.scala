package typings.chromeDashApps.chrome.usb

import typings.chromeDashApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 29. */
trait InterfaceDescriptor extends js.Object {
  /**
    * The interface alternate setting number.
    * @default 0
    */
  var alternateSetting: integer
  /** Description of the interface */
  var description: js.UndefOr[String] = js.undefined
  /** Available endpoints. */
  var endpoints: js.Array[EndpointDescriptor]
  /**
    * Extra descriptor data associated with this interface.
    * @since Chrome 39.
    */
  var extra_data: ArrayBuffer
  /** The USB interface class. */
  var interfaceClass: integer
  /** The interface number */
  var interfaceNumber: integer
  /** The USB interface protocol. */
  var interfaceProtocol: integer
  /** The USB interface sub-class. */
  var interfaceSubclass: integer
}

object InterfaceDescriptor {
  @scala.inline
  def apply(
    alternateSetting: integer,
    endpoints: js.Array[EndpointDescriptor],
    extra_data: ArrayBuffer,
    interfaceClass: integer,
    interfaceNumber: integer,
    interfaceProtocol: integer,
    interfaceSubclass: integer,
    description: String = null
  ): InterfaceDescriptor = {
    val __obj = js.Dynamic.literal(alternateSetting = alternateSetting.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], extra_data = extra_data.asInstanceOf[js.Any], interfaceClass = interfaceClass.asInstanceOf[js.Any], interfaceNumber = interfaceNumber.asInstanceOf[js.Any], interfaceProtocol = interfaceProtocol.asInstanceOf[js.Any], interfaceSubclass = interfaceSubclass.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceDescriptor]
  }
}

