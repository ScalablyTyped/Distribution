package typings.codemirrorView.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Markers shown in a [layer](https://codemirror.net/6/docs/ref/#view.layer) must conform to this
interface. They are created in a measuring phase, and have to
contain all their positioning information, so that they can be
drawn without further DOM layout reading.
Markers are automatically absolutely positioned. Their parent
element has the same top-left corner as the document, so they
should be positioned relative to the document.
*/
trait LayerMarker extends StObject {
  
  /**
    Draw the marker to the DOM.
    */
  def draw(): HTMLElement
  
  /**
    Compare this marker to a marker of the same type. Used to avoid
    unnecessary redraws.
    */
  def eq(other: LayerMarker): Boolean
  
  /**
    Update an existing marker of this type to this marker.
    */
  var update: js.UndefOr[js.Function2[/* dom */ HTMLElement, /* oldMarker */ this.type, Boolean]] = js.undefined
}
object LayerMarker {
  
  inline def apply(draw: () => HTMLElement, eq_ : LayerMarker => Boolean): LayerMarker = {
    val __obj = js.Dynamic.literal(draw = js.Any.fromFunction0(draw))
    __obj.updateDynamic("eq")(js.Any.fromFunction1(eq_))
    __obj.asInstanceOf[LayerMarker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerMarker] (val x: Self) extends AnyVal {
    
    inline def setDraw(value: () => HTMLElement): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
    
    inline def setEq_(value: LayerMarker => Boolean): Self = StObject.set(x, "eq", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: (/* dom */ HTMLElement, LayerMarker) => Boolean): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
