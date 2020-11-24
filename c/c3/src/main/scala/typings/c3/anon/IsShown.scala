package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsShown extends js.Object {
  
  /**
    * Hides sub chart.
    */
  def hide(): Unit = js.native
  
  /**
    * Returns true if the sub chart is shown.
    */
  def isShown(): Boolean = js.native
  
  /**
    * Shows sub chart at the bottom of the chart.
    */
  def show(): Unit = js.native
}
object IsShown {
  
  @scala.inline
  def apply(hide: () => Unit, isShown: () => Boolean, show: () => Unit): IsShown = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), isShown = js.Any.fromFunction0(isShown), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[IsShown]
  }
  
  @scala.inline
  implicit class IsShownOps[Self <: IsShown] (val x: Self) extends AnyVal {
    
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
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsShown(value: () => Boolean): Self = this.set("isShown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
}
