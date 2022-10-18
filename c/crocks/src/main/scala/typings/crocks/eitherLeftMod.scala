package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eitherLeftMod {
  
  @JSImport("crocks/Either/Left", JSImport.Default)
  @js.native
  open class default () extends Left
  object default {
    
    @JSImport("crocks/Either/Left", JSImport.Default)
    @js.native
    def apply(`val`: Any): typings.crocks.eitherEitherMod.default = js.native
  }
  
  @js.native
  trait Left
    extends typings.crocks.eitherEitherMod.default {
    
    def concat(`val`: typings.crocks.eitherEitherMod.default): typings.crocks.eitherEitherMod.default = js.native
  }
}
