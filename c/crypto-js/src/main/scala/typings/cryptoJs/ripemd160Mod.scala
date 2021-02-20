package typings.cryptoJs

import org.scalablytyped.runtime.Shortcut
import typings.cryptoJs.mod.HasherHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ripemd160Mod extends Shortcut {
  
  @JSImport("crypto-js/ripemd160", JSImport.Namespace)
  @js.native
  val ^ : HasherHelper = js.native
  
  type _To = HasherHelper
  
  /* This means you don't have to write `^`, but can instead just say `ripemd160Mod.foo` */
  override def _to: HasherHelper = ^
}
