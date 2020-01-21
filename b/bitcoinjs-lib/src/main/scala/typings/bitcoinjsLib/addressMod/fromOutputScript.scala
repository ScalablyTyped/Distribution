package typings.bitcoinjsLib.addressMod

import typings.bitcoinjsLib.networksMod.Network
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/address", "fromOutputScript")
@js.native
object fromOutputScript extends js.Object {
  def apply(output: Buffer): String = js.native
  def apply(output: Buffer, network: Network): String = js.native
}

