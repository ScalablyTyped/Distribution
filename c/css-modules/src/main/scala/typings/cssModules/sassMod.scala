package typings.cssModules

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sassMod extends Shortcut {
  
  @JSImport("*.sass", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CSSModule = js.native
  
  type _To = js.Object & CSSModule
  
  /* This means you don't have to write `^`, but can instead just say `sassMod.foo` */
  override def _to: js.Object & CSSModule = ^
}
