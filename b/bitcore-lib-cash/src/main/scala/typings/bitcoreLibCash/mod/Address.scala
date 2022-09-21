package typings.bitcoreLibCash.mod

import typings.bitcoreLibCash.mod.Networks.Network
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcore-lib-cash", "Address")
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
  
  def getValidationError(data: String): Null | js.Error = js.native
  def getValidationError(data: String, network: String): Null | js.Error = js.native
  def getValidationError(data: String, network: String, `type`: String): Null | js.Error = js.native
  def getValidationError(data: String, network: scala.Unit, `type`: String): Null | js.Error = js.native
  def getValidationError(data: String, network: Network): Null | js.Error = js.native
  def getValidationError(data: String, network: Network, `type`: String): Null | js.Error = js.native
  
  val hashBuffer: Buffer = js.native
  
  def inspect(): String = js.native
  
  def isPayToPublicKeyHash(): Boolean = js.native
  
  def isPayToScriptHash(): Boolean = js.native
  
  def isValid(data: String): Boolean = js.native
  def isValid(data: String, network: String): Boolean = js.native
  def isValid(data: String, network: String, `type`: String): Boolean = js.native
  def isValid(data: String, network: scala.Unit, `type`: String): Boolean = js.native
  def isValid(data: String, network: Network): Boolean = js.native
  def isValid(data: String, network: Network, `type`: String): Boolean = js.native
  
  val network: Network = js.native
  
  def toBuffer(): Buffer = js.native
  
  def toCashAddress(): String = js.native
  
  def toCashBuffer(): Buffer = js.native
  
  def toLegacyAddress(): String = js.native
  
  def toObject(): js.Object = js.native
  
  val `type`: String = js.native
}
/* static members */
object Address {
  
  @JSImport("bitcore-lib-cash", "Address")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMultisig(publicKeys: js.Array[PublicKey], threshold: Double, network: String): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("createMultisig")(publicKeys.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def createMultisig(publicKeys: js.Array[PublicKey], threshold: Double, network: Network): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("createMultisig")(publicKeys.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
  
  inline def decodeCashAddress(address: String): CashAddressDecoding = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeCashAddress")(address.asInstanceOf[js.Any]).asInstanceOf[CashAddressDecoding]
  
  inline def fromBuffer(buffer: Buffer): Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Address]
  inline def fromBuffer(buffer: Buffer, network: String): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromBuffer(buffer: Buffer, network: String, `type`: String): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], network.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromBuffer(buffer: Buffer, network: scala.Unit, `type`: String): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], network.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromBuffer(buffer: Buffer, network: Network): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromBuffer(buffer: Buffer, network: Network, `type`: String): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], network.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Address]
  
  inline def fromObject(obj: js.Object): Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Address]
  
  inline def fromPublicKey(data: PublicKey, network: String): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPublicKey")(data.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromPublicKey(data: PublicKey, network: Network): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPublicKey")(data.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
  
  inline def fromPublicKeyHash(hash: Buffer, network: String): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPublicKeyHash")(hash.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromPublicKeyHash(hash: Buffer, network: Network): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPublicKeyHash")(hash.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
  
  inline def fromScript(script: Script, network: String): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScript")(script.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromScript(script: Script, network: Network): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScript")(script.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
  
  inline def fromScriptHash(hash: Buffer, network: String): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScriptHash")(hash.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromScriptHash(hash: Buffer, network: Network): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScriptHash")(hash.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
  
  inline def fromString(str: String): Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[Address]
  inline def fromString(str: String, network: String): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromString(str: String, network: String, `type`: String): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], network.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromString(str: String, network: scala.Unit, `type`: String): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], network.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromString(str: String, network: Network): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def fromString(str: String, network: Network, `type`: String): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], network.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Address]
  
  inline def payingTo(script: Script, network: String): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("payingTo")(script.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
  inline def payingTo(script: Script, network: Network): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("payingTo")(script.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Address]
}
