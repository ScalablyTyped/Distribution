package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineWidgetOptions extends StObject {
  
  /** Causes the widget to be placed above instead of below the text of the line. */
  var above: js.UndefOr[Boolean] = js.native
  
  /** Add an extra CSS class name to the wrapper element created for the widget. */
  var className: js.UndefOr[String] = js.native
  
  /** Whether the widget should cover the gutter. */
  var coverGutter: js.UndefOr[Boolean] = js.native
  
  /** Determines whether the editor will capture mouse and drag events occurring in this widget.
    Default is false—the events will be left alone for the default browser handler, or specific handlers on the widget, to capture. */
  var handleMouseEvents: js.UndefOr[Boolean] = js.native
  
  /** By default, the widget is added below other widgets for the line.
    This option can be used to place it at a different position (zero for the top, N to put it after the Nth other widget).
    Note that this only has effect once, when the widget is created. */
  var insertAt: js.UndefOr[Double] = js.native
  
  /** Whether the widget should stay fixed in the face of horizontal scrolling. */
  var noHScroll: js.UndefOr[Boolean] = js.native
  
  /** When true, will cause the widget to be rendered even if the line it is associated with is hidden. */
  var showIfHidden: js.UndefOr[Boolean] = js.native
}
object LineWidgetOptions {
  
  @scala.inline
  def apply(): LineWidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineWidgetOptions]
  }
  
  @scala.inline
  implicit class LineWidgetOptionsMutableBuilder[Self <: LineWidgetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbove(value: Boolean): Self = StObject.set(x, "above", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAboveUndefined: Self = StObject.set(x, "above", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCoverGutter(value: Boolean): Self = StObject.set(x, "coverGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverGutterUndefined: Self = StObject.set(x, "coverGutter", js.undefined)
    
    @scala.inline
    def setHandleMouseEvents(value: Boolean): Self = StObject.set(x, "handleMouseEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleMouseEventsUndefined: Self = StObject.set(x, "handleMouseEvents", js.undefined)
    
    @scala.inline
    def setInsertAt(value: Double): Self = StObject.set(x, "insertAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertAtUndefined: Self = StObject.set(x, "insertAt", js.undefined)
    
    @scala.inline
    def setNoHScroll(value: Boolean): Self = StObject.set(x, "noHScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoHScrollUndefined: Self = StObject.set(x, "noHScroll", js.undefined)
    
    @scala.inline
    def setShowIfHidden(value: Boolean): Self = StObject.set(x, "showIfHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIfHiddenUndefined: Self = StObject.set(x, "showIfHidden", js.undefined)
  }
}
