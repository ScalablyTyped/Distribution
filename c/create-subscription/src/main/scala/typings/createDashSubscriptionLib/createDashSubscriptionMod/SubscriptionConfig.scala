package typings
package createDashSubscriptionLib.createDashSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionConfig[S, T] extends js.Object {
  /**
    * Synchronously gets the value for the subscribed property.
    * Return undefined if the subscribable value is undefined,
    * Or does not support synchronous reading (e.g. native Promise).
    */
  def getCurrentValue(source: S): T
  /**
    * Set up a subscription for the subscribable value in props, and return an unsubscribe function.
    * Return false to indicate the property cannot be unsubscribed from (e.g. native Promises).
    * Due to the variety of change event types, subscribers should provide their own handlers.
    * Those handlers should not attempt to update state though;
    * They should call the callback() instead when a subscription changes.
    */
  def subscribe(source: S, callback: js.Function1[/* newValue */ T, scala.Unit]): Unsubscribe
}

object SubscriptionConfig {
  @scala.inline
  def apply[S, T](
    getCurrentValue: js.Function1[S, T],
    subscribe: js.Function2[S, js.Function1[/* newValue */ T, scala.Unit], Unsubscribe]
  ): SubscriptionConfig[S, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCurrentValue")(getCurrentValue)
    __obj.updateDynamic("subscribe")(subscribe)
    __obj.asInstanceOf[SubscriptionConfig[S, T]]
  }
}

