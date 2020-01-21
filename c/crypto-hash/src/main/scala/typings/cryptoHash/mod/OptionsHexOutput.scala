package typings.cryptoHash.mod

import typings.cryptoHash.cryptoHashStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsHexOutput extends js.Object {
  var outputFormat: js.UndefOr[hex] = js.undefined
}

object OptionsHexOutput {
  @scala.inline
  def apply(outputFormat: hex = null): OptionsHexOutput = {
    val __obj = js.Dynamic.literal()
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsHexOutput]
  }
}

