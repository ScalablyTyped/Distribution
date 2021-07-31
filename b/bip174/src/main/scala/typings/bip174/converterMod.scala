package typings.bip174

import typings.bip174.anon.CanAdd
import typings.bip174.anon.CanAddToArray
import typings.bip174.anon.TypeoffinalScriptSig
import typings.bip174.anon.TypeoffinalScriptWitness
import typings.bip174.anon.TypeofglobalXpub
import typings.bip174.anon.TypeofnonWitnessUtxo
import typings.bip174.anon.TypeofpartialSig
import typings.bip174.anon.TypeofporCommitment
import typings.bip174.anon.TypeofsighashType
import typings.bip174.anon.TypeofunsignedTx
import typings.bip174.anon.TypeofwitnessUtxo
import typings.bip174.interfacesMod.KeyValue
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object converterMod {
  
  object globals {
    
    @JSImport("bip174/src/lib/converter", "globals")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def checkPubkey(keyVal: KeyValue): js.UndefOr[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPubkey")(keyVal.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Buffer]]
    
    @JSImport("bip174/src/lib/converter", "globals.globalXpub")
    @js.native
    def globalXpub: TypeofglobalXpub = js.native
    @scala.inline
    def globalXpub_=(x: TypeofglobalXpub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalXpub")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "globals.unsignedTx")
    @js.native
    def unsignedTx: TypeofunsignedTx = js.native
    @scala.inline
    def unsignedTx_=(x: TypeofunsignedTx): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unsignedTx")(x.asInstanceOf[js.Any])
  }
  
  object inputs {
    
    @JSImport("bip174/src/lib/converter", "inputs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bip174/src/lib/converter", "inputs.bip32Derivation")
    @js.native
    def bip32Derivation: CanAddToArray = js.native
    @scala.inline
    def bip32Derivation_=(x: CanAddToArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bip32Derivation")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def checkPubkey(keyVal: KeyValue): js.UndefOr[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPubkey")(keyVal.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Buffer]]
    
    @JSImport("bip174/src/lib/converter", "inputs.finalScriptSig")
    @js.native
    def finalScriptSig: TypeoffinalScriptSig = js.native
    @scala.inline
    def finalScriptSig_=(x: TypeoffinalScriptSig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("finalScriptSig")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.finalScriptWitness")
    @js.native
    def finalScriptWitness: TypeoffinalScriptWitness = js.native
    @scala.inline
    def finalScriptWitness_=(x: TypeoffinalScriptWitness): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("finalScriptWitness")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.nonWitnessUtxo")
    @js.native
    def nonWitnessUtxo: TypeofnonWitnessUtxo = js.native
    @scala.inline
    def nonWitnessUtxo_=(x: TypeofnonWitnessUtxo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonWitnessUtxo")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.partialSig")
    @js.native
    def partialSig: TypeofpartialSig = js.native
    @scala.inline
    def partialSig_=(x: TypeofpartialSig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("partialSig")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.porCommitment")
    @js.native
    def porCommitment: TypeofporCommitment = js.native
    @scala.inline
    def porCommitment_=(x: TypeofporCommitment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("porCommitment")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.redeemScript")
    @js.native
    def redeemScript: CanAdd = js.native
    @scala.inline
    def redeemScript_=(x: CanAdd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("redeemScript")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.sighashType")
    @js.native
    def sighashType: TypeofsighashType = js.native
    @scala.inline
    def sighashType_=(x: TypeofsighashType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sighashType")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.witnessScript")
    @js.native
    def witnessScript: CanAdd = js.native
    @scala.inline
    def witnessScript_=(x: CanAdd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("witnessScript")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "inputs.witnessUtxo")
    @js.native
    def witnessUtxo: TypeofwitnessUtxo = js.native
    @scala.inline
    def witnessUtxo_=(x: TypeofwitnessUtxo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("witnessUtxo")(x.asInstanceOf[js.Any])
  }
  
  object outputs {
    
    @JSImport("bip174/src/lib/converter", "outputs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bip174/src/lib/converter", "outputs.bip32Derivation")
    @js.native
    def bip32Derivation: CanAddToArray = js.native
    @scala.inline
    def bip32Derivation_=(x: CanAddToArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bip32Derivation")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def checkPubkey(keyVal: KeyValue): js.UndefOr[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPubkey")(keyVal.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Buffer]]
    
    @JSImport("bip174/src/lib/converter", "outputs.redeemScript")
    @js.native
    def redeemScript: CanAdd = js.native
    @scala.inline
    def redeemScript_=(x: CanAdd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("redeemScript")(x.asInstanceOf[js.Any])
    
    @JSImport("bip174/src/lib/converter", "outputs.witnessScript")
    @js.native
    def witnessScript: CanAdd = js.native
    @scala.inline
    def witnessScript_=(x: CanAdd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("witnessScript")(x.asInstanceOf[js.Any])
  }
}
