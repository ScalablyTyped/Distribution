package typings.crocks

import typings.crocks.internalTypesMod.VariadicFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersOnceMod {
  
  @JSImport("crocks/helpers/once", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * once :: ((*) -> a) -> ((*) -> a)
    */
  inline def default(fn: VariadicFunction): VariadicFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[VariadicFunction]
}
