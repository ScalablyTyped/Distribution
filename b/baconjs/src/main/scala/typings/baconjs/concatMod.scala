package typings.baconjs

import typings.baconjs.observableMod.EventStream
import typings.baconjs.observableMod.EventStreamOptions
import typings.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/concat", JSImport.Namespace)
@js.native
object concatMod extends js.Object {
  def concatAll[V](streams_ : (default[V] | js.Array[default[V]])*): EventStream[V] = js.native
  def concatE[V, V2](left: EventStream[V], right: default[V2]): EventStream[V | V2] = js.native
  def concatE[V, V2](left: EventStream[V], right: default[V2], options: EventStreamOptions): EventStream[V | V2] = js.native
}

