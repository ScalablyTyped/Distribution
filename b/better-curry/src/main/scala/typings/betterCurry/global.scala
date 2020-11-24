package typings.betterCurry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  var BetterCurry: typings.betterCurry.BetterCurryModule.BetterCurry = js.native
  
  @js.native
  object BetterCurryModule extends js.Object {
    
    @js.native
    class Delegate[T] protected ()
      extends typings.betterCurry.BetterCurryModule.Delegate[T] {
      def this(proto: T, target: String) = this()
    }
  }
}
