package typings.bitcoinjsLib.ecpairMod

import typings.bitcoinjsLib.networksMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/ecpair", "fromWIF")
@js.native
object fromWIF extends js.Object {
  def apply(wifString: String): ECPair = js.native
  def apply(wifString: String, network: js.Array[Network]): ECPair = js.native
  def apply(wifString: String, network: Network): ECPair = js.native
}

