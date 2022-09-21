package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.all
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bottom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.left
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.right
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.top
import typings.devextremeB5DqTZzf.mod.DevExpress.DOMComponentOptions
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxResizable.ResizeEndEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxResizable.ResizeEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxResizable.ResizeStartEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxResizableOptions
  extends StObject
     with DOMComponentOptions[dxResizable] {
  
  /**
    * Specifies which borders of the UI component element are used as a handle.
    */
  var handles: js.UndefOr[bottom | left | right | top | all | String] = js.undefined
  
  /**
    * Specifies the upper height boundary for resizing.
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the upper width boundary for resizing.
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the lower height boundary for resizing.
    */
  var minHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the lower width boundary for resizing.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * A function that is executed each time the UI component is resized by one pixel.
    */
  var onResize: js.UndefOr[js.Function1[/* e */ ResizeEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when resizing ends.
    */
  var onResizeEnd: js.UndefOr[js.Function1[/* e */ ResizeEndEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when resizing starts.
    */
  var onResizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEvent, Unit]] = js.undefined
}
object dxResizableOptions {
  
  inline def apply(): dxResizableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxResizableOptions]
  }
  
  extension [Self <: dxResizableOptions](x: Self) {
    
    inline def setHandles(value: bottom | left | right | top | all | String): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
    
    inline def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setOnResize(value: /* e */ ResizeEvent => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
    
    inline def setOnResizeEnd(value: /* e */ ResizeEndEvent => Unit): Self = StObject.set(x, "onResizeEnd", js.Any.fromFunction1(value))
    
    inline def setOnResizeEndUndefined: Self = StObject.set(x, "onResizeEnd", js.undefined)
    
    inline def setOnResizeStart(value: /* e */ ResizeStartEvent => Unit): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction1(value))
    
    inline def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
    
    inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
  }
}
