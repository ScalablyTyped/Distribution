package typings
package cordovaDashPluginDashDeviceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /** Indicates that Cordova initialize successfully. */
  var available: scala.Boolean
  /** Get the version of Cordova running on the device. */
  var cordova: java.lang.String
  /** Whether the device is running on a simulator. */
  var isVirtual: scala.Boolean
  /** Get the device's manufacturer. */
  var manufacturer: java.lang.String
  /**
    * The device.model returns the name of the device's model or product. The value is set
    * by the device manufacturer and may be different across versions of the same product.
    */
  var model: java.lang.String
  /** Get the device's operating system name. */
  var platform: java.lang.String
  /** Get the device hardware serial number. */
  var serial: java.lang.String
  /** Get the device's Universally Unique Identifier (UUID). */
  var uuid: java.lang.String
  /** Get the operating system version. */
  var version: java.lang.String
}

