package typings.chromeApps.chrome.hid

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event generated when a device is removed from the system.
  * The callback will contain the deviceId property of the device passed to onDeviceAdded.
  * @since Chrome 41.
  * @see[See onDeviceAdded for which events are delivered]{@link https://developer.chrome.com/apps/hid#event-onDeviceAdded}.
  */
@JSGlobal("chrome.hid.onDeviceRemoved")
@js.native
object onDeviceRemoved
  extends TopLevel[Event[js.Function1[/* deviceId */ integer, Unit]]]

