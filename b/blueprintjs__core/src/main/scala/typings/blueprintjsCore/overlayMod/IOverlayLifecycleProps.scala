package typings.blueprintjsCore.overlayMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOverlayLifecycleProps extends js.Object {
  
  /**
    * Lifecycle method invoked just after the CSS _close_ transition ends but
    * before the child has been removed from the DOM. Receives the DOM element
    * of the child being closed.
    */
  var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  
  /**
    * Lifecycle method invoked just before the CSS _close_ transition begins on
    * a child. Receives the DOM element of the child being closed.
    */
  var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  
  /**
    * Lifecycle method invoked just after the CSS _open_ transition ends.
    * Receives the DOM element of the child being opened.
    */
  var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  
  /**
    * Lifecycle method invoked just after mounting the child in the DOM but
    * just before the CSS _open_ transition begins. Receives the DOM element of
    * the child being opened.
    */
  var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
}
object IOverlayLifecycleProps {
  
  @scala.inline
  def apply(): IOverlayLifecycleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOverlayLifecycleProps]
  }
  
  @scala.inline
  implicit class IOverlayLifecyclePropsOps[Self <: IOverlayLifecycleProps] (val x: Self) extends AnyVal {
    
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
    def setOnClosed(value: /* node */ HTMLElement => Unit): Self = this.set("onClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClosed: Self = this.set("onClosed", js.undefined)
    
    @scala.inline
    def setOnClosing(value: /* node */ HTMLElement => Unit): Self = this.set("onClosing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClosing: Self = this.set("onClosing", js.undefined)
    
    @scala.inline
    def setOnOpened(value: /* node */ HTMLElement => Unit): Self = this.set("onOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOpened: Self = this.set("onOpened", js.undefined)
    
    @scala.inline
    def setOnOpening(value: /* node */ HTMLElement => Unit): Self = this.set("onOpening", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOpening: Self = this.set("onOpening", js.undefined)
  }
}
