package typings.createHmac.mod

import typings.node.Buffer
import typings.node.cryptoMod.Hmac
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("create-hmac", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(algo: Algorithm, key: String): Hmac = js.native
  def apply(algo: Algorithm, key: Buffer): Hmac = js.native
}

