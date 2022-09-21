package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamOutputConfiguration extends StObject {
  
  /**
    * The transport parameters that are associated with each outbound media stream.
    */
  var DestinationConfigurations: js.UndefOr[listOfDestinationConfiguration] = js.undefined
  
  /**
    * The format that was used to encode the data. For ancillary data streams, set the encoding name to smpte291. For audio streams, set the encoding name to pcm. For video, 2110 streams, set the encoding name to raw. For video, JPEG XS streams, set the encoding name to jxsv.
    */
  var EncodingName: typings.awsSdk.mediaconnectMod.EncodingName
  
  /**
    * Encoding parameters
    */
  var EncodingParameters: js.UndefOr[typings.awsSdk.mediaconnectMod.EncodingParameters] = js.undefined
  
  /**
    * The name of the media stream.
    */
  var MediaStreamName: string
}
object MediaStreamOutputConfiguration {
  
  inline def apply(EncodingName: EncodingName, MediaStreamName: string): MediaStreamOutputConfiguration = {
    val __obj = js.Dynamic.literal(EncodingName = EncodingName.asInstanceOf[js.Any], MediaStreamName = MediaStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamOutputConfiguration]
  }
  
  extension [Self <: MediaStreamOutputConfiguration](x: Self) {
    
    inline def setDestinationConfigurations(value: listOfDestinationConfiguration): Self = StObject.set(x, "DestinationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfigurationsUndefined: Self = StObject.set(x, "DestinationConfigurations", js.undefined)
    
    inline def setDestinationConfigurationsVarargs(value: DestinationConfiguration*): Self = StObject.set(x, "DestinationConfigurations", js.Array(value*))
    
    inline def setEncodingName(value: EncodingName): Self = StObject.set(x, "EncodingName", value.asInstanceOf[js.Any])
    
    inline def setEncodingParameters(value: EncodingParameters): Self = StObject.set(x, "EncodingParameters", value.asInstanceOf[js.Any])
    
    inline def setEncodingParametersUndefined: Self = StObject.set(x, "EncodingParameters", js.undefined)
    
    inline def setMediaStreamName(value: string): Self = StObject.set(x, "MediaStreamName", value.asInstanceOf[js.Any])
  }
}
