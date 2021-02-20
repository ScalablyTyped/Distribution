package typings.ckeditor.anon

import typings.ckeditor.CKEDITOR.listenerRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveListenerListenerRegistration extends StObject {
  
  var removeListener: listenerRegistration = js.native
}
object RemoveListenerListenerRegistration {
  
  @scala.inline
  def apply(removeListener: listenerRegistration): RemoveListenerListenerRegistration = {
    val __obj = js.Dynamic.literal(removeListener = removeListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveListenerListenerRegistration]
  }
  
  @scala.inline
  implicit class RemoveListenerListenerRegistrationMutableBuilder[Self <: RemoveListenerListenerRegistration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveListener(value: listenerRegistration): Self = StObject.set(x, "removeListener", value.asInstanceOf[js.Any])
  }
}
