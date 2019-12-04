package typings.bip32

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip32/types/crypto", JSImport.Namespace)
@js.native
object typesCryptoMod extends js.Object {
  def hash160(buffer: Buffer): Buffer = js.native
  def hmacSHA512(key: Buffer, data: Buffer): Buffer = js.native
}

