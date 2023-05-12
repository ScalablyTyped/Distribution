package typings.bitcoinjsLib

import typings.bip174.srcLibInterfacesMod.PsbtInput
import typings.bitcoinjsLib.anon.HashType
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPsbtPsbtutilsMod {
  
  @JSImport("bitcoinjs-lib/src/psbt/psbtutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkInputForSig(input: PsbtInput, action: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkInputForSig")(input.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isP2MS(script: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isP2MS")(script.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isP2PK(script: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isP2PK")(script.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isP2PKH(script: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isP2PKH")(script.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isP2SHScript(script: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isP2SHScript")(script.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isP2TR(script: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isP2TR")(script.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isP2WPKH(script: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isP2WPKH")(script.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isP2WSHScript(script: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isP2WSHScript")(script.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def pubkeyInScript(pubkey: Buffer, script: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pubkeyInScript")(pubkey.asInstanceOf[js.Any], script.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def pubkeyPositionInScript(pubkey: Buffer, script: Buffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pubkeyPositionInScript")(pubkey.asInstanceOf[js.Any], script.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def signatureBlocksAction(signature: Buffer, signatureDecodeFn: SignatureDecodeFunc, action: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("signatureBlocksAction")(signature.asInstanceOf[js.Any], signatureDecodeFn.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def witnessStackToScriptWitness(witness: js.Array[Buffer]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("witnessStackToScriptWitness")(witness.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  type SignatureDecodeFunc = js.Function1[/* buffer */ Buffer, HashType]
}
