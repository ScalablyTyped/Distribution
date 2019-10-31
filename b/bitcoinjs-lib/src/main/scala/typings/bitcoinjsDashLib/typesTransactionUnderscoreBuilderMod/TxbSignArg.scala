package typings.bitcoinjsDashLib.typesTransactionUnderscoreBuilderMod

import typings.bitcoinjsDashLib.typesEcpairMod.Signer
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TxbSignArg extends js.Object {
  var hashType: js.UndefOr[Double] = js.undefined
  var keyPair: Signer
  var prevOutScriptType: String
  var redeemScript: js.UndefOr[Buffer] = js.undefined
  var vin: Double
  var witnessScript: js.UndefOr[Buffer] = js.undefined
  var witnessValue: js.UndefOr[Double] = js.undefined
}

object TxbSignArg {
  @scala.inline
  def apply(
    keyPair: Signer,
    prevOutScriptType: String,
    vin: Double,
    hashType: Int | Double = null,
    redeemScript: Buffer = null,
    witnessScript: Buffer = null,
    witnessValue: Int | Double = null
  ): TxbSignArg = {
    val __obj = js.Dynamic.literal(keyPair = keyPair, prevOutScriptType = prevOutScriptType, vin = vin)
    if (hashType != null) __obj.updateDynamic("hashType")(hashType.asInstanceOf[js.Any])
    if (redeemScript != null) __obj.updateDynamic("redeemScript")(redeemScript)
    if (witnessScript != null) __obj.updateDynamic("witnessScript")(witnessScript)
    if (witnessValue != null) __obj.updateDynamic("witnessValue")(witnessValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxbSignArg]
  }
}

