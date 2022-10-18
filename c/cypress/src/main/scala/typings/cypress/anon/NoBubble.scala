package typings.cypress.anon

import typings.cypress.JQuery._SpecialEventHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoBubble
  extends StObject
     with _SpecialEventHook[Any, Any] {
  
  /**
    * Indicates whether this event type should be bubbled when the `.trigger()` method is called; by default it is `false`, meaning that a triggered event will bubble to the element's parents up to the document (if attached to a document) and then to the window. Note that defining `noBubble` on an event will effectively prevent that event from being used for delegated events with `.trigger()`.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#nobubble-boolean }\`
    */
  var noBubble: Boolean
}
object NoBubble {
  
  inline def apply(noBubble: Boolean): NoBubble = {
    val __obj = js.Dynamic.literal(noBubble = noBubble.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoBubble]
  }
  
  extension [Self <: NoBubble](x: Self) {
    
    inline def setNoBubble(value: Boolean): Self = StObject.set(x, "noBubble", value.asInstanceOf[js.Any])
  }
}
