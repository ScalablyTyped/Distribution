package typings.crocks

import typings.crocks.typesMod.PredicateFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object impliesMod {
  
  @JSImport("crocks/logic/implies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A](p: typings.crocks.predMod.default): js.Function1[
    /* q */ PredicateFunction[A] | typings.crocks.predMod.default, 
    js.Function1[/* x */ A, Boolean]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* q */ PredicateFunction[A] | typings.crocks.predMod.default, 
    js.Function1[/* x */ A, Boolean]
  ]]
  inline def default[A](p: typings.crocks.predMod.default, q: typings.crocks.predMod.default): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  inline def default[A](p: typings.crocks.predMod.default, q: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  inline def default[A](p: PredicateFunction[A]): js.Function1[
    /* q */ PredicateFunction[A] | typings.crocks.predMod.default, 
    js.Function1[/* x */ A, Boolean]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* q */ PredicateFunction[A] | typings.crocks.predMod.default, 
    js.Function1[/* x */ A, Boolean]
  ]]
  inline def default[A](p: PredicateFunction[A], q: typings.crocks.predMod.default): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  /**
    * implies :: ((a -> Boolean) | Pred a) -> ((a -> Boolean) | Pred a) -> a -> Boolean
    */
  inline def default[A](p: PredicateFunction[A], q: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
}
