package typings.bitcoreLibCash.mod

import typings.bitcoreLibCash.mod.Networks.Network
import typings.bitcoreLibCash.mod.crypto.Signature
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcore-lib-cash", "Script")
@js.native
open class Script protected () extends StObject {
  def this(data: String) = this()
  def this(data: js.Object) = this()
  def this(data: Script) = this()
  def this(data: Buffer) = this()
  
  def add(obj: Any): this.type = js.native
  
  def checkMinimalPush(i: Double): Boolean = js.native
  
  def classify(): String = js.native
  
  def classifyInput(): String = js.native
  
  def classifyOutput(): String = js.native
  
  def equals(script: Script): Boolean = js.native
  
  def findAndDelete(script: Script): this.type = js.native
  
  def getAddressInfo(): Address | Boolean = js.native
  
  def getData(): Buffer = js.native
  
  def getPublicKey(): Buffer = js.native
  
  def getPublicKeyHash(): Buffer = js.native
  
  def getSignatureOperationsCount(accurate: Boolean): Double = js.native
  
  def hasCodeseparators(): Boolean = js.native
  
  def isDataOut(): Boolean = js.native
  
  def isMultisigIn(): Boolean = js.native
  
  def isMultisigOut(): Boolean = js.native
  
  def isPublicKeyHashIn(): Boolean = js.native
  
  def isPublicKeyHashOut(): Boolean = js.native
  
  def isPublicKeyIn(): Boolean = js.native
  
  def isPublicKeyOut(): Boolean = js.native
  
  def isPushOnly(): Boolean = js.native
  
  def isScriptHashIn(): Boolean = js.native
  
  def isScriptHashOut(): Boolean = js.native
  
  def isStandard(): Boolean = js.native
  
  def prepend(obj: Any): this.type = js.native
  
  def removeCodeseparators(): this.type = js.native
  
  def set(obj: js.Object): this.type = js.native
  
  def toASM(): String = js.native
  
  def toAddress(): Address = js.native
  def toAddress(network: String): Address = js.native
  def toAddress(network: Network): Address = js.native
  
  def toBuffer(): Buffer = js.native
  
  def toHex(): String = js.native
}
/* static members */
object Script {
  
  @JSImport("bitcore-lib-cash", "Script")
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildDataOut(data: String): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("buildDataOut")(data.asInstanceOf[js.Any]).asInstanceOf[Script]
  inline def buildDataOut(data: String, encoding: String): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildDataOut")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Script]
  inline def buildDataOut(data: Buffer): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("buildDataOut")(data.asInstanceOf[js.Any]).asInstanceOf[Script]
  inline def buildDataOut(data: Buffer, encoding: String): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildDataOut")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Script]
  
  inline def buildMultisigIn(pubkeys: js.Array[PublicKey], threshold: Double, signatures: js.Array[Buffer], opts: js.Object): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMultisigIn")(pubkeys.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], signatures.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Script]
  
  inline def buildMultisigOut(publicKeys: js.Array[PublicKey], threshold: Double, opts: js.Object): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMultisigOut")(publicKeys.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Script]
  
  inline def buildP2SHMultisigIn(pubkeys: js.Array[PublicKey], threshold: Double, signatures: js.Array[Buffer], opts: js.Object): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildP2SHMultisigIn")(pubkeys.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], signatures.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Script]
  
  inline def buildPublicKeyHashIn(publicKey: PublicKey, signature: Signature, sigtype: Double): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyHashIn")(publicKey.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], sigtype.asInstanceOf[js.Any])).asInstanceOf[Script]
  inline def buildPublicKeyHashIn(publicKey: PublicKey, signature: Buffer, sigtype: Double): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyHashIn")(publicKey.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], sigtype.asInstanceOf[js.Any])).asInstanceOf[Script]
  
  inline def buildPublicKeyHashOut(address: Address): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyHashOut")(address.asInstanceOf[js.Any]).asInstanceOf[Script]
  
  inline def buildPublicKeyIn(signature: Signature, sigtype: Double): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyIn")(signature.asInstanceOf[js.Any], sigtype.asInstanceOf[js.Any])).asInstanceOf[Script]
  inline def buildPublicKeyIn(signature: Buffer, sigtype: Double): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyIn")(signature.asInstanceOf[js.Any], sigtype.asInstanceOf[js.Any])).asInstanceOf[Script]
  
  inline def buildPublicKeyOut(pubkey: PublicKey): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyOut")(pubkey.asInstanceOf[js.Any]).asInstanceOf[Script]
  
  inline def buildScriptHashOut(script: Script): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("buildScriptHashOut")(script.asInstanceOf[js.Any]).asInstanceOf[Script]
  
  inline def empty(): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Script]
  
  inline def fromASM(str: String): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("fromASM")(str.asInstanceOf[js.Any]).asInstanceOf[Script]
  
  inline def fromAddress(address: Address): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Script]
  
  inline def fromBuffer(str: Buffer): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(str.asInstanceOf[js.Any]).asInstanceOf[Script]
  
  inline def fromHex(str: String): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(str.asInstanceOf[js.Any]).asInstanceOf[Script]
  
  inline def fromString(str: String): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[Script]
  
  object types {
    
    @JSImport("bitcore-lib-cash", "Script.types")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitcore-lib-cash", "Script.types.DATA_OUT")
    @js.native
    def DATA_OUT: String = js.native
    inline def DATA_OUT_=(x: String): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_OUT")(x.asInstanceOf[js.Any])
  }
}
