package typings.chromeApps.global.chrome.networking.onc

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the list of networks has changed. Sends a complete list of GUIDs for all the current networks.
  */
@JSGlobal("chrome.networking.onc.onNetworkListChanged")
@js.native
object onNetworkListChanged
  extends TopLevel[Event[js.Function1[/* changes */ js.Array[String], Unit]]]

