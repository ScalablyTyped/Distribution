package typings.baconjs

import typings.baconjs.typesDescribeMod.Desc
import typings.baconjs.typesObservableMod.Property
import typings.baconjs.typesObservableMod.default
import typings.baconjs.typesTransformMod.Transformer
import typings.baconjs.typesTypesMod.Function1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/predicate", JSImport.Namespace)
@js.native
object typesPredicateMod extends js.Object {
  def toPredicate[V](f: PredicateOrBoolean[V]): Predicate[V] = js.native
  def withPredicate[V](
    src: default[V],
    f: PredicateOrProperty[V],
    predicateTransformer: Predicate2Transformer[V],
    desc: Desc
  ): default[V] = js.native
  type Predicate[V] = Function1[V, Boolean]
  type Predicate2Transformer[V] = js.Function1[/* p */ Predicate[V], Transformer[V, V]]
  type PredicateOrBoolean[V] = Predicate[V] | Boolean
  type PredicateOrProperty[V] = Predicate[V] | Boolean | Property[Boolean]
}

