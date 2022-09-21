package typings.crocks

import typings.crocks.sumSumMod.Sum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sumMod {
  
  @JSImport("crocks/Sum", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.sumSumMod.default
  object default {
    
    inline def apply(`val`: Any): Sum = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Sum]
    
    @JSImport("crocks/Sum", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Sum = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Sum]
  }
}
