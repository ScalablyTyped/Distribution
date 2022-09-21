package typings.bitcoinComputerBitcore.mod.Bitcoin

import typings.bitcoinComputerBitcore.mod.Bitcoin.crypto.BN
import typings.bitcoinComputerBitcore.mod.Bitcoin.crypto.Point
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoin-computer-bitcore", "Bitcoin.PublicKey")
@js.native
open class PublicKey protected () extends StObject {
  def this(source: String) = this()
  def this(source: Point) = this()
  def this(source: Buffer) = this()
  
  val point: Point = js.native
  
  def toAddress(): Address = js.native
  
  def toBuffer(): Buffer = js.native
  
  def toDER(): Buffer = js.native
}
object PublicKey {
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.PublicKey")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromBuffer(buffer: Buffer): PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[PublicKey]
  inline def fromBuffer(buffer: Buffer, strict: Boolean): PublicKey = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[PublicKey]
  
  /* static member */
  inline def fromPrivateKey(privateKey: PrivateKey): PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivateKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[PublicKey]
  
  /* static member */
  inline def fromString(str: String): PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[PublicKey]
  inline def fromString(str: String, encoding: String): PublicKey = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[PublicKey]
  
  /* static member */
  inline def fromX(odd: Boolean, bn: BN): PublicKey = (^.asInstanceOf[js.Dynamic].applyDynamic("fromX")(odd.asInstanceOf[js.Any], bn.asInstanceOf[js.Any])).asInstanceOf[PublicKey]
  inline def fromX(odd: Boolean, bn: Buffer): PublicKey = (^.asInstanceOf[js.Dynamic].applyDynamic("fromX")(odd.asInstanceOf[js.Any], bn.asInstanceOf[js.Any])).asInstanceOf[PublicKey]
}
