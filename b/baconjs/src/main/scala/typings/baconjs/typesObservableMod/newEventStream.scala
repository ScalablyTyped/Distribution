package typings.baconjs.typesObservableMod

import typings.baconjs.typesDescribeMod.Desc
import typings.baconjs.typesTypesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/observable", "newEventStream")
@js.native
object newEventStream extends js.Object {
  def apply[V](description: Desc, subscribe: Subscribe[V]): EventStream[V] = js.native
}

