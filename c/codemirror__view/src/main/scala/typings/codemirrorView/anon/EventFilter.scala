package typings.codemirrorView.anon

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventFilter extends StObject {
  
  /**
    A custom predicate function, which takes a `mousedown` event and
    returns true if it should be used for rectangular selection.
    */
  var eventFilter: js.UndefOr[js.Function1[/* event */ MouseEvent, Boolean]] = js.undefined
}
object EventFilter {
  
  inline def apply(): EventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventFilter]
  }
  
  extension [Self <: EventFilter](x: Self) {
    
    inline def setEventFilter(value: /* event */ MouseEvent => Boolean): Self = StObject.set(x, "eventFilter", js.Any.fromFunction1(value))
    
    inline def setEventFilterUndefined: Self = StObject.set(x, "eventFilter", js.undefined)
  }
}
