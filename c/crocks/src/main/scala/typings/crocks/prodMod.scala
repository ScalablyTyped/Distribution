package typings.crocks

import typings.crocks.prodProdMod.Prod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prodMod {
  
  @JSImport("crocks/Prod", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.prodProdMod.default
  object default {
    
    inline def apply(`val`: Any): Prod = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Prod]
    
    @JSImport("crocks/Prod", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Prod = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Prod]
  }
}
