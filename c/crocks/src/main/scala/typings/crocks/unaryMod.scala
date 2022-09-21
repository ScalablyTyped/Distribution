package typings.crocks

import typings.crocks.typesMod.UnaryFunction
import typings.crocks.typesMod.VariadicFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unaryMod {
  
  @JSImport("crocks/helpers/unary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * unary :: ((*) -> b) -> a -> b
    */
  inline def default(fn: VariadicFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]
}
