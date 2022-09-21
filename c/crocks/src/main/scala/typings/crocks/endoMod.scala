package typings.crocks

import typings.crocks.endoEndoMod.Endo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endoMod {
  
  @JSImport("crocks/Endo", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.endoEndoMod.default
  object default {
    
    inline def apply(`val`: js.Function1[/* repeated */ Any, Any]): Endo = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Endo]
    
    @JSImport("crocks/Endo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Endo = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Endo]
    
    /* static member */
    inline def of(`val`: js.Function1[/* repeated */ Any, Any]): Endo = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[Endo]
  }
}
