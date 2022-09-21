package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.themesTypesMod.MediaQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaQueryMod extends Shortcut {
  
  @JSImport("baseui/themes/shared/media-query", JSImport.Default)
  @js.native
  val default: MediaQuery = js.native
  
  type _To = MediaQuery
  
  /* This means you don't have to write `default`, but can instead just say `mediaQueryMod.foo` */
  override def _to: MediaQuery = default
}
