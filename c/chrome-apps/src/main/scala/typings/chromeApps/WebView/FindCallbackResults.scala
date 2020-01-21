package typings.chromeApps.WebView

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains all of the results of the find request. */
trait FindCallbackResults extends js.Object {
  /** The ordinal number of the current match. */
  var activeMatchOrdinal: integer
  /** Indicates whether this find request was canceled. */
  var canceled: Boolean
  /** The number of times searchText was matched on the page. */
  var numberOfMatches: integer
  /** Describes a rectangle around the active match in screen coordinates. */
  var selectionRect: SelectionRect
}

object FindCallbackResults {
  @scala.inline
  def apply(
    activeMatchOrdinal: integer,
    canceled: Boolean,
    numberOfMatches: integer,
    selectionRect: SelectionRect
  ): FindCallbackResults = {
    val __obj = js.Dynamic.literal(activeMatchOrdinal = activeMatchOrdinal.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], numberOfMatches = numberOfMatches.asInstanceOf[js.Any], selectionRect = selectionRect.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FindCallbackResults]
  }
}

