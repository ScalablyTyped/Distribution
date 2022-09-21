package typings.crocks

import typings.crocks.typesMod.NullaryFunction
import typings.crocks.typesMod.UnaryFunction
import typings.crocks.typesMod.VariadicFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncAsyncMod {
  
  @JSImport("crocks/Async/Async", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Async
  object default {
    
    inline def apply(fn: js.Function2[/* reject */ UnaryFunction, /* resolve */ UnaryFunction, Any]): Async = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Async]
    
    @JSImport("crocks/Async/Async", JSImport.Default)
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
  
  @js.native
  trait Async extends StObject {
    
    def alt(`val`: Async): Async = js.native
    
    def ap(`val`: Async): Async = js.native
    
    def bichain(fn1: UnaryFunction, fn2: UnaryFunction): Async = js.native
    
    def bimap(fn1: UnaryFunction, fn2: UnaryFunction): Async = js.native
    
    def chain(fn: UnaryFunction): Async = js.native
    
    def coalesce(fn1: UnaryFunction, fn2: UnaryFunction): Async = js.native
    
    def fork(reject: UnaryFunction, resolve: UnaryFunction): Any = js.native
    def fork(reject: UnaryFunction, resolve: UnaryFunction, cancel: NullaryFunction): Any = js.native
    
    def map(fn: UnaryFunction): Async = js.native
    
    def race(`val`: Async): Async = js.native
    
    def swap(fn1: UnaryFunction, fn2: UnaryFunction): Async = js.native
    
    def toPromise(): js.Promise[Any] = js.native
  }
}
