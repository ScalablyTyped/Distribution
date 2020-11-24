package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineWidgetOptions extends js.Object {
  
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
  implicit class LineWidgetOptionsOps[Self <: LineWidgetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbove(value: Boolean): Self = this.set("above", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbove: Self = this.set("above", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCoverGutter(value: Boolean): Self = this.set("coverGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverGutter: Self = this.set("coverGutter", js.undefined)
    
    @scala.inline
    def setHandleMouseEvents(value: Boolean): Self = this.set("handleMouseEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleMouseEvents: Self = this.set("handleMouseEvents", js.undefined)
    
    @scala.inline
    def setInsertAt(value: Double): Self = this.set("insertAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertAt: Self = this.set("insertAt", js.undefined)
    
    @scala.inline
    def setNoHScroll(value: Boolean): Self = this.set("noHScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoHScroll: Self = this.set("noHScroll", js.undefined)
    
    @scala.inline
    def setShowIfHidden(value: Boolean): Self = this.set("showIfHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIfHidden: Self = this.set("showIfHidden", js.undefined)
  }
}
