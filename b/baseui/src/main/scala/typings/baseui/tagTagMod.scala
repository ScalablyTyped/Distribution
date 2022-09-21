package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.tagTypesMod.TagProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagTagMod extends Shortcut {
  
  @JSImport("baseui/tag/tag", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TagProps & RefAttributes[HTMLSpanElement]] = js.native
  
  type _To = ForwardRefExoticComponent[TagProps & RefAttributes[HTMLSpanElement]]
  
  /* This means you don't have to write `default`, but can instead just say `tagTagMod.foo` */
  override def _to: ForwardRefExoticComponent[TagProps & RefAttributes[HTMLSpanElement]] = default
}
