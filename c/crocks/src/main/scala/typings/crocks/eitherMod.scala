package typings.crocks

import typings.crocks.eitherEitherMod.Either
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eitherMod {
  
  @JSImport("crocks/Either", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.eitherEitherMod.default
  object default {
    
    inline def apply(`val`: Any): Either = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Either]
    
    @JSImport("crocks/Either", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def Left(`val`: Any): Either = ^.asInstanceOf[js.Dynamic].applyDynamic("Left")(`val`.asInstanceOf[js.Any]).asInstanceOf[Either]
    
    /* static member */
    inline def Right(`val`: Any): Either = ^.asInstanceOf[js.Dynamic].applyDynamic("Right")(`val`.asInstanceOf[js.Any]).asInstanceOf[Either]
    
    /* static member */
    inline def of(`val`: Any): Either = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[Either]
  }
}
