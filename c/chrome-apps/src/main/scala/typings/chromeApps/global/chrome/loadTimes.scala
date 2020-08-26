package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.deprecatedButUsable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.loadTimes")
@js.native
object loadTimes extends js.Object {
  /**
    * @deprecated Deprecated in Chrome 64.
    * chrome.loadTimes() is a non-standard API that exposes loading metrics
    * and network information to developers in order to help them better
    * understand their site's performance in the real world.
    * @see[Use this instead]{@link https://www.w3.org/TR/navigation-timing-2/}
    * @see[Deprecation article]{@link https://developers.google.com/web/updates/2017/12/chrome-loadtimes-deprecated}
    */
  def apply(): deprecatedButUsable = js.native
}

