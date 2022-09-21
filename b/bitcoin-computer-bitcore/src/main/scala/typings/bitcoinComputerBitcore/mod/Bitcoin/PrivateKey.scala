package typings.bitcoinComputerBitcore.mod.Bitcoin

import typings.bitcoinComputerBitcore.mod.Bitcoin.Networks.Network
import typings.bitcoinComputerBitcore.mod.Bitcoin.crypto.Point
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoin-computer-bitcore", "Bitcoin.PrivateKey")
@js.native
open class PrivateKey () extends StObject {
  def this(key: String) = this()
  def this(key: String, network: Network) = this()
  def this(key: scala.Unit, network: Network) = this()
  
  val network: Network = js.native
  
  val point: Point = js.native
  
  val publicKey: PublicKey = js.native
  
  def toAddress(): Address = js.native
  
  def toBuffer(): Buffer = js.native
  
  def toJSON(): js.Object = js.native
  
  def toObject(): js.Object = js.native
  
  def toPublicKey(): PublicKey = js.native
  
  def toWIF(): String = js.native
}
object PrivateKey {
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.PrivateKey")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromRandom(): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRandom")().asInstanceOf[PrivateKey]
  inline def fromRandom(network: String): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRandom")(network.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
}
