package typings
package chromeDashAppsLib.WebViewNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when the page's zoom changes. */
@js.native
trait ZoomChangeEvent
  extends stdLib.Event {
  /** The new zoom factor that the page was zoomed to. */
  var newzoomFactor: chromeDashAppsLib.chromeNs.double = js.native
  /** The page's previous zoom factor. */
  var oldzoomFactor: chromeDashAppsLib.chromeNs.double = js.native
}

