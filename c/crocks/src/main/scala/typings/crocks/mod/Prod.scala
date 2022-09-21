package typings.crocks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Prod {
  
  @JSImport("crocks", "Prod.default")
  @js.native
  open class default ()
    extends typings.crocks.prodMod.default
  object default {
    
    inline def apply(`val`: scala.Any): typings.crocks.prodProdMod.Prod = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.prodProdMod.Prod]
    
    @JSImport("crocks", "Prod.default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): typings.crocks.prodProdMod.Prod = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.crocks.prodProdMod.Prod]
  }
}
