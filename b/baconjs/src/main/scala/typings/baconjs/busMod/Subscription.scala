package typings.baconjs.busMod

import typings.baconjs.typesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription[V] extends js.Object {
  var input: typings.baconjs.observableMod.default[V]
  var unsub: js.UndefOr[Unsub] = js.undefined
}

object Subscription {
  @scala.inline
  def apply[V](input: typings.baconjs.observableMod.default[V], unsub: () => Unit = null): Subscription[V] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    if (unsub != null) __obj.updateDynamic("unsub")(js.Any.fromFunction0(unsub))
    __obj.asInstanceOf[Subscription[V]]
  }
}

