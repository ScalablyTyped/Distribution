package typings.crocks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Const {
  
  @JSImport("crocks", "Const.default")
  @js.native
  open class default ()
    extends typings.crocks.constMod.default
  object default {
    
    inline def apply(`val`: scala.Any): typings.crocks.constConstMod.Const = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.constConstMod.Const]
    
    @JSImport("crocks", "Const.default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): typings.crocks.constConstMod.Const = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.crocks.constConstMod.Const]
    
    /* static member */
    inline def of(`val`: scala.Any): typings.crocks.constConstMod.Const = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.constConstMod.Const]
  }
}
