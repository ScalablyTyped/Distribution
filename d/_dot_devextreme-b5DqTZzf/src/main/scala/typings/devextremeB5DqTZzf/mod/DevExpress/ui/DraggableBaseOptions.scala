package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.anon.Y
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.both
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.horizontal
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.vertical
import typings.devextremeB5DqTZzf.mod.DevExpress.DOMComponentOptions
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableBaseOptions[TComponent]
  extends StObject
     with DOMComponentOptions[TComponent] {
  
  /**
    * Enables automatic scrolling while dragging an item beyond the viewport.
    */
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a DOM element that limits the dragging area.
    */
  var boundary: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  /**
    * Specifies a custom container in which the draggable item should be rendered.
    */
  var container: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  /**
    * Specifies the cursor offset from the dragged item.
    */
  var cursorOffset: js.UndefOr[String | Y] = js.undefined
  
  /**
    * A container for custom data.
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies the directions in which an item can be dragged.
    */
  var dragDirection: js.UndefOr[both | horizontal | vertical] = js.undefined
  
  /**
    * Allows you to group several UI components, so that users can drag and drop items between them.
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a CSS selector (ID or class) that should act as the drag handle(s) for the item(s).
    */
  var handle: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the distance in pixels from the edge of viewport at which scrolling should start. Applies only if autoScroll is true.
    */
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the scrolling speed when dragging an item beyond the viewport. Applies only if autoScroll is true.
    */
  var scrollSpeed: js.UndefOr[Double] = js.undefined
}
object DraggableBaseOptions {
  
  inline def apply[TComponent](): DraggableBaseOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableBaseOptions[TComponent]]
  }
  
  extension [Self <: DraggableBaseOptions[?], TComponent](x: Self & DraggableBaseOptions[TComponent]) {
    
    inline def setAutoScroll(value: Boolean): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    inline def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
    
    inline def setBoundary(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setContainer(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCursorOffset(value: String | Y): Self = StObject.set(x, "cursorOffset", value.asInstanceOf[js.Any])
    
    inline def setCursorOffsetUndefined: Self = StObject.set(x, "cursorOffset", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDragDirection(value: both | horizontal | vertical): Self = StObject.set(x, "dragDirection", value.asInstanceOf[js.Any])
    
    inline def setDragDirectionUndefined: Self = StObject.set(x, "dragDirection", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
    
    inline def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
    
    inline def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
    
    inline def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
  }
}
