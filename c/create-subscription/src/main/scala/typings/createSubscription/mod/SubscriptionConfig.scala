package typings.createSubscription.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionConfig[S, T] extends js.Object {
  
  /**
    * Synchronously gets the value for the subscribed property.
    * Return undefined if the subscribable value is undefined,
    * Or does not support synchronous reading (e.g. native Promise).
    */
  def getCurrentValue(source: S): T = js.native
  
  /**
    * Set up a subscription for the subscribable value in props, and return an unsubscribe function.
    * Return false to indicate the property cannot be unsubscribed from (e.g. native Promises).
    * Due to the variety of change event types, subscribers should provide their own handlers.
    * Those handlers should not attempt to update state though;
    * They should call the callback() instead when a subscription changes.
    */
  def subscribe(source: S, callback: js.Function1[/* newValue */ T, Unit]): Unsubscribe = js.native
}
object SubscriptionConfig {
  
  @scala.inline
  def apply[S, T](getCurrentValue: S => T, subscribe: (S, js.Function1[/* newValue */ T, Unit]) => Unsubscribe): SubscriptionConfig[S, T] = {
    val __obj = js.Dynamic.literal(getCurrentValue = js.Any.fromFunction1(getCurrentValue), subscribe = js.Any.fromFunction2(subscribe))
    __obj.asInstanceOf[SubscriptionConfig[S, T]]
  }
  
  @scala.inline
  implicit class SubscriptionConfigOps[Self <: SubscriptionConfig[_, _], S, T] (val x: Self with (SubscriptionConfig[S, T])) extends AnyVal {
    
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
    def setGetCurrentValue(value: S => T): Self = this.set("getCurrentValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubscribe(value: (S, js.Function1[/* newValue */ T, Unit]) => Unsubscribe): Self = this.set("subscribe", js.Any.fromFunction2(value))
  }
}
