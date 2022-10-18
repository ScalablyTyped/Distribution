package typings.crocks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Either {
  
  @JSImport("crocks", "Either.default")
  @js.native
  open class default ()
    extends typings.crocks.eitherMod.default
  object default {
    
    inline def apply(`val`: scala.Any): typings.crocks.eitherEitherMod.Either = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.eitherEitherMod.Either]
    
    @JSImport("crocks", "Either.default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def Left(`val`: scala.Any): typings.crocks.eitherEitherMod.Either = ^.asInstanceOf[js.Dynamic].applyDynamic("Left")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.eitherEitherMod.Either]
    
    /* static member */
    inline def Right(`val`: scala.Any): typings.crocks.eitherEitherMod.Either = ^.asInstanceOf[js.Dynamic].applyDynamic("Right")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.eitherEitherMod.Either]
    
    /* static member */
    inline def of(`val`: scala.Any): typings.crocks.eitherEitherMod.Either = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.eitherEitherMod.Either]
  }
}
