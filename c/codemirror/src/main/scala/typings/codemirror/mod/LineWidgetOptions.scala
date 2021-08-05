package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineWidgetOptions extends StObject {
  
  /** Causes the widget to be placed above instead of below the text of the line. */
  var above: js.UndefOr[Boolean] = js.undefined
  
  /** Add an extra CSS class name to the wrapper element created for the widget. */
  var className: js.UndefOr[String] = js.undefined
  
  /** Whether the widget should cover the gutter. */
  var coverGutter: js.UndefOr[Boolean] = js.undefined
  
  /** Determines whether the editor will capture mouse and drag events occurring in this widget.
    Default is false—the events will be left alone for the default browser handler, or specific handlers on the widget, to capture. */
  var handleMouseEvents: js.UndefOr[Boolean] = js.undefined
  
  /** By default, the widget is added below other widgets for the line.
    This option can be used to place it at a different position (zero for the top, N to put it after the Nth other widget).
    Note that this only has effect once, when the widget is created. */
  var insertAt: js.UndefOr[Double] = js.undefined
  
  /** Whether the widget should stay fixed in the face of horizontal scrolling. */
  var noHScroll: js.UndefOr[Boolean] = js.undefined
  
  /** When true, will cause the widget to be rendered even if the line it is associated with is hidden. */
  var showIfHidden: js.UndefOr[Boolean] = js.undefined
}
object LineWidgetOptions {
  
  inline def apply(): LineWidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineWidgetOptions]
  }
  
  extension [Self <: LineWidgetOptions](x: Self) {
    
    inline def setAbove(value: Boolean): Self = StObject.set(x, "above", value.asInstanceOf[js.Any])
    
    inline def setAboveUndefined: Self = StObject.set(x, "above", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCoverGutter(value: Boolean): Self = StObject.set(x, "coverGutter", value.asInstanceOf[js.Any])
    
    inline def setCoverGutterUndefined: Self = StObject.set(x, "coverGutter", js.undefined)
    
    inline def setHandleMouseEvents(value: Boolean): Self = StObject.set(x, "handleMouseEvents", value.asInstanceOf[js.Any])
    
    inline def setHandleMouseEventsUndefined: Self = StObject.set(x, "handleMouseEvents", js.undefined)
    
    inline def setInsertAt(value: Double): Self = StObject.set(x, "insertAt", value.asInstanceOf[js.Any])
    
    inline def setInsertAtUndefined: Self = StObject.set(x, "insertAt", js.undefined)
    
    inline def setNoHScroll(value: Boolean): Self = StObject.set(x, "noHScroll", value.asInstanceOf[js.Any])
    
    inline def setNoHScrollUndefined: Self = StObject.set(x, "noHScroll", js.undefined)
    
    inline def setShowIfHidden(value: Boolean): Self = StObject.set(x, "showIfHidden", value.asInstanceOf[js.Any])
    
    inline def setShowIfHiddenUndefined: Self = StObject.set(x, "showIfHidden", js.undefined)
  }
}
