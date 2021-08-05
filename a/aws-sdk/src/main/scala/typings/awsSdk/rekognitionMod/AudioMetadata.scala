package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioMetadata extends StObject {
  
  /**
    * The audio codec used to encode or decode the audio stream. 
    */
  var Codec: js.UndefOr[String] = js.undefined
  
  /**
    * The duration of the audio stream in milliseconds.
    */
  var DurationMillis: js.UndefOr[ULong] = js.undefined
  
  /**
    * The number of audio channels in the segment.
    */
  var NumberOfChannels: js.UndefOr[ULong] = js.undefined
  
  /**
    * The sample rate for the audio stream.
    */
  var SampleRate: js.UndefOr[ULong] = js.undefined
}
object AudioMetadata {
  
  inline def apply(): AudioMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioMetadata]
  }
  
  extension [Self <: AudioMetadata](x: Self) {
    
    inline def setCodec(value: String): Self = StObject.set(x, "Codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "Codec", js.undefined)
    
    inline def setDurationMillis(value: ULong): Self = StObject.set(x, "DurationMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisUndefined: Self = StObject.set(x, "DurationMillis", js.undefined)
    
    inline def setNumberOfChannels(value: ULong): Self = StObject.set(x, "NumberOfChannels", value.asInstanceOf[js.Any])
    
    inline def setNumberOfChannelsUndefined: Self = StObject.set(x, "NumberOfChannels", js.undefined)
    
    inline def setSampleRate(value: ULong): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
  }
}
