package typings.bip174.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PsbtOutputUpdate extends StObject {
  
  var bip32Derivation: js.UndefOr[js.Array[Bip32Derivation]] = js.native
  
  var redeemScript: js.UndefOr[RedeemScript] = js.native
  
  var witnessScript: js.UndefOr[WitnessScript] = js.native
}
object PsbtOutputUpdate {
  
  @scala.inline
  def apply(): PsbtOutputUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PsbtOutputUpdate]
  }
  
  @scala.inline
  implicit class PsbtOutputUpdateMutableBuilder[Self <: PsbtOutputUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBip32Derivation(value: js.Array[Bip32Derivation]): Self = StObject.set(x, "bip32Derivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBip32DerivationUndefined: Self = StObject.set(x, "bip32Derivation", js.undefined)
    
    @scala.inline
    def setBip32DerivationVarargs(value: Bip32Derivation*): Self = StObject.set(x, "bip32Derivation", js.Array(value :_*))
    
    @scala.inline
    def setRedeemScript(value: RedeemScript): Self = StObject.set(x, "redeemScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedeemScriptUndefined: Self = StObject.set(x, "redeemScript", js.undefined)
    
    @scala.inline
    def setWitnessScript(value: WitnessScript): Self = StObject.set(x, "witnessScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWitnessScriptUndefined: Self = StObject.set(x, "witnessScript", js.undefined)
  }
}
