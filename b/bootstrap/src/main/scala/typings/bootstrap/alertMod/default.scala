package typings.bootstrap.alertMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap/js/dist/alert", JSImport.Default)
@js.native
class default protected () extends Alert {
  def this(element: Element) = this()
}
/* static members */
@JSImport("bootstrap/js/dist/alert", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Static method which allows you to get the alert instance associated to a
    * DOM element, you can use it like this: getInstance(alert)
    */
  def getInstance(element: Element): Alert = js.native
  
  @js.native
  object Events extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.bootstrap.alertMod.Alert.Events with String] = js.native
    
    /* "close.bs.alert" */ val close: typings.bootstrap.alertMod.Alert.Events.close with String = js.native
    
    /* "closed.bs.alert" */ val closed: typings.bootstrap.alertMod.Alert.Events.closed with String = js.native
  }
}
