package typings.crocks

import typings.crocks.constConstMod.Const
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constMod {
  
  @JSImport("crocks/Const", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.constConstMod.default
  object default {
    
    inline def apply(`val`: Any): Const = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Const]
    
    @JSImport("crocks/Const", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Const = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Const]
    
    /* static member */
    inline def of(`val`: Any): Const = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[Const]
  }
}
