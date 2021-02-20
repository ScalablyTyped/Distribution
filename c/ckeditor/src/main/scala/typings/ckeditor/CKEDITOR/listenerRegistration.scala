package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait listenerRegistration extends StObject {
  
  def removeListener(): Unit = js.native
}
object listenerRegistration {
  
  @scala.inline
  def apply(removeListener: () => Unit): listenerRegistration = {
    val __obj = js.Dynamic.literal(removeListener = js.Any.fromFunction0(removeListener))
    __obj.asInstanceOf[listenerRegistration]
  }
  
  @scala.inline
  implicit class listenerRegistrationMutableBuilder[Self <: listenerRegistration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveListener(value: () => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction0(value))
  }
}
