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

