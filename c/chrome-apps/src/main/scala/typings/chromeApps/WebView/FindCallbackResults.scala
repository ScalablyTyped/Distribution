package typings.chromeApps.WebView

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains all of the results of the find request. */
@js.native
trait FindCallbackResults extends StObject {
  
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
  implicit class FindCallbackResultsMutableBuilder[Self <: FindCallbackResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveMatchOrdinal(value: integer): Self = StObject.set(x, "activeMatchOrdinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfMatches(value: integer): Self = StObject.set(x, "numberOfMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionRect(value: SelectionRect): Self = StObject.set(x, "selectionRect", value.asInstanceOf[js.Any])
  }
}
