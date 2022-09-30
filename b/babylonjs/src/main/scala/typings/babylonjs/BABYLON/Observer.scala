package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Observer[T] extends StObject {
  
  /** @internal */
  var _willBeUnregistered: Boolean
  
  /**
    * Defines the callback to call when the observer is notified
    */
  def callback(eventData: T, eventState: EventState): Unit
  
  /**
    * Defines the mask of the observer (used to filter notifications)
    */
  var mask: Double
  
  /**
    * Defines the current scope used to restore the JS context
    */
  var scope: Any
  
  /**
    * Gets or sets a property defining that the observer as to be unregistered after the next notification
    */
  var unregisterOnNextCall: Boolean
}
object Observer {
  
  inline def apply[T](
    _willBeUnregistered: Boolean,
    callback: (T, EventState) => Unit,
    mask: Double,
    scope: Any,
    unregisterOnNextCall: Boolean
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(_willBeUnregistered = _willBeUnregistered.asInstanceOf[js.Any], callback = js.Any.fromFunction2(callback), mask = mask.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], unregisterOnNextCall = unregisterOnNextCall.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observer[T]]
  }
  
  extension [Self <: Observer[?], T](x: Self & Observer[T]) {
    
    inline def setCallback(value: (T, EventState) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setUnregisterOnNextCall(value: Boolean): Self = StObject.set(x, "unregisterOnNextCall", value.asInstanceOf[js.Any])
    
    inline def set_willBeUnregistered(value: Boolean): Self = StObject.set(x, "_willBeUnregistered", value.asInstanceOf[js.Any])
  }
}
