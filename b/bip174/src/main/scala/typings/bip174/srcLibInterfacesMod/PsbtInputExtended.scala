package typings.bip174.srcLibInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PsbtInputExtended
  extends PsbtInput
     with /* index */ StringDictionary[js.Any]

object PsbtInputExtended {
  @scala.inline
  def apply(
    StringDictionary: /* index */ StringDictionary[js.Any] = null,
    bip32Derivation: js.Array[Bip32Derivation] = null,
    finalScriptSig: FinalScriptSig = null,
    finalScriptWitness: FinalScriptWitness = null,
    nonWitnessUtxo: NonWitnessUtxo = null,
    partialSig: js.Array[PartialSig] = null,
    porCommitment: PorCommitment = null,
    redeemScript: RedeemScript = null,
    sighashType: Int | Double = null,
    unknownKeyVals: js.Array[KeyValue] = null,
    witnessScript: WitnessScript = null,
    witnessUtxo: WitnessUtxo = null
  ): PsbtInputExtended = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (bip32Derivation != null) __obj.updateDynamic("bip32Derivation")(bip32Derivation)
    if (finalScriptSig != null) __obj.updateDynamic("finalScriptSig")(finalScriptSig)
    if (finalScriptWitness != null) __obj.updateDynamic("finalScriptWitness")(finalScriptWitness)
    if (nonWitnessUtxo != null) __obj.updateDynamic("nonWitnessUtxo")(nonWitnessUtxo)
    if (partialSig != null) __obj.updateDynamic("partialSig")(partialSig)
    if (porCommitment != null) __obj.updateDynamic("porCommitment")(porCommitment)
    if (redeemScript != null) __obj.updateDynamic("redeemScript")(redeemScript)
    if (sighashType != null) __obj.updateDynamic("sighashType")(sighashType.asInstanceOf[js.Any])
    if (unknownKeyVals != null) __obj.updateDynamic("unknownKeyVals")(unknownKeyVals)
    if (witnessScript != null) __obj.updateDynamic("witnessScript")(witnessScript)
    if (witnessUtxo != null) __obj.updateDynamic("witnessUtxo")(witnessUtxo)
    __obj.asInstanceOf[PsbtInputExtended]
  }
}

