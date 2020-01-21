package typings.awsSdkSha256TreeHash

import typings.awsSdkTypes.cryptoMod.Hash
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.utilMod.Decoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/sha256-tree-hash", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class TreeHash protected () extends Hash {
    /**
      * Initializes a TreeHash.
      * @param Sha256 A Sha256 hash constructor.
      */
    def this(Sha256: HashConstructor, fromUtf8: Decoder) = this()
    val Sha256: js.Any = js.native
    var buffer: js.UndefOr[js.Any] = js.native
    var collectedHashDigests: js.Any = js.native
    /**
      * Converts source data into a Uint8Array.
      * @param data Data to convert to a Uint8Array.
      */
    var convertToBuffer: js.Any = js.native
    val fromUtf8: js.Any = js.native
    /**
      * Generates Sha256 hashes from 1 MiB chunks of the
      * internal buffer.
      * Will set the internal buffer to any bytes remaining
      * that is less than 1 MiB.
      */
    var hashBuffer: js.Any = js.native
  }
  
}

