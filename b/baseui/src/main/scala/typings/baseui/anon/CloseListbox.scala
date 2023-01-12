package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseListbox extends StObject {
  
  def closeListbox(): Unit
  
  var value: String
}
object CloseListbox {
  
  inline def apply(closeListbox: () => Unit, value: String): CloseListbox = {
    val __obj = js.Dynamic.literal(closeListbox = js.Any.fromFunction0(closeListbox), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseListbox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseListbox] (val x: Self) extends AnyVal {
    
    inline def setCloseListbox(value: () => Unit): Self = StObject.set(x, "closeListbox", js.Any.fromFunction0(value))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
