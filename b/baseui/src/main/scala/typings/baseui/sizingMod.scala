package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.themesTypesMod.Sizing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizingMod extends Shortcut {
  
  @JSImport("baseui/themes/shared/sizing", JSImport.Default)
  @js.native
  val default: Sizing = js.native
  
  type _To = Sizing
  
  /* This means you don't have to write `default`, but can instead just say `sizingMod.foo` */
  override def _to: Sizing = default
}
