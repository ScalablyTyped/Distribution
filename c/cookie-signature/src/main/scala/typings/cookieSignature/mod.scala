package typings.cookieSignature

import typings.cookieSignature.cookieSignatureBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cookie-signature", "sign")
  @js.native
  def sign(value: String, secret: String): String = js.native
  
  @JSImport("cookie-signature", "unsign")
  @js.native
  def unsign(value: String, secret: String): String | `false` = js.native
}
