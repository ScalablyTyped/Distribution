package typings.codemirrorView.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Describes a tooltip. Values of this type, when provided through
the [`showTooltip`](https://codemirror.net/6/docs/ref/#view.showTooltip) facet, control the
individual tooltips on the editor.
*/
trait Tooltip extends StObject {
  
  /**
    Whether the tooltip should be shown above or below the target
    position. Not guaranteed to be respected for hover tooltips
    since all hover tooltips for the same range are always
    positioned together. Defaults to false.
    */
  var above: js.UndefOr[Boolean] = js.undefined
  
  /**
    When set to true, show a triangle connecting the tooltip element
    to position `pos`.
    */
  var arrow: js.UndefOr[Boolean] = js.undefined
  
  /**
    A constructor function that creates the tooltip's [DOM
    representation](https://codemirror.net/6/docs/ref/#view.TooltipView).
    */
  def create(view: EditorView): TooltipView
  
  /**
    The end of the range annotated by this tooltip, if different
    from `pos`.
    */
  var end: js.UndefOr[Double] = js.undefined
  
  /**
    The document position at which to show the tooltip.
    */
  var pos: Double
  
  /**
    Whether the `above` option should be honored when there isn't
    enough space on that side to show the tooltip inside the
    viewport. Defaults to false.
    */
  var strictSide: js.UndefOr[Boolean] = js.undefined
}
object Tooltip {
  
  inline def apply(create: EditorView => TooltipView, pos: Double): Tooltip = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
  
  extension [Self <: Tooltip](x: Self) {
    
    inline def setAbove(value: Boolean): Self = StObject.set(x, "above", value.asInstanceOf[js.Any])
    
    inline def setAboveUndefined: Self = StObject.set(x, "above", js.undefined)
    
    inline def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setCreate(value: EditorView => TooltipView): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setStrictSide(value: Boolean): Self = StObject.set(x, "strictSide", value.asInstanceOf[js.Any])
    
    inline def setStrictSideUndefined: Self = StObject.set(x, "strictSide", js.undefined)
  }
}
