package typings.crocks

import typings.crocks.asyncAsyncMod.Async
import typings.crocks.internalTypesMod.UnaryFunction
import typings.crocks.internalTypesMod.VariadicFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("crocks/Async", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.asyncAsyncMod.default
  object default {
    
    inline def apply(fn: js.Function2[/* reject */ UnaryFunction, /* resolve */ UnaryFunction, Any]): Async = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Async]
    
    @JSImport("crocks/Async", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def Rejected(`val`: Any): Async = ^.asInstanceOf[js.Dynamic].applyDynamic("Rejected")(`val`.asInstanceOf[js.Any]).asInstanceOf[Async]
    
    /* static member */
    inline def Resolved(`val`: Any): Async = ^.asInstanceOf[js.Dynamic].applyDynamic("Resolved")(`val`.asInstanceOf[js.Any]).asInstanceOf[Async]
    
    /* static member */
    inline def all(`val`: js.Array[Async]): Async = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(`val`.asInstanceOf[js.Any]).asInstanceOf[Async]
    
    /* static member */
    inline def fromNode(fn: VariadicFunction): VariadicFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNode")(fn.asInstanceOf[js.Any]).asInstanceOf[VariadicFunction]
    
    /* static member */
    inline def fromPromise(fn: VariadicFunction): VariadicFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(fn.asInstanceOf[js.Any]).asInstanceOf[VariadicFunction]
    
    /* static member */
    inline def of(`val`: Any): Async = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[Async]
    
    /* static member */
    inline def rejectAfter(delay: Double, `val`: Any): Async = (^.asInstanceOf[js.Dynamic].applyDynamic("rejectAfter")(delay.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Async]
    
    /* static member */
    inline def resolveAfter(delay: Double, `val`: Any): Async = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAfter")(delay.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Async]
  }
}
