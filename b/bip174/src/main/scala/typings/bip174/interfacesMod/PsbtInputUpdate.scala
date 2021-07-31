package typings.bip174.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PsbtInputUpdate extends StObject {
  
  var bip32Derivation: js.UndefOr[js.Array[Bip32Derivation]] = js.undefined
  
  var finalScriptSig: js.UndefOr[FinalScriptSig] = js.undefined
  
  var finalScriptWitness: js.UndefOr[FinalScriptWitness] = js.undefined
  
  var nonWitnessUtxo: js.UndefOr[NonWitnessUtxo] = js.undefined
  
  var partialSig: js.UndefOr[js.Array[PartialSig]] = js.undefined
  
  var porCommitment: js.UndefOr[PorCommitment] = js.undefined
  
  var redeemScript: js.UndefOr[RedeemScript] = js.undefined
  
  var sighashType: js.UndefOr[SighashType] = js.undefined
  
  var witnessScript: js.UndefOr[WitnessScript] = js.undefined
  
  var witnessUtxo: js.UndefOr[WitnessUtxo] = js.undefined
}
object PsbtInputUpdate {
  
  @scala.inline
  def apply(): PsbtInputUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PsbtInputUpdate]
  }
  
  @scala.inline
  implicit class PsbtInputUpdateMutableBuilder[Self <: PsbtInputUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBip32Derivation(value: js.Array[Bip32Derivation]): Self = StObject.set(x, "bip32Derivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBip32DerivationUndefined: Self = StObject.set(x, "bip32Derivation", js.undefined)
    
    @scala.inline
    def setBip32DerivationVarargs(value: Bip32Derivation*): Self = StObject.set(x, "bip32Derivation", js.Array(value :_*))
    
    @scala.inline
    def setFinalScriptSig(value: FinalScriptSig): Self = StObject.set(x, "finalScriptSig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalScriptSigUndefined: Self = StObject.set(x, "finalScriptSig", js.undefined)
    
    @scala.inline
    def setFinalScriptWitness(value: FinalScriptWitness): Self = StObject.set(x, "finalScriptWitness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalScriptWitnessUndefined: Self = StObject.set(x, "finalScriptWitness", js.undefined)
    
    @scala.inline
    def setNonWitnessUtxo(value: NonWitnessUtxo): Self = StObject.set(x, "nonWitnessUtxo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonWitnessUtxoUndefined: Self = StObject.set(x, "nonWitnessUtxo", js.undefined)
    
    @scala.inline
    def setPartialSig(value: js.Array[PartialSig]): Self = StObject.set(x, "partialSig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialSigUndefined: Self = StObject.set(x, "partialSig", js.undefined)
    
    @scala.inline
    def setPartialSigVarargs(value: PartialSig*): Self = StObject.set(x, "partialSig", js.Array(value :_*))
    
    @scala.inline
    def setPorCommitment(value: PorCommitment): Self = StObject.set(x, "porCommitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPorCommitmentUndefined: Self = StObject.set(x, "porCommitment", js.undefined)
    
    @scala.inline
    def setRedeemScript(value: RedeemScript): Self = StObject.set(x, "redeemScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedeemScriptUndefined: Self = StObject.set(x, "redeemScript", js.undefined)
    
    @scala.inline
    def setSighashType(value: SighashType): Self = StObject.set(x, "sighashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSighashTypeUndefined: Self = StObject.set(x, "sighashType", js.undefined)
    
    @scala.inline
    def setWitnessScript(value: WitnessScript): Self = StObject.set(x, "witnessScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWitnessScriptUndefined: Self = StObject.set(x, "witnessScript", js.undefined)
    
    @scala.inline
    def setWitnessUtxo(value: WitnessUtxo): Self = StObject.set(x, "witnessUtxo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWitnessUtxoUndefined: Self = StObject.set(x, "witnessUtxo", js.undefined)
  }
}
