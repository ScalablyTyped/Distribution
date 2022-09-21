package typings.ckeditor4.anon

import typings.ckeditor4.CKEDITOR.listenerRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveListenerListenerRegistration extends StObject {
  
  var removeListener: listenerRegistration
}
object RemoveListenerListenerRegistration {
  
  inline def apply(removeListener: listenerRegistration): RemoveListenerListenerRegistration = {
    val __obj = js.Dynamic.literal(removeListener = removeListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveListenerListenerRegistration]
  }
  
  extension [Self <: RemoveListenerListenerRegistration](x: Self) {
    
    inline def setRemoveListener(value: listenerRegistration): Self = StObject.set(x, "removeListener", value.asInstanceOf[js.Any])
  }
}
