package typings
package bitcoreDashLibLib.bitcoreDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcore-lib", "crypto")
@js.native
object cryptoNs extends js.Object {
  @js.native
  class BN () extends js.Object
  
  @js.native
  class Signature () extends js.Object {
    var SIGHASH_ALL: scala.Double = js.native
  }
  
  @JSName("ECDSA")
  @js.native
  object ECDSANs extends js.Object {
    def sign(message: nodeLib.Buffer, key: bitcoreDashLibLib.bitcoreDashLibMod.PrivateKey): bitcoreDashLibLib.bitcoreDashLibMod.cryptoNs.Signature = js.native
    def verify(
      hashbuf: nodeLib.Buffer,
      sig: bitcoreDashLibLib.bitcoreDashLibMod.cryptoNs.Signature,
      pubkey: bitcoreDashLibLib.bitcoreDashLibMod.PublicKey
    ): scala.Boolean = js.native
    @JSName("verify")
    def verify_little(
      hashbuf: nodeLib.Buffer,
      sig: bitcoreDashLibLib.bitcoreDashLibMod.cryptoNs.Signature,
      pubkey: bitcoreDashLibLib.bitcoreDashLibMod.PublicKey,
      endian: bitcoreDashLibLib.bitcoreDashLibLibStrings.little
    ): scala.Boolean = js.native
  }
  
  @JSName("Hash")
  @js.native
  object HashNs extends js.Object {
    def ripemd160(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
    def sha1(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
    def sha256(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
    def sha256hmac(data: nodeLib.Buffer, key: nodeLib.Buffer): nodeLib.Buffer = js.native
    def sha256ripemd160(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
    def sha256sha256(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
    def sha512(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
    def sha512hmac(data: nodeLib.Buffer, key: nodeLib.Buffer): nodeLib.Buffer = js.native
  }
  
  @JSName("Random")
  @js.native
  object RandomNs extends js.Object {
    def getRandomBuffer(size: scala.Double): nodeLib.Buffer = js.native
  }
  
  @js.native
  object Signature extends js.Object {
    def fromDER(sig: nodeLib.Buffer): bitcoreDashLibLib.bitcoreDashLibMod.cryptoNs.Signature = js.native
    def fromString(data: java.lang.String): bitcoreDashLibLib.bitcoreDashLibMod.cryptoNs.Signature = js.native
  }
  
}

