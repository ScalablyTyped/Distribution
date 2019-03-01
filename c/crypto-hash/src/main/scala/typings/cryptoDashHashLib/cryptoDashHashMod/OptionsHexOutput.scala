package typings
package cryptoDashHashLib.cryptoDashHashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsHexOutput extends js.Object {
  var outputFormat: js.UndefOr[cryptoDashHashLib.cryptoDashHashLibStrings.hex] = js.undefined
}

object OptionsHexOutput {
  @scala.inline
  def apply(outputFormat: cryptoDashHashLib.cryptoDashHashLibStrings.hex = null): OptionsHexOutput = {
    val __obj = js.Dynamic.literal()
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat)
    __obj.asInstanceOf[OptionsHexOutput]
  }
}

