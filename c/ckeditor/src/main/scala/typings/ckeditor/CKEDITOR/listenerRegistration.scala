package typings.ckeditor.CKEDITOR

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
  
  extension [Self <: listenerRegistration](x: Self) {
    
    inline def setRemoveListener(value: () => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction0(value))
  }
}
