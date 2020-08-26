package typings.cryptoHash.mod

import typings.cryptoHash.cryptoHashStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsHexOutput extends js.Object {
  var outputFormat: js.UndefOr[hex] = js.native
}

object OptionsHexOutput {
  @scala.inline
  def apply(): OptionsHexOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsHexOutput]
  }
  @scala.inline
  implicit class OptionsHexOutputOps[Self <: OptionsHexOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOutputFormat(value: hex): Self = this.set("outputFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputFormat: Self = this.set("outputFormat", js.undefined)
  }
  
}

