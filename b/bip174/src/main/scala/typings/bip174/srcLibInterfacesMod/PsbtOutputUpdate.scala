package typings.bip174.srcLibInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PsbtOutputUpdate extends StObject {
  
  var bip32Derivation: js.UndefOr[js.Array[Bip32Derivation]] = js.undefined
  
  var redeemScript: js.UndefOr[RedeemScript] = js.undefined
  
  var tapBip32Derivation: js.UndefOr[js.Array[TapBip32Derivation]] = js.undefined
  
  var tapInternalKey: js.UndefOr[TapInternalKey] = js.undefined
  
  var tapTree: js.UndefOr[TapTree] = js.undefined
  
  var witnessScript: js.UndefOr[WitnessScript] = js.undefined
}
object PsbtOutputUpdate {
  
  inline def apply(): PsbtOutputUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PsbtOutputUpdate]
  }
  
  extension [Self <: PsbtOutputUpdate](x: Self) {
    
    inline def setBip32Derivation(value: js.Array[Bip32Derivation]): Self = StObject.set(x, "bip32Derivation", value.asInstanceOf[js.Any])
    
    inline def setBip32DerivationUndefined: Self = StObject.set(x, "bip32Derivation", js.undefined)
    
    inline def setBip32DerivationVarargs(value: Bip32Derivation*): Self = StObject.set(x, "bip32Derivation", js.Array(value*))
    
    inline def setRedeemScript(value: RedeemScript): Self = StObject.set(x, "redeemScript", value.asInstanceOf[js.Any])
    
    inline def setRedeemScriptUndefined: Self = StObject.set(x, "redeemScript", js.undefined)
    
    inline def setTapBip32Derivation(value: js.Array[TapBip32Derivation]): Self = StObject.set(x, "tapBip32Derivation", value.asInstanceOf[js.Any])
    
    inline def setTapBip32DerivationUndefined: Self = StObject.set(x, "tapBip32Derivation", js.undefined)
    
    inline def setTapBip32DerivationVarargs(value: TapBip32Derivation*): Self = StObject.set(x, "tapBip32Derivation", js.Array(value*))
    
    inline def setTapInternalKey(value: TapInternalKey): Self = StObject.set(x, "tapInternalKey", value.asInstanceOf[js.Any])
    
    inline def setTapInternalKeyUndefined: Self = StObject.set(x, "tapInternalKey", js.undefined)
    
    inline def setTapTree(value: TapTree): Self = StObject.set(x, "tapTree", value.asInstanceOf[js.Any])
    
    inline def setTapTreeUndefined: Self = StObject.set(x, "tapTree", js.undefined)
    
    inline def setWitnessScript(value: WitnessScript): Self = StObject.set(x, "witnessScript", value.asInstanceOf[js.Any])
    
    inline def setWitnessScriptUndefined: Self = StObject.set(x, "witnessScript", js.undefined)
  }
}
