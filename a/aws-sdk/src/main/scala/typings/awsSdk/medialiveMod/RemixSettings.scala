package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemixSettings extends js.Object {
  
  /**
    * Mapping of input channels to output channels, with appropriate gain adjustments.
    */
  var ChannelMappings: listOfAudioChannelMapping = js.native
  
  /**
    * Number of input channels to be used.
    */
  var ChannelsIn: js.UndefOr[integerMin1Max16] = js.native
  
  /**
    * Number of output channels to be produced.
  Valid values: 1, 2, 4, 6, 8
    */
  var ChannelsOut: js.UndefOr[integerMin1Max8] = js.native
}
object RemixSettings {
  
  @scala.inline
  def apply(ChannelMappings: listOfAudioChannelMapping): RemixSettings = {
    val __obj = js.Dynamic.literal(ChannelMappings = ChannelMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemixSettings]
  }
  
  @scala.inline
  implicit class RemixSettingsOps[Self <: RemixSettings] (val x: Self) extends AnyVal {
    
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
    def setChannelMappingsVarargs(value: AudioChannelMapping*): Self = this.set("ChannelMappings", js.Array(value :_*))
    
    @scala.inline
    def setChannelMappings(value: listOfAudioChannelMapping): Self = this.set("ChannelMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsIn(value: integerMin1Max16): Self = this.set("ChannelsIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelsIn: Self = this.set("ChannelsIn", js.undefined)
    
    @scala.inline
    def setChannelsOut(value: integerMin1Max8): Self = this.set("ChannelsOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelsOut: Self = this.set("ChannelsOut", js.undefined)
  }
}
