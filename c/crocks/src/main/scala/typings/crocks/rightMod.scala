package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rightMod {
  
  @JSImport("crocks/Either/Right", JSImport.Default)
  @js.native
  open class default () extends Right
  object default {
    
    @JSImport("crocks/Either/Right", JSImport.Default)
    @js.native
    def apply(`val`: Any): typings.crocks.eitherEitherMod.default = js.native
  }
  
  @js.native
  trait Right
    extends typings.crocks.eitherEitherMod.default {
    
    def concat(`val`: typings.crocks.eitherEitherMod.default): typings.crocks.eitherEitherMod.default = js.native
  }
}
