package typings
package bitcoreDashLibLib.bitcoreDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcore-lib", "HDPublicKey")
@js.native
class HDPublicKey protected () extends js.Object {
  def this(arg: java.lang.String) = this()
  def this(arg: js.Object) = this()
  def this(arg: nodeLib.Buffer) = this()
  val depth: scala.Double = js.native
  val fingerPrint: nodeLib.Buffer = js.native
  val network: bitcoreDashLibLib.bitcoreDashLibMod.NetworksNs.Network = js.native
  val publicKey: PublicKey = js.native
  val xpubkey: nodeLib.Buffer = js.native
  def derive(arg: java.lang.String): HDPublicKey = js.native
  def derive(arg: java.lang.String, hardened: scala.Boolean): HDPublicKey = js.native
  def derive(arg: scala.Double): HDPublicKey = js.native
  def derive(arg: scala.Double, hardened: scala.Boolean): HDPublicKey = js.native
  def deriveChild(arg: java.lang.String): HDPublicKey = js.native
  def deriveChild(arg: java.lang.String, hardened: scala.Boolean): HDPublicKey = js.native
  def deriveChild(arg: scala.Double): HDPublicKey = js.native
  def deriveChild(arg: scala.Double, hardened: scala.Boolean): HDPublicKey = js.native
}

