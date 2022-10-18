package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.tokensTypesMod.ColorTokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensColorsMod extends Shortcut {
  
  @JSImport("baseui/tokens/colors", JSImport.Default)
  @js.native
  val default: ColorTokens = js.native
  
  type _To = ColorTokens
  
  /* This means you don't have to write `default`, but can instead just say `tokensColorsMod.foo` */
  override def _to: ColorTokens = default
}
