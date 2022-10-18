package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object combinatorsApplyToMod {
  
  @JSImport("crocks/combinators/applyTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A, B](`val`: A): js.Function1[/* fn */ js.Function1[/* x */ A, B], B] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fn */ js.Function1[/* x */ A, B], B]]
  inline def default[A, B](`val`: A, fn: js.Function1[/* x */ A, B]): B = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[B]
}
