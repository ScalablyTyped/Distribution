package typings.chromeApps.chrome.usb

import typings.chromeApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 39. */
@js.native
trait ConfigDescriptor extends js.Object {
  /**
    * Is this the active configuration?
    * @since Chrome 47.
    */
  var active: Boolean = js.native
  /** The configuration number. */
  var configurationValue: integer = js.native
  /** Description of the configuration. */
  var description: js.UndefOr[String] = js.native
  /** Extra descriptor data associated with this configuration. */
  var extra_data: ArrayBuffer = js.native
  /** Available interfaces. */
  var interfaces: js.Array[InterfaceDescriptor] = js.native
  /** The maximum power needed by this device in milliamps (mA). */
  var maxPower: integer = js.native
  /** The device supports remote wakeup. */
  var remoteWakeup: Boolean = js.native
  /** The device is self-powered. */
  var selfPowered: Boolean = js.native
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
    selfPowered: Boolean
  ): ConfigDescriptor = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], configurationValue = configurationValue.asInstanceOf[js.Any], extra_data = extra_data.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], maxPower = maxPower.asInstanceOf[js.Any], remoteWakeup = remoteWakeup.asInstanceOf[js.Any], selfPowered = selfPowered.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigDescriptor]
  }
  @scala.inline
  implicit class ConfigDescriptorOps[Self <: ConfigDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationValue(value: integer): Self = this.set("configurationValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtra_data(value: ArrayBuffer): Self = this.set("extra_data", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterfacesVarargs(value: InterfaceDescriptor*): Self = this.set("interfaces", js.Array(value :_*))
    @scala.inline
    def setInterfaces(value: js.Array[InterfaceDescriptor]): Self = this.set("interfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxPower(value: integer): Self = this.set("maxPower", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteWakeup(value: Boolean): Self = this.set("remoteWakeup", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelfPowered(value: Boolean): Self = this.set("selfPowered", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

