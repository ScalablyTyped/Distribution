package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputChannelMapping extends StObject {
  
  /**
    * List of input channels
    */
  var InputChannels: js.UndefOr[listOfIntegerMinNegative60Max6] = js.undefined
}
object OutputChannelMapping {
  
  inline def apply(): OutputChannelMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputChannelMapping]
  }
  
  extension [Self <: OutputChannelMapping](x: Self) {
    
    inline def setInputChannels(value: listOfIntegerMinNegative60Max6): Self = StObject.set(x, "InputChannels", value.asInstanceOf[js.Any])
    
    inline def setInputChannelsUndefined: Self = StObject.set(x, "InputChannels", js.undefined)
    
    inline def setInputChannelsVarargs(value: integerMinNegative60Max6*): Self = StObject.set(x, "InputChannels", js.Array(value :_*))
  }
}
