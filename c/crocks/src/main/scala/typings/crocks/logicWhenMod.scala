package typings.crocks

import typings.crocks.internalTypesMod.PredicateFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logicWhenMod {
  
  @JSImport("crocks/logic/when", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A, B](p: PredicateFunction[A]): js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]]]
  /**
    * when :: ((a -> Boolean) | Pred) -> (a -> a) -> a -> a
    */
  inline def default[A, B](p: PredicateFunction[A], f: js.Function1[/* x */ A, B]): js.Function1[/* x */ A, A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, A | B]]
  inline def default[A, B](p: typings.crocks.predMod.default): js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]]]
  inline def default[A, B](p: typings.crocks.predMod.default, f: js.Function1[/* x */ A, B]): js.Function1[/* x */ A, A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, A | B]]
}
