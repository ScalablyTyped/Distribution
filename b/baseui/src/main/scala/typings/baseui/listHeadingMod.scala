package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.listTypesMod.HeadingProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listHeadingMod extends Shortcut {
  
  @JSImport("baseui/list/list-heading", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[HeadingProps & RefAttributes[HTMLLIElement]] = js.native
  
  type _To = ForwardRefExoticComponent[HeadingProps & RefAttributes[HTMLLIElement]]
  
  /* This means you don't have to write `default`, but can instead just say `listHeadingMod.foo` */
  override def _to: ForwardRefExoticComponent[HeadingProps & RefAttributes[HTMLLIElement]] = default
}
