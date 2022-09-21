package typings.crocks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Endo {
  
  @JSImport("crocks", "Endo.default")
  @js.native
  open class default ()
    extends typings.crocks.endoMod.default
  object default {
    
    inline def apply(`val`: js.Function1[/* repeated */ scala.Any, scala.Any]): typings.crocks.endoEndoMod.Endo = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.endoEndoMod.Endo]
    
    @JSImport("crocks", "Endo.default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): typings.crocks.endoEndoMod.Endo = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.crocks.endoEndoMod.Endo]
    
    /* static member */
    inline def of(`val`: js.Function1[/* repeated */ scala.Any, scala.Any]): typings.crocks.endoEndoMod.Endo = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.endoEndoMod.Endo]
  }
}
