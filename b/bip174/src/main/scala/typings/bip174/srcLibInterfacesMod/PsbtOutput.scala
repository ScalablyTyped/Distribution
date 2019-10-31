package typings.bip174.srcLibInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PsbtOutput extends PsbtOutputUpdate {
  var unknownKeyVals: js.UndefOr[js.Array[KeyValue]] = js.undefined
}

object PsbtOutput {
  @scala.inline
  def apply(
    bip32Derivation: js.Array[Bip32Derivation] = null,
    redeemScript: RedeemScript = null,
    unknownKeyVals: js.Array[KeyValue] = null,
    witnessScript: WitnessScript = null
  ): PsbtOutput = {
    val __obj = js.Dynamic.literal()
    if (bip32Derivation != null) __obj.updateDynamic("bip32Derivation")(bip32Derivation)
    if (redeemScript != null) __obj.updateDynamic("redeemScript")(redeemScript)
    if (unknownKeyVals != null) __obj.updateDynamic("unknownKeyVals")(unknownKeyVals)
    if (witnessScript != null) __obj.updateDynamic("witnessScript")(witnessScript)
    __obj.asInstanceOf[PsbtOutput]
  }
}

