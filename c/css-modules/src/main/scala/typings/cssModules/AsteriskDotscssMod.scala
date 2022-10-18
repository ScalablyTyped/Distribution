package typings.cssModules

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AsteriskDotscssMod extends Shortcut {
  
  /**
    * An SCSS based CSS module.
    *
    * https://sass-lang.com
    */
  @JSImport("*.scss", JSImport.Default)
  @js.native
  val default: CSSModule = js.native
  
  type _To = CSSModule
  
  /* This means you don't have to write `default`, but can instead just say `AsteriskDotscssMod.foo` */
  override def _to: CSSModule = default
}
