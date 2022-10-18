package typings.crocks

import typings.crocks.internalTypesMod.VariadicFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersLiftNMod {
  
  @JSImport("crocks/helpers/liftN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * liftN :: Applicative m => Number -> ((*) -> a) -> (*m) -> m a
    */
  inline def default(n: Double, fn: VariadicFunction): VariadicFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(n.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[VariadicFunction]
}
