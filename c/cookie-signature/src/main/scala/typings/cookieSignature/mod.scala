package typings.cookieSignature

import typings.cookieSignature.cookieSignatureBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cookie-signature", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def sign(value: String, secret: String): String = js.native
  
  def unsign(value: String, secret: String): String | `false` = js.native
}
