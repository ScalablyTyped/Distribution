package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputChannelMapping extends StObject {
  
  /**
    * Use this setting to specify your remix values when they are integers, such as -10, 0, or 4.
    */
  var InputChannels: js.UndefOr[listOfIntegerMinNegative60Max6] = js.undefined
  
  /**
    * Use this setting to specify your remix values when they have a decimal component, such as -10.312, 0.08, or 4.9. MediaConvert rounds your remixing values to the nearest thousandth.
    */
  var InputChannelsFineTune: js.UndefOr[listOfDoubleMinNegative60Max6] = js.undefined
}
object OutputChannelMapping {
  
  inline def apply(): OutputChannelMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputChannelMapping]
  }
  
  extension [Self <: OutputChannelMapping](x: Self) {
    
    inline def setInputChannels(value: listOfIntegerMinNegative60Max6): Self = StObject.set(x, "InputChannels", value.asInstanceOf[js.Any])
    
    inline def setInputChannelsFineTune(value: listOfDoubleMinNegative60Max6): Self = StObject.set(x, "InputChannelsFineTune", value.asInstanceOf[js.Any])
    
    inline def setInputChannelsFineTuneUndefined: Self = StObject.set(x, "InputChannelsFineTune", js.undefined)
    
    inline def setInputChannelsFineTuneVarargs(value: doubleMinNegative60Max6*): Self = StObject.set(x, "InputChannelsFineTune", js.Array(value*))
    
    inline def setInputChannelsUndefined: Self = StObject.set(x, "InputChannels", js.undefined)
    
    inline def setInputChannelsVarargs(value: integerMinNegative60Max6*): Self = StObject.set(x, "InputChannels", js.Array(value*))
  }
}
