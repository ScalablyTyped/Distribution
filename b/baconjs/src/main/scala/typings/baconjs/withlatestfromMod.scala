package typings.baconjs

import typings.baconjs.observableMod.EventStream
import typings.baconjs.observableMod.Property
import typings.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/withlatestfrom", JSImport.Namespace)
@js.native
object withlatestfromMod extends js.Object {
  def default[V, V2, R](
    sampler: typings.baconjs.observableMod.default[V],
    samplee: typings.baconjs.observableMod.default[V2],
    f: js.Function2[/* value */ V, /* otherValue */ V2, R]
  ): typings.baconjs.observableMod.default[R] = js.native
  def withLatestFrom[V, V2, R](sampler: default[V], samplee: default[V2], f: js.Function2[/* value */ V, /* otherValue */ V2, R]): default[R] = js.native
  def withLatestFromE[V, V2, R](
    sampler: EventStream[V],
    samplee: default[V2],
    f: js.Function2[/* value */ V, /* otherValue */ V2, R]
  ): EventStream[R] = js.native
  def withLatestFromP[V, V2, R](sampler: Property[V], samplee: default[V2], f: js.Function2[/* value */ V, /* otherValue */ V2, R]): Property[R] = js.native
}

