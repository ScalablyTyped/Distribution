package typings.cordovaPluginDevice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device_ extends js.Object {
  /** Indicates that Cordova initialize successfully. */
  var available: Boolean
  /** Get the version of Cordova running on the device. */
  var cordova: String
  /** Whether the device is running on a simulator. */
  var isVirtual: Boolean
  /** Get the device's manufacturer. */
  var manufacturer: String
  /**
    * The device.model returns the name of the device's model or product. The value is set
    * by the device manufacturer and may be different across versions of the same product.
    */
  var model: String
  /** Get the device's operating system name. */
  var platform: String
  /** Get the device hardware serial number. */
  var serial: String
  /** Get the device's Universally Unique Identifier (UUID). */
  var uuid: String
  /** Get the operating system version. */
  var version: String
}

object Device_ {
  @scala.inline
  def apply(
    available: Boolean,
    cordova: String,
    isVirtual: Boolean,
    manufacturer: String,
    model: String,
    platform: String,
    serial: String,
    uuid: String,
    version: String
  ): Device_ = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], cordova = cordova.asInstanceOf[js.Any], isVirtual = isVirtual.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device_]
  }
}

