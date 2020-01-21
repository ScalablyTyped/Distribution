package typings.chromeApps.chrome.system.storage

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a removable storage is detached from the system. */
@JSGlobal("chrome.system.storage.onDetached")
@js.native
object onDetached
  extends TopLevel[Event[js.Function1[/* id */ String, Unit]]]

