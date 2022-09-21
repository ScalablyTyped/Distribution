package typings.bitcoreLibCash.mod

import typings.bitcoreLibCash.mod.Networks.Network
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcore-lib-cash", "HDPrivateKey")
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
  
  def getSerializedError(data: String): Null | js.Error = js.native
  def getSerializedError(data: String, network: String): Null | js.Error = js.native
  def getSerializedError(data: String, network: Network): Null | js.Error = js.native
  def getSerializedError(data: Buffer): Null | js.Error = js.native
  def getSerializedError(data: Buffer, network: String): Null | js.Error = js.native
  def getSerializedError(data: Buffer, network: Network): Null | js.Error = js.native
  
  val hdPublicKey: HDPublicKey = js.native
  
  def inspect(): String = js.native
  
  def isValidPath(arg: String): Boolean = js.native
  def isValidPath(arg: String, hardened: Boolean): Boolean = js.native
  def isValidPath(arg: Double): Boolean = js.native
  def isValidPath(arg: Double, hardened: Boolean): Boolean = js.native
  
  def isValidSerialized(data: String): Boolean = js.native
  def isValidSerialized(data: String, network: String): Boolean = js.native
  def isValidSerialized(data: String, network: Network): Boolean = js.native
  def isValidSerialized(data: Buffer): Boolean = js.native
  def isValidSerialized(data: Buffer, network: String): Boolean = js.native
  def isValidSerialized(data: Buffer, network: Network): Boolean = js.native
  
  val privateKey: PrivateKey = js.native
  
  def toBuffer(): Buffer = js.native
  
  def toJSON(): js.Object = js.native
  
  def toObject(): js.Object = js.native
}
/* static members */
object HDPrivateKey {
  
  @JSImport("bitcore-lib-cash", "HDPrivateKey")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromObject(obj: js.Object): HDPrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[HDPrivateKey]
  
  inline def fromSeed(hexa: String): HDPrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(hexa.asInstanceOf[js.Any]).asInstanceOf[HDPrivateKey]
  inline def fromSeed(hexa: String, network: String): HDPrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(hexa.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[HDPrivateKey]
  inline def fromSeed(hexa: String, network: Network): HDPrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(hexa.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[HDPrivateKey]
  inline def fromSeed(hexa: Buffer): HDPrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(hexa.asInstanceOf[js.Any]).asInstanceOf[HDPrivateKey]
  inline def fromSeed(hexa: Buffer, network: String): HDPrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(hexa.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[HDPrivateKey]
  inline def fromSeed(hexa: Buffer, network: Network): HDPrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(hexa.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[HDPrivateKey]
  
  inline def fromString(arg: String): HDPrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(arg.asInstanceOf[js.Any]).asInstanceOf[HDPrivateKey]
}
