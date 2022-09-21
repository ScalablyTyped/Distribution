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
  
  var tapBip32Derivation: js.UndefOr[js.Array[TapBip32Derivation]] = js.undefined
  
  var tapInternalKey: js.UndefOr[TapInternalKey] = js.undefined
  
  var tapKeySig: js.UndefOr[TapKeySig] = js.undefined
  
  var tapLeafScript: js.UndefOr[js.Array[TapLeafScript]] = js.undefined
  
  var tapMerkleRoot: js.UndefOr[TapMerkleRoot] = js.undefined
  
  var tapScriptSig: js.UndefOr[js.Array[TapScriptSig]] = js.undefined
  
  var witnessScript: js.UndefOr[WitnessScript] = js.undefined
  
  var witnessUtxo: js.UndefOr[WitnessUtxo] = js.undefined
}
object PsbtInputUpdate {
  
  inline def apply(): PsbtInputUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PsbtInputUpdate]
  }
  
  extension [Self <: PsbtInputUpdate](x: Self) {
    
    inline def setBip32Derivation(value: js.Array[Bip32Derivation]): Self = StObject.set(x, "bip32Derivation", value.asInstanceOf[js.Any])
    
    inline def setBip32DerivationUndefined: Self = StObject.set(x, "bip32Derivation", js.undefined)
    
    inline def setBip32DerivationVarargs(value: Bip32Derivation*): Self = StObject.set(x, "bip32Derivation", js.Array(value*))
    
    inline def setFinalScriptSig(value: FinalScriptSig): Self = StObject.set(x, "finalScriptSig", value.asInstanceOf[js.Any])
    
    inline def setFinalScriptSigUndefined: Self = StObject.set(x, "finalScriptSig", js.undefined)
    
    inline def setFinalScriptWitness(value: FinalScriptWitness): Self = StObject.set(x, "finalScriptWitness", value.asInstanceOf[js.Any])
    
    inline def setFinalScriptWitnessUndefined: Self = StObject.set(x, "finalScriptWitness", js.undefined)
    
    inline def setNonWitnessUtxo(value: NonWitnessUtxo): Self = StObject.set(x, "nonWitnessUtxo", value.asInstanceOf[js.Any])
    
    inline def setNonWitnessUtxoUndefined: Self = StObject.set(x, "nonWitnessUtxo", js.undefined)
    
    inline def setPartialSig(value: js.Array[PartialSig]): Self = StObject.set(x, "partialSig", value.asInstanceOf[js.Any])
    
    inline def setPartialSigUndefined: Self = StObject.set(x, "partialSig", js.undefined)
    
    inline def setPartialSigVarargs(value: PartialSig*): Self = StObject.set(x, "partialSig", js.Array(value*))
    
    inline def setPorCommitment(value: PorCommitment): Self = StObject.set(x, "porCommitment", value.asInstanceOf[js.Any])
    
    inline def setPorCommitmentUndefined: Self = StObject.set(x, "porCommitment", js.undefined)
    
    inline def setRedeemScript(value: RedeemScript): Self = StObject.set(x, "redeemScript", value.asInstanceOf[js.Any])
    
    inline def setRedeemScriptUndefined: Self = StObject.set(x, "redeemScript", js.undefined)
    
    inline def setSighashType(value: SighashType): Self = StObject.set(x, "sighashType", value.asInstanceOf[js.Any])
    
    inline def setSighashTypeUndefined: Self = StObject.set(x, "sighashType", js.undefined)
    
    inline def setTapBip32Derivation(value: js.Array[TapBip32Derivation]): Self = StObject.set(x, "tapBip32Derivation", value.asInstanceOf[js.Any])
    
    inline def setTapBip32DerivationUndefined: Self = StObject.set(x, "tapBip32Derivation", js.undefined)
    
    inline def setTapBip32DerivationVarargs(value: TapBip32Derivation*): Self = StObject.set(x, "tapBip32Derivation", js.Array(value*))
    
    inline def setTapInternalKey(value: TapInternalKey): Self = StObject.set(x, "tapInternalKey", value.asInstanceOf[js.Any])
    
    inline def setTapInternalKeyUndefined: Self = StObject.set(x, "tapInternalKey", js.undefined)
    
    inline def setTapKeySig(value: TapKeySig): Self = StObject.set(x, "tapKeySig", value.asInstanceOf[js.Any])
    
    inline def setTapKeySigUndefined: Self = StObject.set(x, "tapKeySig", js.undefined)
    
    inline def setTapLeafScript(value: js.Array[TapLeafScript]): Self = StObject.set(x, "tapLeafScript", value.asInstanceOf[js.Any])
    
    inline def setTapLeafScriptUndefined: Self = StObject.set(x, "tapLeafScript", js.undefined)
    
    inline def setTapLeafScriptVarargs(value: TapLeafScript*): Self = StObject.set(x, "tapLeafScript", js.Array(value*))
    
    inline def setTapMerkleRoot(value: TapMerkleRoot): Self = StObject.set(x, "tapMerkleRoot", value.asInstanceOf[js.Any])
    
    inline def setTapMerkleRootUndefined: Self = StObject.set(x, "tapMerkleRoot", js.undefined)
    
    inline def setTapScriptSig(value: js.Array[TapScriptSig]): Self = StObject.set(x, "tapScriptSig", value.asInstanceOf[js.Any])
    
    inline def setTapScriptSigUndefined: Self = StObject.set(x, "tapScriptSig", js.undefined)
    
    inline def setTapScriptSigVarargs(value: TapScriptSig*): Self = StObject.set(x, "tapScriptSig", js.Array(value*))
    
    inline def setWitnessScript(value: WitnessScript): Self = StObject.set(x, "witnessScript", value.asInstanceOf[js.Any])
    
    inline def setWitnessScriptUndefined: Self = StObject.set(x, "witnessScript", js.undefined)
    
    inline def setWitnessUtxo(value: WitnessUtxo): Self = StObject.set(x, "witnessUtxo", value.asInstanceOf[js.Any])
    
    inline def setWitnessUtxoUndefined: Self = StObject.set(x, "witnessUtxo", js.undefined)
  }
}
