package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbeddedDestinationSettings extends StObject {
  
  /**
    * Ignore this setting unless your input captions are SCC format and your output captions are embedded in the video stream. Specify a CC number for each captions channel in this output. If you have two channels, choose CC numbers that aren't in the same field. For example, choose 1 and 3. For more information, see https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
    */
  var Destination608ChannelNumber: js.UndefOr[integerMin1Max4] = js.undefined
  
  /**
    * Ignore this setting unless your input captions are SCC format and you want both 608 and 708 captions embedded in your output stream. Optionally, specify the 708 service number for each output captions channel. Choose a different number for each channel. To use this setting, also set Force 608 to 708 upconvert (Convert608To708) to Upconvert (UPCONVERT) in your input captions selector settings. If you choose to upconvert but don't specify a 708 service number, MediaConvert uses the number that you specify for CC channel number (destination608ChannelNumber) for the 708 service number. For more information, see https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
    */
  var Destination708ServiceNumber: js.UndefOr[integerMin1Max6] = js.undefined
}
object EmbeddedDestinationSettings {
  
  inline def apply(): EmbeddedDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedDestinationSettings]
  }
  
  extension [Self <: EmbeddedDestinationSettings](x: Self) {
    
    inline def setDestination608ChannelNumber(value: integerMin1Max4): Self = StObject.set(x, "Destination608ChannelNumber", value.asInstanceOf[js.Any])
    
    inline def setDestination608ChannelNumberUndefined: Self = StObject.set(x, "Destination608ChannelNumber", js.undefined)
    
    inline def setDestination708ServiceNumber(value: integerMin1Max6): Self = StObject.set(x, "Destination708ServiceNumber", value.asInstanceOf[js.Any])
    
    inline def setDestination708ServiceNumberUndefined: Self = StObject.set(x, "Destination708ServiceNumber", js.undefined)
  }
}
