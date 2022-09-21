package typings.crocks

import typings.crocks.firstFirstMod.First
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crocksFirstMod {
  
  @JSImport("crocks/First", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.firstFirstMod.default
  object default {
    
    inline def apply(`val`: Any): First = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[First]
    
    @JSImport("crocks/First", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): First = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[First]
    
    /* static member */
    inline def of(`val`: Any): First = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[First]
  }
}
