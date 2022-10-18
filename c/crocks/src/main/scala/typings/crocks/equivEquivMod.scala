package typings.crocks

import typings.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equivEquivMod {
  
  @JSImport("crocks/Equiv/Equiv", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Equiv
  object default {
    
    inline def apply(fn: js.Function2[/* val1 */ Any, /* val2 */ Any, Boolean]): Equiv = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Equiv]
    
    @JSImport("crocks/Equiv/Equiv", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Equiv = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Equiv]
  }
  
  @js.native
  trait Equiv extends StObject {
    
    def compareWith(val1: Any): js.Function1[/* val2 */ Any, Boolean] = js.native
    def compareWith(val1: Any, val2: Any): Boolean = js.native
    
    def concat(`val`: Equiv): Equiv = js.native
    
    def contramap(fn: UnaryFunction): Equiv = js.native
  }
}
