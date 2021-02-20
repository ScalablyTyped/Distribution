package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemixSettings extends StObject {
  
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
  implicit class RemixSettingsMutableBuilder[Self <: RemixSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelMappings(value: listOfAudioChannelMapping): Self = StObject.set(x, "ChannelMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelMappingsVarargs(value: AudioChannelMapping*): Self = StObject.set(x, "ChannelMappings", js.Array(value :_*))
    
    @scala.inline
    def setChannelsIn(value: integerMin1Max16): Self = StObject.set(x, "ChannelsIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsInUndefined: Self = StObject.set(x, "ChannelsIn", js.undefined)
    
    @scala.inline
    def setChannelsOut(value: integerMin1Max8): Self = StObject.set(x, "ChannelsOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsOutUndefined: Self = StObject.set(x, "ChannelsOut", js.undefined)
  }
}
