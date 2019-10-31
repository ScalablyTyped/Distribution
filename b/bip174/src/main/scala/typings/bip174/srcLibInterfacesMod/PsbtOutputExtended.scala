package typings.bip174.srcLibInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PsbtOutputExtended
  extends PsbtOutput
     with /* index */ StringDictionary[js.Any]

object PsbtOutputExtended {
  @scala.inline
  def apply(
    StringDictionary: /* index */ StringDictionary[js.Any] = null,
    bip32Derivation: js.Array[Bip32Derivation] = null,
    redeemScript: RedeemScript = null,
    unknownKeyVals: js.Array[KeyValue] = null,
    witnessScript: WitnessScript = null
  ): PsbtOutputExtended = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (bip32Derivation != null) __obj.updateDynamic("bip32Derivation")(bip32Derivation)
    if (redeemScript != null) __obj.updateDynamic("redeemScript")(redeemScript)
    if (unknownKeyVals != null) __obj.updateDynamic("unknownKeyVals")(unknownKeyVals)
    if (witnessScript != null) __obj.updateDynamic("witnessScript")(witnessScript)
    __obj.asInstanceOf[PsbtOutputExtended]
  }
}

