package typings.cryptoJs

import org.scalablytyped.runtime.Shortcut
import typings.cryptoJs.mod.HmacHasherHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hmacSha1Mod extends Shortcut {
  
  @JSImport("crypto-js/hmac-sha1", JSImport.Namespace)
  @js.native
  val ^ : HmacHasherHelper = js.native
  
  type _To = HmacHasherHelper
  
  /* This means you don't have to write `^`, but can instead just say `hmacSha1Mod.foo` */
  override def _to: HmacHasherHelper = ^
}
