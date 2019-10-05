package typings.chromeDashApps.WebView.Events

import typings.chromeDashApps.chrome.double
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when the page's zoom changes. */
@js.native
trait ZoomChangeEvent extends Event {
  /** The new zoom factor that the page was zoomed to. */
  var newzoomFactor: double = js.native
  /** The page's previous zoom factor. */
  var oldzoomFactor: double = js.native
}

