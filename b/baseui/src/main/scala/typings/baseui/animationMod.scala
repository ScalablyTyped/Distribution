package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.themesTypesMod.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationMod extends Shortcut {
  
  @JSImport("baseui/themes/shared/animation", JSImport.Default)
  @js.native
  val default: Animation = js.native
  
  type _To = Animation
  
  /* This means you don't have to write `default`, but can instead just say `animationMod.foo` */
  override def _to: Animation = default
}
