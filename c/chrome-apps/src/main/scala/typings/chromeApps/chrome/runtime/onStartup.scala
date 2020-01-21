package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a profile that has this app installed first starts up. This event is not fired when an incognito profile is started, even if this app is operating in 'split' incognito mode.
  * @since Chrome 23.
  */
@JSGlobal("chrome.runtime.onStartup")
@js.native
object onStartup extends TopLevel[RuntimeEvent]

