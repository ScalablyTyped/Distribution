package typings.crocks

import typings.crocks.internalTypesMod.PredicateFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logicIfElseMod {
  
  @JSImport("crocks/logic/ifElse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A, C](p: PredicateFunction[A]): js.Function1[
    /* f */ js.Function1[/* x */ A, Any], 
    js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* x */ A, Any], 
    js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]
  ]]
  inline def default[A, C](p: PredicateFunction[A], f: js.Function1[/* x */ A, Any]): js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]]
  /**
    * ifElse :: ((a -> Boolean) | Pred a) -> (a -> b) -> (a -> b) -> a -> b
    */
  inline def default[A, C](p: PredicateFunction[A], f: js.Function1[/* x */ A, Any], g: js.Function1[/* x */ A, C]): js.Function1[/* x */ A, A | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, A | C]]
  inline def default[A, C](p: typings.crocks.predMod.default): js.Function1[
    /* f */ js.Function1[/* x */ A, Any], 
    js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* x */ A, Any], 
    js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]
  ]]
  inline def default[A, C](p: typings.crocks.predMod.default, f: js.Function1[/* x */ A, Any]): js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]]
  inline def default[A, C](p: typings.crocks.predMod.default, f: js.Function1[/* x */ A, Any], g: js.Function1[/* x */ A, C]): js.Function1[/* x */ A, A | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, A | C]]
}
