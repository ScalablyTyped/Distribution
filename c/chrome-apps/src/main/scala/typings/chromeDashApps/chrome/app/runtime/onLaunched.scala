package typings.chromeDashApps.chrome.app.runtime

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when an app is launched from the launcher.
  */
@JSGlobal("chrome.app.runtime.onLaunched")
@js.native
object onLaunched
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[js.Function1[/* launchData */ LaunchData, Unit]]
    ]

