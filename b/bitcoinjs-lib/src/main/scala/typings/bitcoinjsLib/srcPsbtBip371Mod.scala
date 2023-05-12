package typings.bitcoinjsLib

import typings.bip174.srcLibInterfacesMod.PsbtInput
import typings.bip174.srcLibInterfacesMod.PsbtOutput
import typings.bip174.srcLibInterfacesMod.TapLeaf
import typings.bitcoinjsLib.anon.FinalScriptWitness
import typings.bitcoinjsLib.srcTypesMod.Taptree
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPsbtBip371Mod {
  
  @JSImport("bitcoinjs-lib/src/psbt/bip371", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkTaprootInputFields(inputData: PsbtInput, newInputData: PsbtInput, action: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkTaprootInputFields")(inputData.asInstanceOf[js.Any], newInputData.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkTaprootInputForSigs(input: PsbtInput, action: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkTaprootInputForSigs")(input.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def checkTaprootOutputFields(outputData: PsbtOutput, newOutputData: PsbtOutput, action: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkTaprootOutputFields")(outputData.asInstanceOf[js.Any], newOutputData.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isTaprootInput(input: PsbtInput): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTaprootInput")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTaprootOutput(output: PsbtOutput): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTaprootOutput")(output.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isTaprootOutput(output: PsbtOutput, script: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTaprootOutput")(output.asInstanceOf[js.Any], script.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def serializeTaprootSignature(sig: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeTaprootSignature")(sig.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def serializeTaprootSignature(sig: Buffer, sighashType: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeTaprootSignature")(sig.asInstanceOf[js.Any], sighashType.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def tapScriptFinalizer(inputIndex: Double, input: PsbtInput): FinalScriptWitness = (^.asInstanceOf[js.Dynamic].applyDynamic("tapScriptFinalizer")(inputIndex.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[FinalScriptWitness]
  inline def tapScriptFinalizer(inputIndex: Double, input: PsbtInput, tapLeafHashToFinalize: Buffer): FinalScriptWitness = (^.asInstanceOf[js.Dynamic].applyDynamic("tapScriptFinalizer")(inputIndex.asInstanceOf[js.Any], input.asInstanceOf[js.Any], tapLeafHashToFinalize.asInstanceOf[js.Any])).asInstanceOf[FinalScriptWitness]
  
  inline def tapTreeFromList(): Taptree = ^.asInstanceOf[js.Dynamic].applyDynamic("tapTreeFromList")().asInstanceOf[Taptree]
  inline def tapTreeFromList(leaves: js.Array[TapLeaf]): Taptree = ^.asInstanceOf[js.Dynamic].applyDynamic("tapTreeFromList")(leaves.asInstanceOf[js.Any]).asInstanceOf[Taptree]
  
  inline def tapTreeToList(tree: Taptree): js.Array[TapLeaf] = ^.asInstanceOf[js.Dynamic].applyDynamic("tapTreeToList")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Array[TapLeaf]]
  
  inline def toXOnly(pubKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toXOnly")(pubKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def tweakInternalPubKey(inputIndex: Double, input: PsbtInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("tweakInternalPubKey")(inputIndex.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
