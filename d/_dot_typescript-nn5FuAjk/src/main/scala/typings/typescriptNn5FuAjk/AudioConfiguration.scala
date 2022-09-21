package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioConfiguration extends StObject {
  
  var bitrate: js.UndefOr[Double] = js.undefined
  
  var channels: js.UndefOr[java.lang.String] = js.undefined
  
  var contentType: java.lang.String
  
  var samplerate: js.UndefOr[Double] = js.undefined
  
  var spatialRendering: js.UndefOr[scala.Boolean] = js.undefined
}
object AudioConfiguration {
  
  inline def apply(contentType: java.lang.String): AudioConfiguration = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioConfiguration]
  }
  
  extension [Self <: AudioConfiguration](x: Self) {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    inline def setChannels(value: java.lang.String): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setContentType(value: java.lang.String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setSamplerate(value: Double): Self = StObject.set(x, "samplerate", value.asInstanceOf[js.Any])
    
    inline def setSamplerateUndefined: Self = StObject.set(x, "samplerate", js.undefined)
    
    inline def setSpatialRendering(value: scala.Boolean): Self = StObject.set(x, "spatialRendering", value.asInstanceOf[js.Any])
    
    inline def setSpatialRenderingUndefined: Self = StObject.set(x, "spatialRendering", js.undefined)
  }
}
