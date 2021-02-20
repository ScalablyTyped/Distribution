package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseListbox extends StObject {
  
  def closeListbox(): Unit = js.native
  
  var value: String = js.native
}
object CloseListbox {
  
  @scala.inline
  def apply(closeListbox: () => Unit, value: String): CloseListbox = {
    val __obj = js.Dynamic.literal(closeListbox = js.Any.fromFunction0(closeListbox), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseListbox]
  }
  
  @scala.inline
  implicit class CloseListboxMutableBuilder[Self <: CloseListbox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseListbox(value: () => Unit): Self = StObject.set(x, "closeListbox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
