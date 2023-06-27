package typings.codemirrorView.mod

import typings.codemirrorView.anon.Y
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Describes the way a tooltip is displayed.
*/
trait TooltipView extends StObject {
  
  /**
    Called when the tooltip is removed from the editor or the editor
    is destroyed.
    */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    The DOM element to position over the editor.
    */
  var dom: HTMLElement
  
  /**
    By default, a tooltip's screen position will be based on the
    text position of its `pos` property. This method can be provided
    to make the tooltip view itself responsible for finding its
    screen position.
    */
  var getCoords: js.UndefOr[js.Function1[/* pos */ Double, Rect]] = js.undefined
  
  /**
    Called after the tooltip is added to the DOM for the first time.
    */
  var mount: js.UndefOr[js.Function1[/* view */ EditorView, Unit]] = js.undefined
  
  /**
    Adjust the position of the tooltip relative to its anchor
    position. A positive `x` value will move the tooltip
    horizontally along with the text direction (so right in
    left-to-right context, left in right-to-left). A positive `y`
    will move the tooltip up when it is above its anchor, and down
    otherwise.
    */
  var offset: js.UndefOr[Y] = js.undefined
  
  /**
    By default, tooltips are moved when they overlap with other
    tooltips. Set this to `true` to disable that behavior for this
    tooltip.
    */
  var overlap: js.UndefOr[Boolean] = js.undefined
  
  /**
    Called when the tooltip has been (re)positioned. The argument is
    the [space](https://codemirror.net/6/docs/ref/#view.tooltips^config.tooltipSpace) available to the
    tooltip.
    */
  var positioned: js.UndefOr[js.Function1[/* space */ Rect, Unit]] = js.undefined
  
  /**
    By default, the library will restrict the size of tooltips so
    that they don't stick out of the available space. Set this to
    false to disable that.
    */
  var resize: js.UndefOr[Boolean] = js.undefined
  
  /**
    Update the DOM element for a change in the view's state.
    */
  var update: js.UndefOr[js.Function1[/* update */ ViewUpdate, Unit]] = js.undefined
}
object TooltipView {
  
  inline def apply(dom: HTMLElement): TooltipView = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipView] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setDom(value: HTMLElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    inline def setGetCoords(value: /* pos */ Double => Rect): Self = StObject.set(x, "getCoords", js.Any.fromFunction1(value))
    
    inline def setGetCoordsUndefined: Self = StObject.set(x, "getCoords", js.undefined)
    
    inline def setMount(value: /* view */ EditorView => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction1(value))
    
    inline def setMountUndefined: Self = StObject.set(x, "mount", js.undefined)
    
    inline def setOffset(value: Y): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOverlap(value: Boolean): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
    
    inline def setOverlapUndefined: Self = StObject.set(x, "overlap", js.undefined)
    
    inline def setPositioned(value: /* space */ Rect => Unit): Self = StObject.set(x, "positioned", js.Any.fromFunction1(value))
    
    inline def setPositionedUndefined: Self = StObject.set(x, "positioned", js.undefined)
    
    inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setUpdate(value: /* update */ ViewUpdate => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
