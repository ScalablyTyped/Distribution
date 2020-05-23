package typings.bitcoinjsLib.transactionBuilderMod

import typings.bitcoinjsLib.ecpairMod.Signer
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
    hashType: js.UndefOr[Double] = js.undefined,
    redeemScript: Buffer = null,
    witnessScript: Buffer = null,
    witnessValue: js.UndefOr[Double] = js.undefined
  ): TxbSignArg = {
    val __obj = js.Dynamic.literal(keyPair = keyPair.asInstanceOf[js.Any], prevOutScriptType = prevOutScriptType.asInstanceOf[js.Any], vin = vin.asInstanceOf[js.Any])
    if (!js.isUndefined(hashType)) __obj.updateDynamic("hashType")(hashType.get.asInstanceOf[js.Any])
    if (redeemScript != null) __obj.updateDynamic("redeemScript")(redeemScript.asInstanceOf[js.Any])
    if (witnessScript != null) __obj.updateDynamic("witnessScript")(witnessScript.asInstanceOf[js.Any])
    if (!js.isUndefined(witnessValue)) __obj.updateDynamic("witnessValue")(witnessValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxbSignArg]
  }
}

