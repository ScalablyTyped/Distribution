package typings.bitcoreDashLib.bitcoreDashLibMod

import typings.bitcoreDashLib.bitcoreDashLibMod.NetworksNs.Network
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcore-lib", "Address")
@js.native
class Address protected () extends js.Object {
  def this(data: String) = this()
  def this(data: js.Object) = this()
  def this(data: Buffer) = this()
  def this(data: Uint8Array) = this()
  def this(data: String, network: Network) = this()
  def this(data: js.Object, network: Network) = this()
  def this(data: Buffer, network: Network) = this()
  def this(data: Uint8Array, network: Network) = this()
  def this(data: String, network: Network, `type`: String) = this()
  def this(data: js.Object, network: Network, `type`: String) = this()
  def this(data: Buffer, network: Network, `type`: String) = this()
  def this(data: Uint8Array, network: Network, `type`: String) = this()
  val hashBuffer: Buffer = js.native
  val network: Network = js.native
  val `type`: String = js.native
}

