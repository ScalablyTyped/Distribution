package typings.atAwsDashSdkSha256DashTreeDashHash.atAwsDashSdkSha256DashTreeDashHashMod

import typings.atAwsDashSdkTypes.buildCryptoMod.Hash
import typings.atAwsDashSdkTypes.buildCryptoMod.HashConstructor
import typings.atAwsDashSdkTypes.buildUtilMod.Decoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/sha256-tree-hash", "TreeHash")
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

