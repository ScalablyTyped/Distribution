package typings.betterCurry

import org.scalablytyped.runtime.Shortcut
import typings.betterCurry.BetterCurryModule.BetterCurry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("better-curry", JSImport.Namespace)
  @js.native
  val ^ : BetterCurry = js.native
  
  type _To = BetterCurry
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: BetterCurry = ^
}
