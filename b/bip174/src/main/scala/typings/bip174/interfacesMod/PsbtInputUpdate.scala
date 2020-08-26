package typings.bip174.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PsbtInputUpdate extends js.Object {
  var bip32Derivation: js.UndefOr[js.Array[Bip32Derivation]] = js.native
  var finalScriptSig: js.UndefOr[FinalScriptSig] = js.native
  var finalScriptWitness: js.UndefOr[FinalScriptWitness] = js.native
  var nonWitnessUtxo: js.UndefOr[NonWitnessUtxo] = js.native
  var partialSig: js.UndefOr[js.Array[PartialSig]] = js.native
  var porCommitment: js.UndefOr[PorCommitment] = js.native
  var redeemScript: js.UndefOr[RedeemScript] = js.native
  var sighashType: js.UndefOr[SighashType] = js.native
  var witnessScript: js.UndefOr[WitnessScript] = js.native
  var witnessUtxo: js.UndefOr[WitnessUtxo] = js.native
}

object PsbtInputUpdate {
  @scala.inline
  def apply(): PsbtInputUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PsbtInputUpdate]
  }
  @scala.inline
  implicit class PsbtInputUpdateOps[Self <: PsbtInputUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBip32DerivationVarargs(value: Bip32Derivation*): Self = this.set("bip32Derivation", js.Array(value :_*))
    @scala.inline
    def setBip32Derivation(value: js.Array[Bip32Derivation]): Self = this.set("bip32Derivation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBip32Derivation: Self = this.set("bip32Derivation", js.undefined)
    @scala.inline
    def setFinalScriptSig(value: FinalScriptSig): Self = this.set("finalScriptSig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalScriptSig: Self = this.set("finalScriptSig", js.undefined)
    @scala.inline
    def setFinalScriptWitness(value: FinalScriptWitness): Self = this.set("finalScriptWitness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalScriptWitness: Self = this.set("finalScriptWitness", js.undefined)
    @scala.inline
    def setNonWitnessUtxo(value: NonWitnessUtxo): Self = this.set("nonWitnessUtxo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonWitnessUtxo: Self = this.set("nonWitnessUtxo", js.undefined)
    @scala.inline
    def setPartialSigVarargs(value: PartialSig*): Self = this.set("partialSig", js.Array(value :_*))
    @scala.inline
    def setPartialSig(value: js.Array[PartialSig]): Self = this.set("partialSig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartialSig: Self = this.set("partialSig", js.undefined)
    @scala.inline
    def setPorCommitment(value: PorCommitment): Self = this.set("porCommitment", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePorCommitment: Self = this.set("porCommitment", js.undefined)
    @scala.inline
    def setRedeemScript(value: RedeemScript): Self = this.set("redeemScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedeemScript: Self = this.set("redeemScript", js.undefined)
    @scala.inline
    def setSighashType(value: SighashType): Self = this.set("sighashType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSighashType: Self = this.set("sighashType", js.undefined)
    @scala.inline
    def setWitnessScript(value: WitnessScript): Self = this.set("witnessScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWitnessScript: Self = this.set("witnessScript", js.undefined)
    @scala.inline
    def setWitnessUtxo(value: WitnessUtxo): Self = this.set("witnessUtxo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWitnessUtxo: Self = this.set("witnessUtxo", js.undefined)
  }
  
}

