package typings.crocks

import typings.crocks.equivEquivMod.Equiv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equivMod {
  
  @JSImport("crocks/Equiv", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.equivEquivMod.default
  object default {
    
    inline def apply(fn: js.Function2[/* val1 */ Any, /* val2 */ Any, Boolean]): Equiv = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Equiv]
    
    @JSImport("crocks/Equiv", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Equiv = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Equiv]
  }
}
