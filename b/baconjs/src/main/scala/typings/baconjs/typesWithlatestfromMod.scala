package typings.baconjs

import typings.baconjs.typesObservableMod.EventStream
import typings.baconjs.typesObservableMod.Property
import typings.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/withlatestfrom", JSImport.Namespace)
@js.native
object typesWithlatestfromMod extends js.Object {
  def default[V, V2, R](
    sampler: typings.baconjs.typesObservableMod.default[V],
    samplee: typings.baconjs.typesObservableMod.default[V2],
    f: js.Function2[/* value */ V, /* otherValue */ V2, R]
  ): typings.baconjs.typesObservableMod.default[R] = js.native
  def withLatestFrom[V, V2, R](sampler: default[V], samplee: default[V2], f: js.Function2[/* value */ V, /* otherValue */ V2, R]): default[R] = js.native
  def withLatestFromE[V, V2, R](
    sampler: EventStream[V],
    samplee: default[V2],
    f: js.Function2[/* value */ V, /* otherValue */ V2, R]
  ): EventStream[R] = js.native
  def withLatestFromP[V, V2, R](sampler: Property[V], samplee: default[V2], f: js.Function2[/* value */ V, /* otherValue */ V2, R]): Property[R] = js.native
}

