package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observer[T] extends js.Object {
  
  /** @hidden */
  var _willBeUnregistered: Boolean = js.native
  
  /**
    * Defines the callback to call when the observer is notified
    */
  def callback(eventData: T, eventState: EventState): Unit = js.native
  
  /**
    * Defines the mask of the observer (used to filter notifications)
    */
  var mask: Double = js.native
  
  /**
    * Defines the current scope used to restore the JS context
    */
  var scope: js.Any = js.native
  
  /**
    * Gets or sets a property defining that the observer as to be unregistered after the next notification
    */
  var unregisterOnNextCall: Boolean = js.native
}
object Observer {
  
  @scala.inline
  def apply[T](
    _willBeUnregistered: Boolean,
    callback: (T, EventState) => Unit,
    mask: Double,
    scope: js.Any,
    unregisterOnNextCall: Boolean
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(_willBeUnregistered = _willBeUnregistered.asInstanceOf[js.Any], callback = js.Any.fromFunction2(callback), mask = mask.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], unregisterOnNextCall = unregisterOnNextCall.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observer[T]]
  }
  
  @scala.inline
  implicit class ObserverOps[Self <: Observer[_], T] (val x: Self with Observer[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_willBeUnregistered(value: Boolean): Self = this.set("_willBeUnregistered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallback(value: (T, EventState) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMask(value: Double): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnregisterOnNextCall(value: Boolean): Self = this.set("unregisterOnNextCall", value.asInstanceOf[js.Any])
  }
}
