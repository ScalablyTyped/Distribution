package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelMapping extends StObject {
  
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
  implicit class ChannelMappingMutableBuilder[Self <: ChannelMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputChannels(value: listOfOutputChannelMapping): Self = StObject.set(x, "OutputChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputChannelsUndefined: Self = StObject.set(x, "OutputChannels", js.undefined)
    
    @scala.inline
    def setOutputChannelsVarargs(value: OutputChannelMapping*): Self = StObject.set(x, "OutputChannels", js.Array(value :_*))
  }
}
