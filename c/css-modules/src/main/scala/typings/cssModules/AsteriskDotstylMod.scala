package typings.cssModules

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AsteriskDotstylMod extends Shortcut {
  
  /**
    * A Stylus based CSS module.
    *
    * https://stylus-lang.com
    */
  @JSImport("*.styl", JSImport.Default)
  @js.native
  val default: CSSModule = js.native
  
  type _To = CSSModule
  
  /* This means you don't have to write `default`, but can instead just say `AsteriskDotstylMod.foo` */
  override def _to: CSSModule = default
}
