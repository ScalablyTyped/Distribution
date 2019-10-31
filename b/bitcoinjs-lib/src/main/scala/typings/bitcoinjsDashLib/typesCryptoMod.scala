package typings.bitcoinjsDashLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/crypto", JSImport.Namespace)
@js.native
object typesCryptoMod extends js.Object {
  def hash160(buffer: Buffer): Buffer = js.native
  def hash256(buffer: Buffer): Buffer = js.native
  def ripemd160(buffer: Buffer): Buffer = js.native
  def sha1(buffer: Buffer): Buffer = js.native
  def sha256(buffer: Buffer): Buffer = js.native
}

