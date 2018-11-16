package typings
package bitcoreDashLibLib.bitcoreDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcore-lib", "PrivateKey")
@js.native
class PrivateKey () extends js.Object {
  def this(key: java.lang.String) = this()
  def this(key: java.lang.String, network: bitcoreDashLibLib.bitcoreDashLibMod.NetworksNs.Network) = this()
  val network: bitcoreDashLibLib.bitcoreDashLibMod.NetworksNs.Network = js.native
  val publicKey: PublicKey = js.native
  def toAddress(): Address = js.native
  def toJSON(): js.Object = js.native
  def toObject(): js.Object = js.native
  def toPublicKey(): PublicKey = js.native
  def toWIF(): java.lang.String = js.native
}

