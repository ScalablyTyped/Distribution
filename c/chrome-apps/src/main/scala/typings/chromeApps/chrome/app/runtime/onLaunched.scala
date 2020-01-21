package typings.chromeApps.chrome.app.runtime

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when an app is launched from the launcher.
  */
@JSGlobal("chrome.app.runtime.onLaunched")
@js.native
object onLaunched
  extends TopLevel[Event[js.Function1[/* launchData */ LaunchData, Unit]]]

