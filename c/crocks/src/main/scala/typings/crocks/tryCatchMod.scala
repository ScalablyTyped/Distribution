package typings.crocks

import typings.crocks.typesMod.VariadicFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tryCatchMod {
  
  @JSImport("crocks/helpers/tryCatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * tryCatch :: ((*) -> b) -> (*) -> Result e b
    */
  inline def default(fn: VariadicFunction): VariadicFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[VariadicFunction]
}
