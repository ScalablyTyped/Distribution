package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioChannelTaggingSettings extends StObject {
  
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
  implicit class AudioChannelTaggingSettingsMutableBuilder[Self <: AudioChannelTaggingSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelTag(value: AudioChannelTag): Self = StObject.set(x, "ChannelTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTagUndefined: Self = StObject.set(x, "ChannelTag", js.undefined)
  }
}
