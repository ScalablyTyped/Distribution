package typings.baconjs

import typings.baconjs.typesObservableMod.EventStream
import typings.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/merge", JSImport.Namespace)
@js.native
object typesMergeMod extends js.Object {
  def mergeAll[V](streams: (default[V] | js.Array[default[V]])*): EventStream[V] = js.native
}

