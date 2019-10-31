package typings.bitcoinjsDashLib.typesPsbtMod

import typings.bip174.srcLibInterfacesMod.Bip32Derivation
import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.bip174.srcLibInterfacesMod.PsbtOutput
import typings.bip174.srcLibInterfacesMod.RedeemScript
import typings.bip174.srcLibInterfacesMod.WitnessScript
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PsbtOutputExtendedScript
  extends PsbtOutput
     with PsbtOutputExtended {
  var script: Buffer
  var value: Double
}

object PsbtOutputExtendedScript {
  @scala.inline
  def apply(
    script: Buffer,
    value: Double,
    bip32Derivation: js.Array[Bip32Derivation] = null,
    redeemScript: RedeemScript = null,
    unknownKeyVals: js.Array[KeyValue] = null,
    witnessScript: WitnessScript = null
  ): PsbtOutputExtendedScript = {
    val __obj = js.Dynamic.literal(script = script, value = value)
    if (bip32Derivation != null) __obj.updateDynamic("bip32Derivation")(bip32Derivation)
    if (redeemScript != null) __obj.updateDynamic("redeemScript")(redeemScript)
    if (unknownKeyVals != null) __obj.updateDynamic("unknownKeyVals")(unknownKeyVals)
    if (witnessScript != null) __obj.updateDynamic("witnessScript")(witnessScript)
    __obj.asInstanceOf[PsbtOutputExtendedScript]
  }
}

