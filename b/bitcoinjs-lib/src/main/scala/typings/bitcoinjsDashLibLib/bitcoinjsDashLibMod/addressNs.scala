package typings
package bitcoinjsDashLibLib.bitcoinjsDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib", "address")
@js.native
object addressNs extends js.Object {
  def fromBase58Check(address: java.lang.String): bitcoinjsDashLibLib.Anon_Hash = js.native
  /** @since 3.2.0 */
  def fromBech32(address: java.lang.String): bitcoinjsDashLibLib.Anon_Prefix = js.native
  def fromOutputScript(output: nodeLib.Buffer): java.lang.String = js.native
  def fromOutputScript(output: nodeLib.Buffer, network: bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network): java.lang.String = js.native
  def toBase58Check(hash: nodeLib.Buffer, version: scala.Double): java.lang.String = js.native
  /** @since 3.2.0 */
  def toBech32(data: nodeLib.Buffer, version: scala.Double, prefix: java.lang.String): java.lang.String = js.native
  def toOutputScript(address: java.lang.String): nodeLib.Buffer = js.native
  def toOutputScript(address: java.lang.String, network: bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network): nodeLib.Buffer = js.native
}

