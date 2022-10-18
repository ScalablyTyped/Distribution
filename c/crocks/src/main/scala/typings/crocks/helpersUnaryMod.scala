package typings.crocks

import typings.crocks.internalTypesMod.UnaryFunction
import typings.crocks.internalTypesMod.VariadicFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersUnaryMod {
  
  @JSImport("crocks/helpers/unary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * unary :: ((*) -> b) -> a -> b
    */
  inline def default(fn: VariadicFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]
}
