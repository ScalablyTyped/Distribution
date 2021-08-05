package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputChannelLevel extends StObject {
  
  /**
    * Remixing value. Units are in dB and acceptable values are within the range from -60 (mute) and 6 dB.
    */
  var Gain: integerMinNegative60Max6
  
  /**
    * The index of the input channel used as a source.
    */
  var InputChannel: integerMin0Max15
}
object InputChannelLevel {
  
  inline def apply(Gain: integerMinNegative60Max6, InputChannel: integerMin0Max15): InputChannelLevel = {
    val __obj = js.Dynamic.literal(Gain = Gain.asInstanceOf[js.Any], InputChannel = InputChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputChannelLevel]
  }
  
  extension [Self <: InputChannelLevel](x: Self) {
    
    inline def setGain(value: integerMinNegative60Max6): Self = StObject.set(x, "Gain", value.asInstanceOf[js.Any])
    
    inline def setInputChannel(value: integerMin0Max15): Self = StObject.set(x, "InputChannel", value.asInstanceOf[js.Any])
  }
}
