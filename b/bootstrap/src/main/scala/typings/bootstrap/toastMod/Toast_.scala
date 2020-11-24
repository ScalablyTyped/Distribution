package typings.bootstrap.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Toast_ extends js.Object {
  
  /**
    * Destroys an element’s scrollspy.
    */
  def dispose(): Unit = js.native
  
  /**
    * When using scrollspy in conjunction with adding or removing of
    * elements from the DOM, you’ll need to call the refresh method like
    * so:
    */
  def refresh(): Unit = js.native
}
object Toast_ {
  
  @scala.inline
  def apply(dispose: () => Unit, refresh: () => Unit): Toast_ = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[Toast_]
  }
  
  @scala.inline
  implicit class Toast_Ops[Self <: Toast_] (val x: Self) extends AnyVal {
    
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
  }
}
