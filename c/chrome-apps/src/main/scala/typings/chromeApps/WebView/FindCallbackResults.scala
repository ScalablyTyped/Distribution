package typings.chromeApps.WebView

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains all of the results of the find request. */
@js.native
trait FindCallbackResults extends js.Object {
  
  /** The ordinal number of the current match. */
  var activeMatchOrdinal: integer = js.native
  
  /** Indicates whether this find request was canceled. */
  var canceled: Boolean = js.native
  
  /** The number of times searchText was matched on the page. */
  var numberOfMatches: integer = js.native
  
  /** Describes a rectangle around the active match in screen coordinates. */
  var selectionRect: SelectionRect = js.native
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
  
  @scala.inline
  implicit class FindCallbackResultsOps[Self <: FindCallbackResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveMatchOrdinal(value: integer): Self = this.set("activeMatchOrdinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanceled(value: Boolean): Self = this.set("canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfMatches(value: integer): Self = this.set("numberOfMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionRect(value: SelectionRect): Self = this.set("selectionRect", value.asInstanceOf[js.Any])
  }
}
