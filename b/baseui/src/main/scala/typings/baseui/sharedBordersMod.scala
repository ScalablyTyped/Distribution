package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.themesTypesMod.Borders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedBordersMod extends Shortcut {
  
  @JSImport("baseui/themes/shared/borders", JSImport.Default)
  @js.native
  val default: Borders = js.native
  
  type _To = Borders
  
  /* This means you don't have to write `default`, but can instead just say `sharedBordersMod.foo` */
  override def _to: Borders = default
}
