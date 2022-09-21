package typings.ckeditor4.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveListener extends StObject {
  
  def removeListener(): Unit
}
object RemoveListener {
  
  inline def apply(removeListener: () => Unit): RemoveListener = {
    val __obj = js.Dynamic.literal(removeListener = js.Any.fromFunction0(removeListener))
    __obj.asInstanceOf[RemoveListener]
  }
  
  extension [Self <: RemoveListener](x: Self) {
    
    inline def setRemoveListener(value: () => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction0(value))
  }
}
