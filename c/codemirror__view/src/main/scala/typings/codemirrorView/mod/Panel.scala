package typings.codemirrorView.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Object that describes an active panel.
*/
trait Panel extends StObject {
  
  /**
    Called when the panel is removed from the editor or the editor
    is destroyed.
    */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    The element representing this panel. The library will add the
    `"cm-panel"` DOM class to this.
    */
  var dom: HTMLElement
  
  /**
    Optionally called after the panel has been added to the editor.
    */
  var mount: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    Whether the panel should be at the top or bottom of the editor.
    Defaults to false.
    */
  var top: js.UndefOr[Boolean] = js.undefined
  
  /**
    Update the DOM for a given view update.
    */
  var update: js.UndefOr[js.Function1[/* update */ ViewUpdate, Unit]] = js.undefined
}
object Panel {
  
  inline def apply(dom: HTMLElement): Panel = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Panel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Panel] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setDom(value: HTMLElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    inline def setMount(value: () => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction0(value))
    
    inline def setMountUndefined: Self = StObject.set(x, "mount", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setUpdate(value: /* update */ ViewUpdate => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
