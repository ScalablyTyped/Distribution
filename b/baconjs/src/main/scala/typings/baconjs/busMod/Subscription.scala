package typings.baconjs.busMod

import typings.baconjs.typesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription[V] extends js.Object {
  var input: typings.baconjs.observableMod.default[V] = js.native
  var unsub: js.UndefOr[Unsub] = js.native
}

object Subscription {
  @scala.inline
  def apply[V](input: typings.baconjs.observableMod.default[V]): Subscription[V] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription[V]]
  }
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription[_], V] (val x: Self with Subscription[V]) extends AnyVal {
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
    def setInput(value: typings.baconjs.observableMod.default[V]): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsub(value: () => Unit): Self = this.set("unsub", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUnsub: Self = this.set("unsub", js.undefined)
  }
  
}

