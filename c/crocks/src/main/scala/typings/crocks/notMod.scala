package typings.crocks

import typings.crocks.typesMod.PredicateFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notMod {
  
  @JSImport("crocks/logic/not", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A](p: typings.crocks.predMod.default): js.Function1[/* x */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  /**
    * not :: ((a -> Boolean) | Pred) -> a -> Boolean
    */
  inline def default[A](p: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ A, Boolean]]
}
