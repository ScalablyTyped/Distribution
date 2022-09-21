package typings.crocks.mod

import typings.crocks.typesMod.UnaryFunction
import typings.crocks.typesMod.VariadicFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Async {
  
  @JSImport("crocks", "Async.default")
  @js.native
  open class default ()
    extends typings.crocks.asyncMod.default
  object default {
    
    inline def apply(fn: js.Function2[/* reject */ UnaryFunction, /* resolve */ UnaryFunction, scala.Any]): typings.crocks.asyncAsyncMod.Async = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.asyncAsyncMod.Async]
    
    @JSImport("crocks", "Async.default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def Rejected(`val`: scala.Any): typings.crocks.asyncAsyncMod.Async = ^.asInstanceOf[js.Dynamic].applyDynamic("Rejected")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.asyncAsyncMod.Async]
    
    /* static member */
    inline def Resolved(`val`: scala.Any): typings.crocks.asyncAsyncMod.Async = ^.asInstanceOf[js.Dynamic].applyDynamic("Resolved")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.asyncAsyncMod.Async]
    
    /* static member */
    inline def all(`val`: js.Array[typings.crocks.asyncAsyncMod.Async]): typings.crocks.asyncAsyncMod.Async = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.asyncAsyncMod.Async]
    
    /* static member */
    inline def fromNode(fn: VariadicFunction): VariadicFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNode")(fn.asInstanceOf[js.Any]).asInstanceOf[VariadicFunction]
    
    /* static member */
    inline def fromPromise(fn: VariadicFunction): VariadicFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(fn.asInstanceOf[js.Any]).asInstanceOf[VariadicFunction]
    
    /* static member */
    inline def of(`val`: scala.Any): typings.crocks.asyncAsyncMod.Async = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.asyncAsyncMod.Async]
    
    /* static member */
    inline def rejectAfter(delay: Double, `val`: scala.Any): typings.crocks.asyncAsyncMod.Async = (^.asInstanceOf[js.Dynamic].applyDynamic("rejectAfter")(delay.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[typings.crocks.asyncAsyncMod.Async]
    
    /* static member */
    inline def resolveAfter(delay: Double, `val`: scala.Any): typings.crocks.asyncAsyncMod.Async = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAfter")(delay.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[typings.crocks.asyncAsyncMod.Async]
  }
}
