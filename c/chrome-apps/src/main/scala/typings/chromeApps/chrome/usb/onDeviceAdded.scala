package typings.chromeApps.chrome.usb

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event generated when a device is added to the system.
  * Events are only broadcast to apps that have permission to access the device.
  * Permission may have been granted at install time, when the user accepted an optional permission
  * (@see[permissions.request]{https://developer.chrome.com/apps/permissions#method-request}),
  * or through **getUserSelectedDevices**.
  * @since Chrome 42.
  */
@JSGlobal("chrome.usb.onDeviceAdded")
@js.native
object onDeviceAdded extends TopLevel[DeviceEvent]

