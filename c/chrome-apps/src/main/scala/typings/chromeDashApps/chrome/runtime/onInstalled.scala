package typings.chromeDashApps.chrome.runtime

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when the extension is first installed, when the extension is updated to a new version, and when Chrome is updated to a new version. */
@JSGlobal("chrome.runtime.onInstalled")
@js.native
object onInstalled
  extends TopLevel[Event[js.Function1[/* details */ InstalledDetails, Unit]]]

