package typings.chromeDashApps.chrome.hid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event generated when a device is added to the system.
  * Events are only broadcast to apps that
  * have permission to access the device. Permission may
  * have been granted at install time or when the user
  * accepted an optional permission.
  * @since Chrome 41.
  * @see[permissions.request]{@link https://developer.chrome.com/apps/permissions#method-request}
  */
@JSGlobal("chrome.hid.onDeviceAdded")
@js.native
object onDeviceAdded
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[js.Function1[/* device */ HidDeviceInfo, Unit]]
    ]

