package typings.betterCurry

import typings.betterCurry.BetterCurryModule.BetterCurry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("BetterCurry")
  @js.native
  def BetterCurry: typings.betterCurry.BetterCurryModule.BetterCurry = js.native
  
  object BetterCurryModule {
    
    @JSGlobal("BetterCurryModule.Delegate")
    @js.native
    class Delegate[T] protected ()
      extends typings.betterCurry.BetterCurryModule.Delegate[T] {
      def this(proto: T, target: String) = this()
    }
  }
  
  @scala.inline
  def BetterCurry_=(x: BetterCurry): Unit = js.Dynamic.global.updateDynamic("BetterCurry")(x.asInstanceOf[js.Any])
}
