package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceiveQueueMessageOptions extends StObject {
  
  var isPeekLock: js.UndefOr[Boolean] = js.undefined
  
  var timeoutIntervalInS: js.UndefOr[Double] = js.undefined
}
object ReceiveQueueMessageOptions {
  
  inline def apply(): ReceiveQueueMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceiveQueueMessageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReceiveQueueMessageOptions] (val x: Self) extends AnyVal {
    
    inline def setIsPeekLock(value: Boolean): Self = StObject.set(x, "isPeekLock", value.asInstanceOf[js.Any])
    
    inline def setIsPeekLockUndefined: Self = StObject.set(x, "isPeekLock", js.undefined)
    
    inline def setTimeoutIntervalInS(value: Double): Self = StObject.set(x, "timeoutIntervalInS", value.asInstanceOf[js.Any])
    
    inline def setTimeoutIntervalInSUndefined: Self = StObject.set(x, "timeoutIntervalInS", js.undefined)
  }
}
