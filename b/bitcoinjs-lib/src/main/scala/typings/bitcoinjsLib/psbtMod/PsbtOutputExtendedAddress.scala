package typings.bitcoinjsLib.psbtMod

import typings.bip174.interfacesMod.Bip32Derivation
import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.PsbtOutput
import typings.bip174.interfacesMod.RedeemScript
import typings.bip174.interfacesMod.WitnessScript
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PsbtOutputExtendedAddress
  extends PsbtOutput
     with PsbtOutputExtended {
  var address: String
  var value: Double
}

object PsbtOutputExtendedAddress {
  @scala.inline
  def apply(
    address: String,
    value: Double,
    bip32Derivation: js.Array[Bip32Derivation] = null,
    redeemScript: RedeemScript = null,
    unknownKeyVals: js.Array[KeyValue] = null,
    witnessScript: WitnessScript = null
  ): PsbtOutputExtendedAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (bip32Derivation != null) __obj.updateDynamic("bip32Derivation")(bip32Derivation.asInstanceOf[js.Any])
    if (redeemScript != null) __obj.updateDynamic("redeemScript")(redeemScript.asInstanceOf[js.Any])
    if (unknownKeyVals != null) __obj.updateDynamic("unknownKeyVals")(unknownKeyVals.asInstanceOf[js.Any])
    if (witnessScript != null) __obj.updateDynamic("witnessScript")(witnessScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtOutputExtendedAddress]
  }
}

