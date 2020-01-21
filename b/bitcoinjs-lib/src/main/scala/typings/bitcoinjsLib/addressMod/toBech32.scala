package typings.bitcoinjsLib.addressMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/address", "toBech32")
@js.native
object toBech32 extends js.Object {
  def apply(data: Buffer, version: Double, prefix: String): String = js.native
}

