package typings.baconjs

import typings.baconjs.describeMod.Desc
import typings.baconjs.observableMod.Property
import typings.baconjs.observableMod.default
import typings.baconjs.transformMod.Transformer
import typings.baconjs.typesMod.Function1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/predicate", JSImport.Namespace)
@js.native
object predicateMod extends js.Object {
  
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
