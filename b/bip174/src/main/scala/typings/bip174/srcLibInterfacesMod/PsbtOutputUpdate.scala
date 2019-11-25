package typings.bip174.srcLibInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PsbtOutputUpdate extends js.Object {
  var bip32Derivation: js.UndefOr[js.Array[Bip32Derivation]] = js.undefined
  var redeemScript: js.UndefOr[RedeemScript] = js.undefined
  var witnessScript: js.UndefOr[WitnessScript] = js.undefined
}

object PsbtOutputUpdate {
  @scala.inline
  def apply(
    bip32Derivation: js.Array[Bip32Derivation] = null,
    redeemScript: RedeemScript = null,
    witnessScript: WitnessScript = null
  ): PsbtOutputUpdate = {
    val __obj = js.Dynamic.literal()
    if (bip32Derivation != null) __obj.updateDynamic("bip32Derivation")(bip32Derivation.asInstanceOf[js.Any])
    if (redeemScript != null) __obj.updateDynamic("redeemScript")(redeemScript.asInstanceOf[js.Any])
    if (witnessScript != null) __obj.updateDynamic("witnessScript")(witnessScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtOutputUpdate]
  }
}

