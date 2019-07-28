package typings.chromeDashApps.chromeNs.usbNs

import typings.chromeDashApps.chromeNs.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 39. */
trait ConfigDescriptor extends js.Object {
  /**
    * Is this the active configuration?
    * @since Chrome 47.
    */
  var active: Boolean
  /** The configuration number. */
  var configurationValue: integer
  /** Description of the configuration. */
  var description: js.UndefOr[String] = js.undefined
  /** Extra descriptor data associated with this configuration. */
  var extra_data: ArrayBuffer
  /** Available interfaces. */
  var interfaces: js.Array[InterfaceDescriptor]
  /** The maximum power needed by this device in milliamps (mA). */
  var maxPower: integer
  /** The device supports remote wakeup. */
  var remoteWakeup: Boolean
  /** The device is self-powered. */
  var selfPowered: Boolean
}

object ConfigDescriptor {
  @scala.inline
  def apply(
    active: Boolean,
    configurationValue: integer,
    extra_data: ArrayBuffer,
    interfaces: js.Array[InterfaceDescriptor],
    maxPower: integer,
    remoteWakeup: Boolean,
    selfPowered: Boolean,
    description: String = null
  ): ConfigDescriptor = {
    val __obj = js.Dynamic.literal(active = active, configurationValue = configurationValue, extra_data = extra_data, interfaces = interfaces, maxPower = maxPower, remoteWakeup = remoteWakeup, selfPowered = selfPowered)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ConfigDescriptor]
  }
}

