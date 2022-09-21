package typings.cssModules

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * A CSS module.
    */
  @JSImport("*.css", JSImport.Default)
  @js.native
  val default: CSSModule = js.native
  
  type _To = CSSModule
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: CSSModule = default
}
