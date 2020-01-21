package typings.baconjs

import typings.baconjs.observableMod.Observable
import typings.baconjs.typesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/internal/asyncwrapsubscribe", JSImport.Namespace)
@js.native
object asyncwrapsubscribeMod extends js.Object {
  def default[V](obs: Observable[V], subscribe: Subscribe[V]): Subscribe[V] = js.native
}

