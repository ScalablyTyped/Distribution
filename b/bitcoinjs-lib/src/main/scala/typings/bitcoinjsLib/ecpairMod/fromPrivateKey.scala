package typings.bitcoinjsLib.ecpairMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/ecpair", "fromPrivateKey")
@js.native
object fromPrivateKey extends js.Object {
  def apply(buffer: Buffer): ECPair = js.native
  def apply(buffer: Buffer, options: ECPairOptions): ECPair = js.native
}

