package typings.bitcoinComputerBitcore.mod.Bitcoin

import typings.bitcoinComputerBitcore.anon.Buf
import typings.bitcoinComputerBitcore.mod.Bitcoin.crypto.Signature
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoin-computer-bitcore", "Bitcoin.Script")
@js.native
open class Script () extends StObject {
  def this(data: String) = this()
  def this(data: js.Object) = this()
  
  def add(obj: Any): this.type = js.native
  
  def checkMinimalPush(i: Double): Boolean = js.native
  
  var chunks: js.Array[Buf] = js.native
  
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
  
  def inspect(): String = js.native
  
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
  
  def isWitnessProgram(): Boolean = js.native
  
  def isWitnessPublicKeyHashOut(): Boolean = js.native
  
  def isWitnessScriptHashOut(): Boolean = js.native
  
  var length: Double = js.native
  
  def prepend(obj: Any): this.type = js.native
  
  def removeCodeseparators(): this.type = js.native
  
  def set(obj: js.Object): this.type = js.native
  
  def toASM(): String = js.native
  
  def toAddress(): Address = js.native
  
  def toBuffer(): Buffer = js.native
  
  def toHex(): String = js.native
}
object Script {
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.Script")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.Script.Interpreter")
  @js.native
  open class Interpreter () extends StObject {
    def this(data: String) = this()
    def this(data: js.Object) = this()
    
    def verify(scriptSig: Any, scriptPubkey: Any, tx: Transaction, nin: Double, flags: Double): Boolean = js.native
  }
  object Interpreter {
    
    @JSImport("bitcoin-computer-bitcore", "Bitcoin.Script.Interpreter")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("bitcoin-computer-bitcore", "Bitcoin.Script.Interpreter.SCRIPT_VERIFY_P2SH")
    @js.native
    def SCRIPT_VERIFY_P2SH: Double = js.native
    inline def SCRIPT_VERIFY_P2SH_=(x: Double): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCRIPT_VERIFY_P2SH")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bitcoin-computer-bitcore", "Bitcoin.Script.Interpreter.SCRIPT_VERIFY_STRICTENC")
    @js.native
    def SCRIPT_VERIFY_STRICTENC: Double = js.native
    inline def SCRIPT_VERIFY_STRICTENC_=(x: Double): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCRIPT_VERIFY_STRICTENC")(x.asInstanceOf[js.Any])
  }
  
  inline def buildDataOut(data: String): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("buildDataOut")(data.asInstanceOf[js.Any]).asInstanceOf[Script]
  inline def buildDataOut(data: String, encoding: String): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildDataOut")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Script]
  inline def buildDataOut(data: Buffer): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("buildDataOut")(data.asInstanceOf[js.Any]).asInstanceOf[Script]
  inline def buildDataOut(data: Buffer, encoding: String): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildDataOut")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Script]
  
  inline def buildMultisigIn(pubkeys: js.Array[PublicKey], threshold: Double, signatures: js.Array[Buffer], opts: js.Object): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMultisigIn")(pubkeys.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], signatures.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Script]
  
  inline def buildMultisigOut(publicKeys: js.Array[PublicKey], threshold: Double, opts: js.Object): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMultisigOut")(publicKeys.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Script]
  
  inline def buildP2SHMultisigIn(pubkeys: js.Array[PublicKey], threshold: Double, signatures: js.Array[Buffer], opts: js.Object): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildP2SHMultisigIn")(pubkeys.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], signatures.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Script]
  
  inline def buildPublicKeyHashIn(publicKey: PublicKey, signature: Signature): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyHashIn")(publicKey.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Script]
  inline def buildPublicKeyHashIn(publicKey: PublicKey, signature: Signature, sigtype: Double): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyHashIn")(publicKey.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], sigtype.asInstanceOf[js.Any])).asInstanceOf[Script]
  inline def buildPublicKeyHashIn(publicKey: PublicKey, signature: Buffer): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyHashIn")(publicKey.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Script]
  inline def buildPublicKeyHashIn(publicKey: PublicKey, signature: Buffer, sigtype: Double): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyHashIn")(publicKey.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], sigtype.asInstanceOf[js.Any])).asInstanceOf[Script]
  
  inline def buildPublicKeyHashOut(address: Address): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyHashOut")(address.asInstanceOf[js.Any]).asInstanceOf[Script]
  
  inline def buildPublicKeyIn(signature: Signature, sigtype: Double): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyIn")(signature.asInstanceOf[js.Any], sigtype.asInstanceOf[js.Any])).asInstanceOf[Script]
  inline def buildPublicKeyIn(signature: Buffer, sigtype: Double): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyIn")(signature.asInstanceOf[js.Any], sigtype.asInstanceOf[js.Any])).asInstanceOf[Script]
  
  inline def buildPublicKeyOut(pubkey: PublicKey): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyOut")(pubkey.asInstanceOf[js.Any]).asInstanceOf[Script]
  
  inline def buildScriptHashOut(script: Script): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("buildScriptHashOut")(script.asInstanceOf[js.Any]).asInstanceOf[Script]
  
  inline def buildWitnessMultisigOutFromScript(script: Script): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("buildWitnessMultisigOutFromScript")(script.asInstanceOf[js.Any]).asInstanceOf[Script]
  
  inline def empty(): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Script]
  
  inline def fromAddress(address: String): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Script]
  inline def fromAddress(address: Address): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Script]
  
  /* static member */
  inline def fromBuffer(origBuffer: Buffer): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(origBuffer.asInstanceOf[js.Any]).asInstanceOf[Script]
  
  /* static member */
  inline def fromString(string: String): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(string.asInstanceOf[js.Any]).asInstanceOf[Script]
  
  object types {
    
    @JSImport("bitcoin-computer-bitcore", "Bitcoin.Script.types")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitcoin-computer-bitcore", "Bitcoin.Script.types.DATA_OUT")
    @js.native
    def DATA_OUT: String = js.native
    inline def DATA_OUT_=(x: String): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_OUT")(x.asInstanceOf[js.Any])
  }
}
