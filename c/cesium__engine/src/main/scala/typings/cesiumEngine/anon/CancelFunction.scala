package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.Request.CancelCallback
import typings.cesiumEngine.mod.Request.PriorityCallback
import typings.cesiumEngine.mod.Request.RequestCallback
import typings.cesiumEngine.mod.RequestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelFunction extends StObject {
  
  var cancelFunction: js.UndefOr[CancelCallback] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var priorityFunction: js.UndefOr[PriorityCallback] = js.undefined
  
  var requestFunction: js.UndefOr[RequestCallback] = js.undefined
  
  var serverKey: js.UndefOr[String] = js.undefined
  
  var throttle: js.UndefOr[Boolean] = js.undefined
  
  var throttleByServer: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[RequestType] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object CancelFunction {
  
  inline def apply(): CancelFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelFunction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelFunction] (val x: Self) extends AnyVal {
    
    inline def setCancelFunction(value: () => Unit): Self = StObject.set(x, "cancelFunction", js.Any.fromFunction0(value))
    
    inline def setCancelFunctionUndefined: Self = StObject.set(x, "cancelFunction", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityFunction(value: () => Double): Self = StObject.set(x, "priorityFunction", js.Any.fromFunction0(value))
    
    inline def setPriorityFunctionUndefined: Self = StObject.set(x, "priorityFunction", js.undefined)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRequestFunction(value: () => js.Promise[Unit]): Self = StObject.set(x, "requestFunction", js.Any.fromFunction0(value))
    
    inline def setRequestFunctionUndefined: Self = StObject.set(x, "requestFunction", js.undefined)
    
    inline def setServerKey(value: String): Self = StObject.set(x, "serverKey", value.asInstanceOf[js.Any])
    
    inline def setServerKeyUndefined: Self = StObject.set(x, "serverKey", js.undefined)
    
    inline def setThrottle(value: Boolean): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThrottleByServer(value: Boolean): Self = StObject.set(x, "throttleByServer", value.asInstanceOf[js.Any])
    
    inline def setThrottleByServerUndefined: Self = StObject.set(x, "throttleByServer", js.undefined)
    
    inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    
    inline def setType(value: RequestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
