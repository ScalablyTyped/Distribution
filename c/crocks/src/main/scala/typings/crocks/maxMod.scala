package typings.crocks

import typings.crocks.maxMaxMod.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxMod {
  
  @JSImport("crocks/Max", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.maxMaxMod.default
  object default {
    
    inline def apply(`val`: Any): Max = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Max]
    
    @JSImport("crocks/Max", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Max = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Max]
  }
}
