package typings.baconjs.compositeunsubscribeMod

import typings.baconjs.typesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositeUnsubscribe extends js.Object {
  var starting: js.Array[Subscription]
  var subscriptions: js.Array[Unsub]
  var unsubscribed: Boolean
  def add(subscription: Subscription): Unit
  def count(): Double
  def empty(): Boolean
  def remove(unsub: Unsub): Unit
  def unsubscribe(): Unit
}

object CompositeUnsubscribe {
  @scala.inline
  def apply(
    add: Subscription => Unit,
    count: () => Double,
    empty: () => Boolean,
    remove: Unsub => Unit,
    starting: js.Array[Subscription],
    subscriptions: js.Array[Unsub],
    unsubscribe: () => Unit,
    unsubscribed: Boolean
  ): CompositeUnsubscribe = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), count = js.Any.fromFunction0(count), empty = js.Any.fromFunction0(empty), remove = js.Any.fromFunction1(remove), starting = starting.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe), unsubscribed = unsubscribed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositeUnsubscribe]
  }
}

