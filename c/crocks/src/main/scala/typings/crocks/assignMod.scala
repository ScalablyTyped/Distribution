package typings.crocks

import typings.crocks.assignAssignMod.Assign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assignMod {
  
  @JSImport("crocks/Assign", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.assignAssignMod.default
  object default {
    
    inline def apply(`val`: js.Object): Assign = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Assign]
    
    @JSImport("crocks/Assign", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Assign = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Assign]
  }
}
