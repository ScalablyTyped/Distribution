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

object ConfigDescriptor {
  @scala.inline
  def apply(
    active: scala.Boolean,
    configurationValue: chromeDashAppsLib.chromeNs.integer,
    extra_data: stdLib.ArrayBuffer,
    interfaces: js.Array[InterfaceDescriptor],
    maxPower: chromeDashAppsLib.chromeNs.integer,
    remoteWakeup: scala.Boolean,
    selfPowered: scala.Boolean,
    description: java.lang.String = null
  ): ConfigDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("configurationValue")(configurationValue)
    __obj.updateDynamic("extra_data")(extra_data)
    __obj.updateDynamic("interfaces")(interfaces)
    __obj.updateDynamic("maxPower")(maxPower)
    __obj.updateDynamic("remoteWakeup")(remoteWakeup)
    __obj.updateDynamic("selfPowered")(selfPowered)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ConfigDescriptor]
  }
}

