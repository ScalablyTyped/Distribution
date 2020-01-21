package typings.baconjs

import typings.baconjs.observableMod.EventStream
import typings.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/groupby", JSImport.Namespace)
@js.native
object groupbyMod extends js.Object {
  def groupBy[V, V2](src: default[V], keyF: js.Function1[/* value */ V, String]): default[EventStream[V2]] = js.native
  def groupBy[V, V2](src: default[V], keyF: js.Function1[/* value */ V, String], limitF: GroupTransformer[V, V2]): default[EventStream[V2]] = js.native
  type GroupTransformer[V, V2] = js.Function2[/* data */ EventStream[V], /* firstValue */ V, default[V2]]
}

