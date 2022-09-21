package typings.bitcoinComputerBitcore.mod.Bitcoin

import typings.bitcoinComputerBitcore.mod.Bitcoin.Networks.Network
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoin-computer-bitcore", "Bitcoin.Address")
@js.native
open class Address protected () extends StObject {
  def this(data: String) = this()
  def this(data: js.Object) = this()
  def this(data: js.typedarray.Uint8Array) = this()
  def this(data: Buffer) = this()
  def this(data: String, network: String) = this()
  def this(data: String, network: Network) = this()
  def this(data: js.Object, network: String) = this()
  def this(data: js.Object, network: Network) = this()
  def this(data: js.typedarray.Uint8Array, network: String) = this()
  def this(data: js.typedarray.Uint8Array, network: Network) = this()
  def this(data: Buffer, network: String) = this()
  def this(data: Buffer, network: Network) = this()
  def this(data: String, network: String, `type`: String) = this()
  def this(data: String, network: scala.Unit, `type`: String) = this()
  def this(data: String, network: Network, `type`: String) = this()
  def this(data: js.Object, network: String, `type`: String) = this()
  def this(data: js.Object, network: scala.Unit, `type`: String) = this()
  def this(data: js.Object, network: Network, `type`: String) = this()
  def this(data: js.typedarray.Uint8Array, network: String, `type`: String) = this()
  def this(data: js.typedarray.Uint8Array, network: scala.Unit, `type`: String) = this()
  def this(data: js.typedarray.Uint8Array, network: Network, `type`: String) = this()
  def this(data: Buffer, network: String, `type`: String) = this()
  def this(data: Buffer, network: scala.Unit, `type`: String) = this()
  def this(data: Buffer, network: Network, `type`: String) = this()
  
  val hashBuffer: Buffer = js.native
  
  val network: Network | String = js.native
  
  def toString(encoding: String): String = js.native
  
  val `type`: String = js.native
}
object Address {
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.Address")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createMultisig(publicKeys: js.Array[PublicKey], threshold: Double, network: String, nestedWitness: Boolean): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("createMultisig")(publicKeys.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], network.asInstanceOf[js.Any], nestedWitness.asInstanceOf[js.Any])).asInstanceOf[Address]
  
  /* static member */
  inline def fromPublicKey(hash: PublicKey): Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPublicKey")(hash.asInstanceOf[js.Any]).asInstanceOf[Address]
  
  /* static member */
  inline def fromPublicKeyHash(hash: Buffer): Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPublicKeyHash")(hash.asInstanceOf[js.Any]).asInstanceOf[Address]
  
  /* static member */
  inline def fromScript(script: Script, network: String): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScript")(script.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
  
  /* static member */
  inline def fromString(str: String): Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[Address]
  inline def fromString(str: String, network: Any): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromString(str: String, network: Any, `type`: Any): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], network.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromString(str: String, network: Any, `type`: Any, format: Any): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], network.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromString(str: String, network: Any, `type`: scala.Unit, format: Any): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], network.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromString(str: String, network: scala.Unit, `type`: Any): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], network.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromString(str: String, network: scala.Unit, `type`: Any, format: Any): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], network.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromString(str: String, network: scala.Unit, `type`: scala.Unit, format: Any): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], network.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Address]
}
