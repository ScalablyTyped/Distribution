package typings.bitcoreLibCash.mod

import typings.bitcoreLibCash.mod.Networks.Network
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcore-lib-cash", "Address")
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
  def this(data: String, network: js.UndefOr[scala.Nothing], `type`: String) = this()
  def this(data: String, network: Network, `type`: String) = this()
  def this(data: js.Object, network: js.UndefOr[scala.Nothing], `type`: String) = this()
  def this(data: js.Object, network: Network, `type`: String) = this()
  def this(data: Buffer, network: js.UndefOr[scala.Nothing], `type`: String) = this()
  def this(data: Buffer, network: Network, `type`: String) = this()
  def this(data: Uint8Array, network: js.UndefOr[scala.Nothing], `type`: String) = this()
  def this(data: Uint8Array, network: Network, `type`: String) = this()
  
  val hashBuffer: Buffer = js.native
  
  val network: Network = js.native
  
  val `type`: String = js.native
}
