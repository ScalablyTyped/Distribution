package typings.cssModules

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scssMod extends Shortcut {
  
  @JSImport("*.scss", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CSSModule = js.native
  
  type _To = js.Object & CSSModule
  
  /* This means you don't have to write `^`, but can instead just say `scssMod.foo` */
  override def _to: js.Object & CSSModule = ^
}
