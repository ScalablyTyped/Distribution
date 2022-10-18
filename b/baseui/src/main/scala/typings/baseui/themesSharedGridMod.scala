package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.themesTypesMod.Grid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themesSharedGridMod extends Shortcut {
  
  @JSImport("baseui/themes/shared/grid", JSImport.Default)
  @js.native
  val default: Grid = js.native
  
  type _To = Grid
  
  /* This means you don't have to write `default`, but can instead just say `themesSharedGridMod.foo` */
  override def _to: Grid = default
}
