package typings.crocks

import typings.crocks.arrowArrowMod.Arrow
import typings.crocks.internalTypesMod.VariadicFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowMod {
  
  @JSImport("crocks/Arrow", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.arrowArrowMod.default
  object default {
    
    inline def apply(fn: VariadicFunction): Arrow = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Arrow]
    
    @JSImport("crocks/Arrow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def id(): Arrow = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Arrow]
  }
}
