package typings.blueprintjsTable.dragTypesMod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDragHandler extends js.Object {
  
  /**
    * Called when the mouse is pressed down. Drag and click operations may
    * be cancelled at this point by returning false from this method.
    */
  var onActivate: js.UndefOr[js.Function1[/* event */ MouseEvent, Boolean]] = js.native
  
  /**
    * Called when the mouse is released iff the mouse was NOT dragged after
    * activation.
    *
    * This will be called asynchronously if `onDoubleClick` is defined. See
    * that callback for more details.
    */
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  
  /**
    * Called iff there are two click events within the timeout
    * `DragEvents.DOUBLE_CLICK_TIMEOUT_MSEC`, which defaults to 500 msec.
    *
    * NOTE: Defining this callback requires that we wait to invoke the
    * `onClick` callback until the timeout has expired and we are certain the
    * interaction was only a single click. If this callback is not defined,
    * the `onClick` callback will be invoked synchronously with the mouseup
    * event.
    */
  var onDoubleClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  
  /**
    * Called when the mouse is released iff the mouse was dragged after
    * activation.
    */
  var onDragEnd: js.UndefOr[js.Function2[/* event */ MouseEvent, /* coords */ ICoordinateData, Unit]] = js.native
  
  /**
    * Called every time the mouse is moved after activation and before the
    * mouse is released. This method is also called on the last even when the
    * mouse is released.
    */
  var onDragMove: js.UndefOr[js.Function2[/* event */ MouseEvent, /* coords */ ICoordinateData, Unit]] = js.native
  
  /**
    * This prevents mouse events from performing their default operation such
    * as text selection.
    * @default true
    */
  var preventDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * This prevents the event from propagating up to parent elements.
    * @default false
    */
  var stopPropagation: js.UndefOr[Boolean] = js.native
}
object IDragHandler {
  
  @scala.inline
  def apply(): IDragHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragHandler]
  }
  
  @scala.inline
  implicit class IDragHandlerOps[Self <: IDragHandler] (val x: Self) extends AnyVal {
    
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
    def setOnActivate(value: /* event */ MouseEvent => Boolean): Self = this.set("onActivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnActivate: Self = this.set("onActivate", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* event */ MouseEvent => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: /* event */ MouseEvent => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Unit): Self = this.set("onDragEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragMove(value: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Unit): Self = this.set("onDragMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDragMove: Self = this.set("onDragMove", js.undefined)
    
    @scala.inline
    def setPreventDefault(value: Boolean): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
    
    @scala.inline
    def setStopPropagation(value: Boolean): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopPropagation: Self = this.set("stopPropagation", js.undefined)
  }
}
