package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anyMod {
  
  @JSImport("crocks/Any", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.anyAnyMod.default
  object default {
    
    inline def apply(`val`: Any): typings.crocks.anyAnyMod.Any = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.anyAnyMod.Any]
    
    @JSImport("crocks/Any", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): typings.crocks.anyAnyMod.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.crocks.anyAnyMod.Any]
    
    /* static member */
    inline def of(`val`: Any): typings.crocks.anyAnyMod.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.anyAnyMod.Any]
  }
}
