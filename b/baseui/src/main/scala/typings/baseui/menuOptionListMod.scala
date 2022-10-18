package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.menuTypesMod.OptionListProps
import typings.react.mod.NamedExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuOptionListMod extends Shortcut {
  
  @JSImport("baseui/menu/option-list", JSImport.Default)
  @js.native
  val default: NamedExoticComponent[OptionListProps] = js.native
  
  type _To = NamedExoticComponent[OptionListProps]
  
  /* This means you don't have to write `default`, but can instead just say `menuOptionListMod.foo` */
  override def _to: NamedExoticComponent[OptionListProps] = default
}
