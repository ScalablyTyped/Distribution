package typings.cryptoJs

import org.scalablytyped.runtime.Shortcut
import typings.cryptoJs.mod.Padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object padIso10126Mod extends Shortcut {
  
  @JSImport("crypto-js/pad-iso10126", JSImport.Namespace)
  @js.native
  val ^ : Padding = js.native
  
  type _To = Padding
  
  /* This means you don't have to write `^`, but can instead just say `padIso10126Mod.foo` */
  override def _to: Padding = ^
}
