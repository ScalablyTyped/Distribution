package typings.crocks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object First {
  
  @JSImport("crocks", "First.default")
  @js.native
  open class default ()
    extends typings.crocks.crocksFirstMod.default
  object default {
    
    inline def apply(`val`: scala.Any): typings.crocks.firstFirstMod.First = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.firstFirstMod.First]
    
    @JSImport("crocks", "First.default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): typings.crocks.firstFirstMod.First = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.crocks.firstFirstMod.First]
    
    /* static member */
    inline def of(`val`: scala.Any): typings.crocks.firstFirstMod.First = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.firstFirstMod.First]
  }
}
