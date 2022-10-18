package typings.crocks

import typings.crocks.lastLastMod.Last
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lastMod {
  
  @JSImport("crocks/Last", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.lastLastMod.default
  object default {
    
    inline def apply(`val`: Any): Last = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Last]
    
    @JSImport("crocks/Last", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Last = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Last]
    
    /* static member */
    inline def of(`val`: Any): Last = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[Last]
  }
}
