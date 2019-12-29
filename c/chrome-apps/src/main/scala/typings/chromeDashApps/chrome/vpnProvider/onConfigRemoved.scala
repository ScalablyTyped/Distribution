package typings.chromeDashApps.chrome.vpnProvider

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Triggered when a configuration created by the extension is removed by the platform. */
@JSGlobal("chrome.vpnProvider.onConfigRemoved")
@js.native
object onConfigRemoved
  extends TopLevel[Event[js.Function1[/* id */ String, Unit]]]

