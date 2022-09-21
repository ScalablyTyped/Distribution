package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IManifestInfo extends StObject {
  
  var availableFrom: js.Date
  
  var duration: Double
  
  var dvrWindowSize: Double
  
  var isDynamic: Boolean
  
  var loadedTime: js.Date
  
  var maxFragmentDuration: Double
  
  var minBufferTime: Double
  
  var protocol: js.UndefOr[String] = js.undefined
}
object IManifestInfo {
  
  inline def apply(
    availableFrom: js.Date,
    duration: Double,
    dvrWindowSize: Double,
    isDynamic: Boolean,
    loadedTime: js.Date,
    maxFragmentDuration: Double,
    minBufferTime: Double
  ): IManifestInfo = {
    val __obj = js.Dynamic.literal(availableFrom = availableFrom.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], dvrWindowSize = dvrWindowSize.asInstanceOf[js.Any], isDynamic = isDynamic.asInstanceOf[js.Any], loadedTime = loadedTime.asInstanceOf[js.Any], maxFragmentDuration = maxFragmentDuration.asInstanceOf[js.Any], minBufferTime = minBufferTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IManifestInfo]
  }
  
  extension [Self <: IManifestInfo](x: Self) {
    
    inline def setAvailableFrom(value: js.Date): Self = StObject.set(x, "availableFrom", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDvrWindowSize(value: Double): Self = StObject.set(x, "dvrWindowSize", value.asInstanceOf[js.Any])
    
    inline def setIsDynamic(value: Boolean): Self = StObject.set(x, "isDynamic", value.asInstanceOf[js.Any])
    
    inline def setLoadedTime(value: js.Date): Self = StObject.set(x, "loadedTime", value.asInstanceOf[js.Any])
    
    inline def setMaxFragmentDuration(value: Double): Self = StObject.set(x, "maxFragmentDuration", value.asInstanceOf[js.Any])
    
    inline def setMinBufferTime(value: Double): Self = StObject.set(x, "minBufferTime", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
