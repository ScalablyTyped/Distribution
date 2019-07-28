package typings.createDashHmac.createDashHmacMod

import typings.node.Buffer
import typings.node.cryptoMod.Hmac
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("create-hmac", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(algo: Algorithm, key: String | Buffer): Hmac = js.native
}

