package typings
package createDashHmacLib.createDashHmacMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("create-hmac", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    algo: createDashHmacLib.createDashHmacMod.createHmacNs.Algorithm,
    key: java.lang.String | nodeLib.Buffer
  ): nodeLib.cryptoMod.Hmac = js.native
}

