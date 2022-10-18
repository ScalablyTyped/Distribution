package typings.baconjs

import typings.baconjs.typesDescribeMod.Desc
import typings.baconjs.typesObservableMod.Property
import typings.baconjs.typesObservableMod.default
import typings.baconjs.typesTransformMod.Transformer
import typings.baconjs.typesTypesMod.Function1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPredicateMod {
  
  @JSImport("baconjs/types/predicate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toPredicate[V](f: PredicateOrBoolean[V]): Predicate[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPredicate")(f.asInstanceOf[js.Any]).asInstanceOf[Predicate[V]]
  
  inline def withPredicate[V](
    src: default[V],
    f: PredicateOrProperty[V],
    predicateTransformer: Predicate2Transformer[V],
    desc: Desc
  ): default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("withPredicate")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any], predicateTransformer.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[default[V]]
  
  type Predicate[V] = Function1[V, Boolean]
  
  type Predicate2Transformer[V] = js.Function1[/* p */ Predicate[V], Transformer[V, V]]
  
  type PredicateOrBoolean[V] = Predicate[V] | Boolean
  
  type PredicateOrProperty[V] = Predicate[V] | Boolean | Property[Boolean]
}
