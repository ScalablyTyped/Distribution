package typings.cookieSignature

import typings.cookieSignature.cookieSignatureBooleans.`false`
import typings.node.cryptoMod.CipherKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cookie-signature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sign(value: String, secret: CipherKey): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(value.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def unsign(value: String, secret: CipherKey): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("unsign")(value.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
}
