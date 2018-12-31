package typings
package chromeDashAppsLib.WebViewNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a load has committed. This includes navigation within the current document as well as subframe document-level loads, but does not include asynchronous resource loads.
  */
@js.native
trait LoadCommitEvent
  extends stdLib.Event {
  /** Whether the load is top-level or in a subframe. */
  var isTopLevel: scala.Boolean = js.native
  /** The URL that committed. */
  var url: java.lang.String = js.native
}

