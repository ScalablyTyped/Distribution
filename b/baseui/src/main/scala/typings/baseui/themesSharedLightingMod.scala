package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.themesTypesMod.Lighting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themesSharedLightingMod extends Shortcut {
  
  @JSImport("baseui/themes/shared/lighting", JSImport.Default)
  @js.native
  val default: Lighting = js.native
  
  type _To = Lighting
  
  /* This means you don't have to write `default`, but can instead just say `themesSharedLightingMod.foo` */
  override def _to: Lighting = default
}
