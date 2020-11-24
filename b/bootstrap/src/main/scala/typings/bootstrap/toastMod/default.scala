package typings.bootstrap.toastMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap/js/dist/toast", JSImport.Default)
@js.native
class default protected () extends Toast {
  def this(element: Element) = this()
}
/* static members */
@JSImport("bootstrap/js/dist/toast", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Static method which allows you to get the scrollspy instance associated
    * with a DOM element
    */
  def getInstance(element: Element): Toast = js.native
  
  @js.native
  object Events extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.bootstrap.toastMod.Toast.Events with String] = js.native
    
    /* "hidden.bs.toast" */ val hidden: typings.bootstrap.toastMod.Toast.Events.hidden with String = js.native
    
    /* "hide.bs.toast" */ val hide: typings.bootstrap.toastMod.Toast.Events.hide with String = js.native
    
    /* "show.bs.toast" */ val show: typings.bootstrap.toastMod.Toast.Events.show with String = js.native
    
    /* "shown.bs.toast" */ val shown: typings.bootstrap.toastMod.Toast.Events.shown with String = js.native
  }
}
