package typings.cssModules

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("*.css", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CSSModule = js.native
  
  type _To = js.Object & CSSModule
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & CSSModule = ^
}
