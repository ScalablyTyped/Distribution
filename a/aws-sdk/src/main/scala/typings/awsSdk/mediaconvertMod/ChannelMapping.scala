package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelMapping extends js.Object {
  /**
    * List of output channels
    */
  var OutputChannels: js.UndefOr[listOfOutputChannelMapping] = js.native
}

object ChannelMapping {
  @scala.inline
  def apply(): ChannelMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMapping]
  }
  @scala.inline
  implicit class ChannelMappingOps[Self <: ChannelMapping] (val x: Self) extends AnyVal {
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
    def setOutputChannelsVarargs(value: OutputChannelMapping*): Self = this.set("OutputChannels", js.Array(value :_*))
    @scala.inline
    def setOutputChannels(value: listOfOutputChannelMapping): Self = this.set("OutputChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputChannels: Self = this.set("OutputChannels", js.undefined)
  }
  
}

