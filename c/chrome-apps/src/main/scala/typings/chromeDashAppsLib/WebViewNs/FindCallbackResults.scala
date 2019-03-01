package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains all of the results of the find request. */
trait FindCallbackResults extends js.Object {
  /** The ordinal number of the current match. */
  var activeMatchOrdinal: chromeDashAppsLib.chromeNs.integer
  /** Indicates whether this find request was canceled. */
  var canceled: scala.Boolean
  /** The number of times searchText was matched on the page. */
  var numberOfMatches: chromeDashAppsLib.chromeNs.integer
  /** Describes a rectangle around the active match in screen coordinates. */
  var selectionRect: SelectionRect
}

object FindCallbackResults {
  @scala.inline
  def apply(
    activeMatchOrdinal: chromeDashAppsLib.chromeNs.integer,
    canceled: scala.Boolean,
    numberOfMatches: chromeDashAppsLib.chromeNs.integer,
    selectionRect: SelectionRect
  ): FindCallbackResults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activeMatchOrdinal")(activeMatchOrdinal)
    __obj.updateDynamic("canceled")(canceled)
    __obj.updateDynamic("numberOfMatches")(numberOfMatches)
    __obj.updateDynamic("selectionRect")(selectionRect)
    __obj.asInstanceOf[FindCallbackResults]
  }
}

