package typings.bitcoreDashLib.bitcoreDashLibMod

import typings.bitcoreDashLib.bitcoreDashLibMod.NetworksNs.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcore-lib", "PrivateKey")
@js.native
class PrivateKey () extends js.Object {
  def this(key: String) = this()
  def this(key: String, network: Network) = this()
  val network: Network = js.native
  val publicKey: PublicKey = js.native
  def toAddress(): Address = js.native
  def toJSON(): js.Object = js.native
  def toObject(): js.Object = js.native
  def toPublicKey(): PublicKey = js.native
  def toWIF(): String = js.native
}

