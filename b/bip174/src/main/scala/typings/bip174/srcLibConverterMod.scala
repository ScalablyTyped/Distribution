package typings.bip174

import typings.bip174.anon.CanAdd
import typings.bip174.anon.CanAddToArray
import typings.bip174.anon.Check
import typings.bip174.anon.TypeoffinalScriptSig
import typings.bip174.anon.TypeoffinalScriptWitness
import typings.bip174.anon.TypeofglobalXpub
import typings.bip174.anon.TypeofnonWitnessUtxo
import typings.bip174.anon.TypeofpartialSig
import typings.bip174.anon.TypeofporCommitment
import typings.bip174.anon.TypeofsighashType
import typings.bip174.anon.TypeoftapKeySig
import typings.bip174.anon.TypeoftapLeafScript
import typings.bip174.anon.TypeoftapMerkleRoot
import typings.bip174.anon.TypeoftapScriptSig
import typings.bip174.anon.TypeoftapTree
import typings.bip174.anon.TypeofunsignedTx
import typings.bip174.anon.TypeofwitnessUtxo
import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibConverterMod {
  
  object globals {
    
    @JSImport("bip174/src/lib/converter", "globals")
    @js.native
    val ^ : js.Any = js.native
    
    inline def checkPubkey(keyVal: KeyValue): js.UndefOr[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPubkey")(keyVal.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Buffer]]
    
    @JSImport("bip174/src/lib/converter", "globals.globalXpub")
    @js.native
    def globalXpub: TypeofglobalXpub = js.native
    inline def globalXpub_=(x: TypeofglobalXpub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalXpub")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "globals.unsignedTx")
    @js.native
    def unsignedTx: TypeofunsignedTx = js.native
    inline def unsignedTx_=(x: TypeofunsignedTx): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unsignedTx")(x.asInstanceOf[js.Any])
  }
  
  object inputs {
    
    @JSImport("bip174/src/lib/converter", "inputs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bip174/src/lib/converter", "inputs.bip32Derivation")
    @js.native
    def bip32Derivation: CanAddToArray = js.native
    inline def bip32Derivation_=(x: CanAddToArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bip32Derivation")(x.asInstanceOf[js.Any])
    
    inline def checkPubkey(keyVal: KeyValue): js.UndefOr[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPubkey")(keyVal.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Buffer]]
    
    @JSImport("bip174/src/lib/converter", "inputs.finalScriptSig")
    @js.native
    def finalScriptSig: TypeoffinalScriptSig = js.native
    inline def finalScriptSig_=(x: TypeoffinalScriptSig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("finalScriptSig")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.finalScriptWitness")
    @js.native
    def finalScriptWitness: TypeoffinalScriptWitness = js.native
    inline def finalScriptWitness_=(x: TypeoffinalScriptWitness): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("finalScriptWitness")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.nonWitnessUtxo")
    @js.native
    def nonWitnessUtxo: TypeofnonWitnessUtxo = js.native
    inline def nonWitnessUtxo_=(x: TypeofnonWitnessUtxo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonWitnessUtxo")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.partialSig")
    @js.native
    def partialSig: TypeofpartialSig = js.native
    inline def partialSig_=(x: TypeofpartialSig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("partialSig")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.porCommitment")
    @js.native
    def porCommitment: TypeofporCommitment = js.native
    inline def porCommitment_=(x: TypeofporCommitment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("porCommitment")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.redeemScript")
    @js.native
    def redeemScript: CanAdd = js.native
    inline def redeemScript_=(x: CanAdd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("redeemScript")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.sighashType")
    @js.native
    def sighashType: TypeofsighashType = js.native
    inline def sighashType_=(x: TypeofsighashType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sighashType")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.tapBip32Derivation")
    @js.native
    def tapBip32Derivation: Check = js.native
    inline def tapBip32Derivation_=(x: Check): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tapBip32Derivation")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.tapInternalKey")
    @js.native
    def tapInternalKey: CanAdd = js.native
    inline def tapInternalKey_=(x: CanAdd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tapInternalKey")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.tapKeySig")
    @js.native
    def tapKeySig: TypeoftapKeySig = js.native
    inline def tapKeySig_=(x: TypeoftapKeySig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tapKeySig")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.tapLeafScript")
    @js.native
    def tapLeafScript: TypeoftapLeafScript = js.native
    inline def tapLeafScript_=(x: TypeoftapLeafScript): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tapLeafScript")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.tapMerkleRoot")
    @js.native
    def tapMerkleRoot: TypeoftapMerkleRoot = js.native
    inline def tapMerkleRoot_=(x: TypeoftapMerkleRoot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tapMerkleRoot")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.tapScriptSig")
    @js.native
    def tapScriptSig: TypeoftapScriptSig = js.native
    inline def tapScriptSig_=(x: TypeoftapScriptSig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tapScriptSig")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.witnessScript")
    @js.native
    def witnessScript: CanAdd = js.native
    inline def witnessScript_=(x: CanAdd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("witnessScript")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.witnessUtxo")
    @js.native
    def witnessUtxo: TypeofwitnessUtxo = js.native
    inline def witnessUtxo_=(x: TypeofwitnessUtxo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("witnessUtxo")(x.asInstanceOf[js.Any])
  }
  
  object outputs {
    
    @JSImport("bip174/src/lib/converter", "outputs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bip174/src/lib/converter", "outputs.bip32Derivation")
    @js.native
    def bip32Derivation: CanAddToArray = js.native
    inline def bip32Derivation_=(x: CanAddToArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bip32Derivation")(x.asInstanceOf[js.Any])
    
    inline def checkPubkey(keyVal: KeyValue): js.UndefOr[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPubkey")(keyVal.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Buffer]]
    
    @JSImport("bip174/src/lib/converter", "outputs.redeemScript")
    @js.native
    def redeemScript: CanAdd = js.native
    inline def redeemScript_=(x: CanAdd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("redeemScript")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "outputs.tapBip32Derivation")
    @js.native
    def tapBip32Derivation: Check = js.native
    inline def tapBip32Derivation_=(x: Check): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tapBip32Derivation")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "outputs.tapInternalKey")
    @js.native
    def tapInternalKey: CanAdd = js.native
    inline def tapInternalKey_=(x: CanAdd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tapInternalKey")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "outputs.tapTree")
    @js.native
    def tapTree: TypeoftapTree = js.native
    inline def tapTree_=(x: TypeoftapTree): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tapTree")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "outputs.witnessScript")
    @js.native
    def witnessScript: CanAdd = js.native
    inline def witnessScript_=(x: CanAdd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("witnessScript")(x.asInstanceOf[js.Any])
  }
}
