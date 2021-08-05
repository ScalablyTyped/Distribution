package typings.chromeApps.WebView

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains all of the results of the find request. */
trait FindCallbackResults extends StObject {
  
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
  
  inline def apply(
    activeMatchOrdinal: integer,
    canceled: Boolean,
    numberOfMatches: integer,
    selectionRect: SelectionRect
  ): FindCallbackResults = {
    val __obj = js.Dynamic.literal(activeMatchOrdinal = activeMatchOrdinal.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], numberOfMatches = numberOfMatches.asInstanceOf[js.Any], selectionRect = selectionRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindCallbackResults]
  }
  
  extension [Self <: FindCallbackResults](x: Self) {
    
    inline def setActiveMatchOrdinal(value: integer): Self = StObject.set(x, "activeMatchOrdinal", value.asInstanceOf[js.Any])
    
    inline def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMatches(value: integer): Self = StObject.set(x, "numberOfMatches", value.asInstanceOf[js.Any])
    
    inline def setSelectionRect(value: SelectionRect): Self = StObject.set(x, "selectionRect", value.asInstanceOf[js.Any])
  }
}
