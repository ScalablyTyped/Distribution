package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.menuTypesMod.OptionProfileProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuOptionProfileMod extends Shortcut {
  
  @JSImport("baseui/menu/option-profile", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OptionProfileProps & RefAttributes[HTMLElement]] = js.native
  
  type _To = ForwardRefExoticComponent[OptionProfileProps & RefAttributes[HTMLElement]]
  
  /* This means you don't have to write `default`, but can instead just say `menuOptionProfileMod.foo` */
  override def _to: ForwardRefExoticComponent[OptionProfileProps & RefAttributes[HTMLElement]] = default
}
