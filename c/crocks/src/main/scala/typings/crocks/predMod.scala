package typings.crocks

import typings.crocks.internalTypesMod.UnaryFunction
import typings.crocks.predPredMod.Pred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object predMod {
  
  @JSImport("crocks/Pred", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.predPredMod.default
  object default {
    
    inline def apply(fn: UnaryFunction): Pred = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Pred]
    
    @JSImport("crocks/Pred", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Pred = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Pred]
  }
}
