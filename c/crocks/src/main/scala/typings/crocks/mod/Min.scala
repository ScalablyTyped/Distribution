package typings.crocks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Min {
  
  @JSImport("crocks", "Min.default")
  @js.native
  open class default ()
    extends typings.crocks.minMod.default
  object default {
    
    inline def apply(`val`: scala.Any): typings.crocks.minMinMod.Min = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.minMinMod.Min]
    
    @JSImport("crocks", "Min.default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): typings.crocks.minMinMod.Min = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.crocks.minMinMod.Min]
  }
}
