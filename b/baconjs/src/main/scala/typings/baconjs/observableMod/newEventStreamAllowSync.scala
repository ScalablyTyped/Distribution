package typings.baconjs.observableMod

import typings.baconjs.describeMod.Desc
import typings.baconjs.typesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/observable", "newEventStreamAllowSync")
@js.native
object newEventStreamAllowSync extends js.Object {
  def apply[V](description: Desc, subscribe: Subscribe[V]): EventStream[V] = js.native
}

