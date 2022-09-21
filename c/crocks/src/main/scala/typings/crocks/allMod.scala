package typings.crocks

import typings.crocks.allAllMod.All
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object allMod {
  
  @JSImport("crocks/All", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.allAllMod.default
  object default {
    
    inline def apply(`val`: Any): All = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[All]
    
    @JSImport("crocks/All", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): All = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[All]
    
    /* static member */
    inline def of(`val`: Any): All = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[All]
  }
}
