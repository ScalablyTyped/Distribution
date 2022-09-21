package typings.crocks

import typings.crocks.identityIdentityMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crocksIdentityMod {
  
  @JSImport("crocks/Identity", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.identityIdentityMod.default
  object default {
    
    inline def apply(`val`: Any): Identity = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Identity]
    
    @JSImport("crocks/Identity", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def of(`val`: Any): Identity = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[Identity]
  }
}
