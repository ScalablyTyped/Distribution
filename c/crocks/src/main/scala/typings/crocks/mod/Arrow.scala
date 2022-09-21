package typings.crocks.mod

import typings.crocks.typesMod.VariadicFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Arrow {
  
  @JSImport("crocks", "Arrow.default")
  @js.native
  open class default ()
    extends typings.crocks.arrowMod.default
  object default {
    
    inline def apply(fn: VariadicFunction): typings.crocks.arrowArrowMod.Arrow = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.arrowArrowMod.Arrow]
    
    @JSImport("crocks", "Arrow.default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def id(): typings.crocks.arrowArrowMod.Arrow = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[typings.crocks.arrowArrowMod.Arrow]
  }
}
