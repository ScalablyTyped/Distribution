package typings.chromeApps.chrome.app

import org.scalablytyped.runtime.StringDictionary
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowParams
  extends AppWindow
     with /* key */ StringDictionary[js.Any] {
  var existingWindow: js.UndefOr[Boolean] = js.native
  var frameId: js.UndefOr[integer] = js.native
}

