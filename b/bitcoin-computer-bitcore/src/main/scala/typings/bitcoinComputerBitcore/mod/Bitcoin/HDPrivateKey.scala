package typings.bitcoinComputerBitcore.mod.Bitcoin

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoin-computer-bitcore", "Bitcoin.HDPrivateKey")
@js.native
open class HDPrivateKey () extends StObject {
  def this(data: String) = this()
  def this(data: js.Object) = this()
  def this(data: Buffer) = this()
  
  def derive(arg: String): HDPrivateKey = js.native
  def derive(arg: String, hardened: Boolean): HDPrivateKey = js.native
  def derive(arg: Double): HDPrivateKey = js.native
  def derive(arg: Double, hardened: Boolean): HDPrivateKey = js.native
  
  def deriveChild(arg: String): HDPrivateKey = js.native
  def deriveChild(arg: String, hardened: Boolean): HDPrivateKey = js.native
  def deriveChild(arg: Double): HDPrivateKey = js.native
  def deriveChild(arg: Double, hardened: Boolean): HDPrivateKey = js.native
  
  def deriveNonCompliantChild(arg: String): HDPrivateKey = js.native
  def deriveNonCompliantChild(arg: String, hardened: Boolean): HDPrivateKey = js.native
  def deriveNonCompliantChild(arg: Double): HDPrivateKey = js.native
  def deriveNonCompliantChild(arg: Double, hardened: Boolean): HDPrivateKey = js.native
  
  val hdPublicKey: HDPublicKey = js.native
  
  val privateKey: PrivateKey = js.native
  
  val publicKey: PublicKey = js.native
  
  def toJSON(): js.Object = js.native
  
  def toObject(): js.Object = js.native
}
object HDPrivateKey {
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.HDPrivateKey")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromString(s: String): HDPrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(s.asInstanceOf[js.Any]).asInstanceOf[HDPrivateKey]
  inline def fromString(s: String, _underscore: Any): HDPrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(s.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any])).asInstanceOf[HDPrivateKey]
}
