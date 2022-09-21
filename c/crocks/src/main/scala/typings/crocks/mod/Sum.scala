package typings.crocks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sum {
  
  @JSImport("crocks", "Sum.default")
  @js.native
  open class default ()
    extends typings.crocks.sumMod.default
  object default {
    
    inline def apply(`val`: scala.Any): typings.crocks.sumSumMod.Sum = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.sumSumMod.Sum]
    
    @JSImport("crocks", "Sum.default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): typings.crocks.sumSumMod.Sum = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.crocks.sumSumMod.Sum]
  }
}
