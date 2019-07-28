package typings.chromeDashApps.chromeNs.appNs

import org.scalablytyped.runtime.StringDictionary
import typings.chromeDashApps.chromeNs.integer
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

