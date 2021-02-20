package typings.cryptoJs

import org.scalablytyped.runtime.Shortcut
import typings.cryptoJs.mod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encHexMod extends Shortcut {
  
  @JSImport("crypto-js/enc-hex", JSImport.Namespace)
  @js.native
  val ^ : Encoder = js.native
  
  type _To = Encoder
  
  /* This means you don't have to write `^`, but can instead just say `encHexMod.foo` */
  override def _to: Encoder = ^
}
