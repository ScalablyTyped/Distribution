package typings.baconjs

import typings.baconjs.typesObservableMod.default
import typings.baconjs.typesPredicateMod.PredicateOrProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTakewhileMod {
  
  @JSImport("baconjs/types/takewhile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def takeWhile[V](src: default[V], f: PredicateOrProperty[V]): default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[default[V]]
}
