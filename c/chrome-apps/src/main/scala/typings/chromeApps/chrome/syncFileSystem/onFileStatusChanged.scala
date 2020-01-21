package typings.chromeApps.chrome.syncFileSystem

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a file has been updated by the background sync service. */
@JSGlobal("chrome.syncFileSystem.onFileStatusChanged")
@js.native
object onFileStatusChanged
  extends TopLevel[Event[js.Function1[/* detail */ FileStatusChangedDetail, Unit]]]

