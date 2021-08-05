package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AiffSettings extends StObject {
  
  /**
    * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track.
    */
  var BitDepth: js.UndefOr[integerMin16Max24] = js.undefined
  
  /**
    * Specify the number of channels in this output audio track. Valid values are 1 and even numbers up to 64. For example, 1, 2, 4, 6, and so on, up to 64.
    */
  var Channels: js.UndefOr[integerMin1Max64] = js.undefined
  
  /**
    * Sample rate in hz.
    */
  var SampleRate: js.UndefOr[integerMin8000Max192000] = js.undefined
}
object AiffSettings {
  
  inline def apply(): AiffSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AiffSettings]
  }
  
  extension [Self <: AiffSettings](x: Self) {
    
    inline def setBitDepth(value: integerMin16Max24): Self = StObject.set(x, "BitDepth", value.asInstanceOf[js.Any])
    
    inline def setBitDepthUndefined: Self = StObject.set(x, "BitDepth", js.undefined)
    
    inline def setChannels(value: integerMin1Max64): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    inline def setSampleRate(value: integerMin8000Max192000): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
  }
}
