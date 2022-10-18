package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.themesTypesMod.Breakpoints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themesSharedBreakpointsMod extends Shortcut {
  
  @JSImport("baseui/themes/shared/breakpoints", JSImport.Default)
  @js.native
  val default: Breakpoints = js.native
  
  type _To = Breakpoints
  
  /* This means you don't have to write `default`, but can instead just say `themesSharedBreakpointsMod.foo` */
  override def _to: Breakpoints = default
}
