package typings.cssModules

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylMod extends Shortcut {
  
  @JSImport("*.styl", JSImport.Namespace)
  @js.native
  val ^ : CSSModule = js.native
  
  type _To = CSSModule
  
  /* This means you don't have to write `^`, but can instead just say `stylMod.foo` */
  override def _to: CSSModule = ^
}
