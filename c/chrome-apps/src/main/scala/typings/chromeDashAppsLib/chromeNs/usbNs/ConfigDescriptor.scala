package typings
package chromeDashAppsLib.chromeNs.usbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 39. */
trait ConfigDescriptor extends js.Object {
  /**
    * Is this the active configuration?
    * @since Chrome 47.
    */
  var active: scala.Boolean
  /** The configuration number. */
  var configurationValue: chromeDashAppsLib.chromeNs.integer
  /** Description of the configuration. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Extra descriptor data associated with this configuration. */
  var extra_data: stdLib.ArrayBuffer
  /** Available interfaces. */
  var interfaces: js.Array[InterfaceDescriptor]
  /** The maximum power needed by this device in milliamps (mA). */
  var maxPower: chromeDashAppsLib.chromeNs.integer
  /** The device supports remote wakeup. */
  var remoteWakeup: scala.Boolean
  /** The device is self-powered. */
  var selfPowered: scala.Boolean
}

