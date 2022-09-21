package typings.crocks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Equiv {
  
  @JSImport("crocks", "Equiv.default")
  @js.native
  open class default ()
    extends typings.crocks.equivMod.default
  object default {
    
    inline def apply(fn: js.Function2[/* val1 */ scala.Any, /* val2 */ scala.Any, Boolean]): typings.crocks.equivEquivMod.Equiv = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.equivEquivMod.Equiv]
    
    @JSImport("crocks", "Equiv.default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): typings.crocks.equivEquivMod.Equiv = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.crocks.equivEquivMod.Equiv]
  }
}
