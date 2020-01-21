package typings.bitcoinjsLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFinalScriptSig extends js.Object {
  var finalScriptSig: js.UndefOr[Buffer] = js.undefined
  var finalScriptWitness: js.UndefOr[Buffer] = js.undefined
}

object AnonFinalScriptSig {
  @scala.inline
  def apply(finalScriptSig: Buffer = null, finalScriptWitness: Buffer = null): AnonFinalScriptSig = {
    val __obj = js.Dynamic.literal()
    if (finalScriptSig != null) __obj.updateDynamic("finalScriptSig")(finalScriptSig.asInstanceOf[js.Any])
    if (finalScriptWitness != null) __obj.updateDynamic("finalScriptWitness")(finalScriptWitness.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFinalScriptSig]
  }
}

