package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioChannelTaggingSettings extends js.Object {
  
  /**
    * You can add a tag for this mono-channel audio track to mimic its placement in a multi-channel layout.  For example, if this track is the left surround channel, choose Left surround (LS).
    */
  var ChannelTag: js.UndefOr[AudioChannelTag] = js.native
}
object AudioChannelTaggingSettings {
  
  @scala.inline
  def apply(): AudioChannelTaggingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioChannelTaggingSettings]
  }
  
  @scala.inline
  implicit class AudioChannelTaggingSettingsOps[Self <: AudioChannelTaggingSettings] (val x: Self) extends AnyVal {
    
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
    def setChannelTag(value: AudioChannelTag): Self = this.set("ChannelTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelTag: Self = this.set("ChannelTag", js.undefined)
  }
}
