package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMapping extends StObject {
  
  /**
    * List of output channels
    */
  var OutputChannels: js.UndefOr[listOfOutputChannelMapping] = js.undefined
}
object ChannelMapping {
  
  inline def apply(): ChannelMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMapping]
  }
  
  extension [Self <: ChannelMapping](x: Self) {
    
    inline def setOutputChannels(value: listOfOutputChannelMapping): Self = StObject.set(x, "OutputChannels", value.asInstanceOf[js.Any])
    
    inline def setOutputChannelsUndefined: Self = StObject.set(x, "OutputChannels", js.undefined)
    
    inline def setOutputChannelsVarargs(value: OutputChannelMapping*): Self = StObject.set(x, "OutputChannels", js.Array(value :_*))
  }
}
