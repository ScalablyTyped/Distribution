package typings.ckeditor4.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait listenerRegistration extends StObject {
  
  def removeListener(): Unit
}
object listenerRegistration {
  
  inline def apply(removeListener: () => Unit): listenerRegistration = {
    val __obj = js.Dynamic.literal(removeListener = js.Any.fromFunction0(removeListener))
    __obj.asInstanceOf[listenerRegistration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: listenerRegistration] (val x: Self) extends AnyVal {
    
    inline def setRemoveListener(value: () => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction0(value))
  }
}
