package typings
package cookieDashSignatureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookie-signature", JSImport.Namespace)
@js.native
object cookieDashSignatureMod extends js.Object {
  def sign(value: java.lang.String, secret: java.lang.String): java.lang.String = js.native
  def unsign(value: java.lang.String, secret: java.lang.String): java.lang.String | scala.Boolean = js.native
}

