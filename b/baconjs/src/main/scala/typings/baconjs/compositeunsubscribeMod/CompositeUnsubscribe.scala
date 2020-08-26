package typings.baconjs.compositeunsubscribeMod

import typings.baconjs.typesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompositeUnsubscribe extends js.Object {
  var starting: js.Array[Subscription] = js.native
  var subscriptions: js.Array[Unsub] = js.native
  var unsubscribed: Boolean = js.native
  def add(subscription: Subscription): Unit = js.native
  def count(): Double = js.native
  def empty(): Boolean = js.native
  def remove(unsub: Unsub): Unit = js.native
  def unsubscribe(): Unit = js.native
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
  @scala.inline
  implicit class CompositeUnsubscribeOps[Self <: CompositeUnsubscribe] (val x: Self) extends AnyVal {
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
    def setAdd(value: Subscription => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setCount(value: () => Double): Self = this.set("count", js.Any.fromFunction0(value))
    @scala.inline
    def setEmpty(value: () => Boolean): Self = this.set("empty", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: Unsub => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setStartingVarargs(value: Subscription*): Self = this.set("starting", js.Array(value :_*))
    @scala.inline
    def setStarting(value: js.Array[Subscription]): Self = this.set("starting", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionsVarargs(value: Unsub*): Self = this.set("subscriptions", js.Array(value :_*))
    @scala.inline
    def setSubscriptions(value: js.Array[Unsub]): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsubscribe(value: () => Unit): Self = this.set("unsubscribe", js.Any.fromFunction0(value))
    @scala.inline
    def setUnsubscribed(value: Boolean): Self = this.set("unsubscribed", value.asInstanceOf[js.Any])
  }
  
}

