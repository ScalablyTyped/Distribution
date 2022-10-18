package typings.crocks

import typings.crocks.internalTypesMod.VariadicFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersCurryMod {
  
  @JSImport("crocks/helpers/curry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * curry :: ((a, b, ...) -> z) -> a -> b -> ... -> z
    */
  inline def default(fn: VariadicFunction): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
}
