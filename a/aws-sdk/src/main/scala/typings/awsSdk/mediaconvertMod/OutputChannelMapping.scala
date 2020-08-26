package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputChannelMapping extends js.Object {
  /**
    * List of input channels
    */
  var InputChannels: js.UndefOr[listOfIntegerMinNegative60Max6] = js.native
}

object OutputChannelMapping {
  @scala.inline
  def apply(): OutputChannelMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputChannelMapping]
  }
  @scala.inline
  implicit class OutputChannelMappingOps[Self <: OutputChannelMapping] (val x: Self) extends AnyVal {
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
    def setInputChannelsVarargs(value: integerMinNegative60Max6*): Self = this.set("InputChannels", js.Array(value :_*))
    @scala.inline
    def setInputChannels(value: listOfIntegerMinNegative60Max6): Self = this.set("InputChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputChannels: Self = this.set("InputChannels", js.undefined)
  }
  
}

