package typings.crocks

import typings.crocks.minMinMod.Min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minMod {
  
  @JSImport("crocks/Min", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.minMinMod.default
  object default {
    
    inline def apply(`val`: Any): Min = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Min]
    
    @JSImport("crocks/Min", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Min = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Min]
  }
}
