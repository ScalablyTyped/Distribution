package typings.bitcoinjsDashLib.bitcoinjsDashLibMod

import typings.bitcoinjsDashLib.Anon_Data
import typings.bitcoinjsDashLib.Anon_Hash
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib", "address")
@js.native
object address extends js.Object {
  def fromBase58Check(address: String): Anon_Hash = js.native
  /** @since 3.2.0 */
  def fromBech32(address: String): Anon_Data = js.native
  def fromOutputScript(output: Buffer): String = js.native
  def fromOutputScript(output: Buffer, network: Network): String = js.native
  def toBase58Check(hash: Buffer, version: Double): String = js.native
  /** @since 3.2.0 */
  def toBech32(data: Buffer, version: Double, prefix: String): String = js.native
  def toOutputScript(address: String): Buffer = js.native
  def toOutputScript(address: String, network: Network): Buffer = js.native
}

