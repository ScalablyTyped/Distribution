package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.listTypesMod.ListProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listListItemMod extends Shortcut {
  
  @JSImport("baseui/list/list-item", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ListProps & RefAttributes[HTMLLIElement]] = js.native
  
  type _To = ForwardRefExoticComponent[ListProps & RefAttributes[HTMLLIElement]]
  
  /* This means you don't have to write `default`, but can instead just say `listListItemMod.foo` */
  override def _to: ForwardRefExoticComponent[ListProps & RefAttributes[HTMLLIElement]] = default
}
