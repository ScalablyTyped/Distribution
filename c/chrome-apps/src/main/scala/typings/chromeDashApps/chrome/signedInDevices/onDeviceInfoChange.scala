package typings.chromeDashApps.chrome.signedInDevices

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the DeviceInfo object of any of the signed in devices
  * changes, or when a device is added or removed.
  * Provides *devices*:
  * The array of all signed in devices.
  */
@JSGlobal("chrome.signedInDevices.onDeviceInfoChange")
@js.native
object onDeviceInfoChange
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[js.Function1[/* devices */ js.Array[DeviceInfo], Unit]]
    ]

