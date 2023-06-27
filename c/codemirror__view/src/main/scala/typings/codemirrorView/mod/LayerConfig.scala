package typings.codemirrorView.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerConfig extends StObject {
  
  /**
    Determines whether this layer is shown above or below the text.
    */
  var above: Boolean
  
  /**
    When given, this class is added to the DOM element that will
    wrap the markers.
    */
  var `class`: js.UndefOr[String] = js.undefined
  
  /**
    If given, called when the layer is removed from the editor or
    the entire editor is destroyed.
    */
  var destroy: js.UndefOr[js.Function2[/* layer */ HTMLElement, /* view */ EditorView, Unit]] = js.undefined
  
  /**
    Build a set of markers for this layer, and measure their
    dimensions.
    */
  def markers(view: EditorView): js.Array[LayerMarker]
  
  /**
    If given, this is called when the layer is created.
    */
  var mount: js.UndefOr[js.Function2[/* layer */ HTMLElement, /* view */ EditorView, Unit]] = js.undefined
  
  /**
    Called on every view update. Returning true triggers a marker
    update (a call to `markers` and drawing of those markers).
    */
  def update(update: ViewUpdate, layer: HTMLElement): Boolean
}
object LayerConfig {
  
  inline def apply(
    above: Boolean,
    markers: EditorView => js.Array[LayerMarker],
    update: (ViewUpdate, HTMLElement) => Boolean
  ): LayerConfig = {
    val __obj = js.Dynamic.literal(above = above.asInstanceOf[js.Any], markers = js.Any.fromFunction1(markers), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[LayerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerConfig] (val x: Self) extends AnyVal {
    
    inline def setAbove(value: Boolean): Self = StObject.set(x, "above", value.asInstanceOf[js.Any])
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setDestroy(value: (/* layer */ HTMLElement, /* view */ EditorView) => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction2(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setMarkers(value: EditorView => js.Array[LayerMarker]): Self = StObject.set(x, "markers", js.Any.fromFunction1(value))
    
    inline def setMount(value: (/* layer */ HTMLElement, /* view */ EditorView) => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction2(value))
    
    inline def setMountUndefined: Self = StObject.set(x, "mount", js.undefined)
    
    inline def setUpdate(value: (ViewUpdate, HTMLElement) => Boolean): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
