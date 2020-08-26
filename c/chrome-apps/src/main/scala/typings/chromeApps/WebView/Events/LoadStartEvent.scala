package typings.chromeApps.WebView.Events

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a load has begun.
  */
@js.native
trait LoadStartEvent extends Event {
  /** Whether the load is top-level or in a subframe. */
  var isTopLevel: Boolean = js.native
  /** Requested URL. */
  var url: String = js.native
}

