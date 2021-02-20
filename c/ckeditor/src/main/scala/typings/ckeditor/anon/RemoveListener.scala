package typings.ckeditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveListener extends StObject {
  
  def removeListener(): Unit = js.native
}
object RemoveListener {
  
  @scala.inline
  def apply(removeListener: () => Unit): RemoveListener = {
    val __obj = js.Dynamic.literal(removeListener = js.Any.fromFunction0(removeListener))
    __obj.asInstanceOf[RemoveListener]
  }
  
  @scala.inline
  implicit class RemoveListenerMutableBuilder[Self <: RemoveListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveListener(value: () => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction0(value))
  }
}
