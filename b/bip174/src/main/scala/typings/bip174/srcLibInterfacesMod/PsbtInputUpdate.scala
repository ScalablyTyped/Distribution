package typings.bip174.srcLibInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PsbtInputUpdate extends js.Object {
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
  def apply(
    bip32Derivation: js.Array[Bip32Derivation] = null,
    finalScriptSig: FinalScriptSig = null,
    finalScriptWitness: FinalScriptWitness = null,
    nonWitnessUtxo: NonWitnessUtxo = null,
    partialSig: js.Array[PartialSig] = null,
    porCommitment: PorCommitment = null,
    redeemScript: RedeemScript = null,
    sighashType: Int | Double = null,
    witnessScript: WitnessScript = null,
    witnessUtxo: WitnessUtxo = null
  ): PsbtInputUpdate = {
    val __obj = js.Dynamic.literal()
    if (bip32Derivation != null) __obj.updateDynamic("bip32Derivation")(bip32Derivation)
    if (finalScriptSig != null) __obj.updateDynamic("finalScriptSig")(finalScriptSig)
    if (finalScriptWitness != null) __obj.updateDynamic("finalScriptWitness")(finalScriptWitness)
    if (nonWitnessUtxo != null) __obj.updateDynamic("nonWitnessUtxo")(nonWitnessUtxo)
    if (partialSig != null) __obj.updateDynamic("partialSig")(partialSig)
    if (porCommitment != null) __obj.updateDynamic("porCommitment")(porCommitment)
    if (redeemScript != null) __obj.updateDynamic("redeemScript")(redeemScript)
    if (sighashType != null) __obj.updateDynamic("sighashType")(sighashType.asInstanceOf[js.Any])
    if (witnessScript != null) __obj.updateDynamic("witnessScript")(witnessScript)
    if (witnessUtxo != null) __obj.updateDynamic("witnessUtxo")(witnessUtxo)
    __obj.asInstanceOf[PsbtInputUpdate]
  }
}

