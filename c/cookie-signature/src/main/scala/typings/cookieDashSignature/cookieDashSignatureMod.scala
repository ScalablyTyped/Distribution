package typings.cookieDashSignature

import typings.cookieDashSignature.cookieDashSignatureBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookie-signature", JSImport.Namespace)
@js.native
object cookieDashSignatureMod extends js.Object {
  def sign(value: String, secret: String): String = js.native
  def unsign(value: String, secret: String): String | `false` = js.native
}

