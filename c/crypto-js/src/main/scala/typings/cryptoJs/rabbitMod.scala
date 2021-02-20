package typings.cryptoJs

import org.scalablytyped.runtime.Shortcut
import typings.cryptoJs.mod.CipherHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rabbitMod extends Shortcut {
  
  @JSImport("crypto-js/rabbit", JSImport.Namespace)
  @js.native
  val ^ : CipherHelper = js.native
  
  type _To = CipherHelper
  
  /* This means you don't have to write `^`, but can instead just say `rabbitMod.foo` */
  override def _to: CipherHelper = ^
}
