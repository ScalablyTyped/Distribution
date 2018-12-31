package typings
package chromeDashAppsLib.WebViewNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a load has begun.
  */
@js.native
trait LoadStartEvent
  extends stdLib.Event {
  /** Whether the load is top-level or in a subframe. */
  var isTopLevel: scala.Boolean = js.native
  /** Requested URL. */
  var url: java.lang.String = js.native
}

