package typings
package bitcoreDashLibLib.bitcoreDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcore-lib", "Address")
@js.native
class Address protected () extends js.Object {
  def this(data: java.lang.String) = this()
  def this(data: js.Object) = this()
  def this(data: nodeLib.Buffer) = this()
  def this(data: stdLib.Uint8Array) = this()
  def this(data: java.lang.String, network: bitcoreDashLibLib.bitcoreDashLibMod.NetworksNs.Network) = this()
  def this(data: js.Object, network: bitcoreDashLibLib.bitcoreDashLibMod.NetworksNs.Network) = this()
  def this(data: nodeLib.Buffer, network: bitcoreDashLibLib.bitcoreDashLibMod.NetworksNs.Network) = this()
  def this(data: stdLib.Uint8Array, network: bitcoreDashLibLib.bitcoreDashLibMod.NetworksNs.Network) = this()
  def this(data: java.lang.String, network: bitcoreDashLibLib.bitcoreDashLibMod.NetworksNs.Network, `type`: java.lang.String) = this()
  def this(data: js.Object, network: bitcoreDashLibLib.bitcoreDashLibMod.NetworksNs.Network, `type`: java.lang.String) = this()
  def this(data: nodeLib.Buffer, network: bitcoreDashLibLib.bitcoreDashLibMod.NetworksNs.Network, `type`: java.lang.String) = this()
  def this(data: stdLib.Uint8Array, network: bitcoreDashLibLib.bitcoreDashLibMod.NetworksNs.Network, `type`: java.lang.String) = this()
  val hashBuffer: nodeLib.Buffer = js.native
  val network: bitcoreDashLibLib.bitcoreDashLibMod.NetworksNs.Network = js.native
  val `type`: java.lang.String = js.native
}

