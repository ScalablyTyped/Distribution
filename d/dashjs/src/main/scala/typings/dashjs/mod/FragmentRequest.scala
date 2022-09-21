package typings.dashjs.mod

import typings.dashjs.dashjsStrings.InitializationSegment
import typings.dashjs.dashjsStrings.MediaSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentRequest extends StObject {
  
  var action: String
  
  var availabilityEndTime: Double
  
  var availabilityStartTime: js.Date
  
  var bytesLoaded: Double
  
  var bytesTotal: Double
  
  var delayLoadingTime: Double
  
  var duration: Double
  
  var firstByteDate: js.Date
  
  var index: Double
  
  var mediaInfo: MediaInfo
  
  var mediaStartTime: Double
  
  var mediaType: MediaType
  
  var quality: Double
  
  var representationId: String
  
  var requestEndDate: js.Date | Null
  
  var requestStartDate: js.Date
  
  var responseType: String
  
  var serviceLocation: String
  
  var startTime: Double
  
  var timescale: Double
  
  var `type`: InitializationSegment | MediaSegment
  
  var url: String
  
  var wallStartTime: js.Date | Null
}
object FragmentRequest {
  
  inline def apply(
    action: String,
    availabilityEndTime: Double,
    availabilityStartTime: js.Date,
    bytesLoaded: Double,
    bytesTotal: Double,
    delayLoadingTime: Double,
    duration: Double,
    firstByteDate: js.Date,
    index: Double,
    mediaInfo: MediaInfo,
    mediaStartTime: Double,
    mediaType: MediaType,
    quality: Double,
    representationId: String,
    requestStartDate: js.Date,
    responseType: String,
    serviceLocation: String,
    startTime: Double,
    timescale: Double,
    `type`: InitializationSegment | MediaSegment,
    url: String
  ): FragmentRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], availabilityEndTime = availabilityEndTime.asInstanceOf[js.Any], availabilityStartTime = availabilityStartTime.asInstanceOf[js.Any], bytesLoaded = bytesLoaded.asInstanceOf[js.Any], bytesTotal = bytesTotal.asInstanceOf[js.Any], delayLoadingTime = delayLoadingTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], firstByteDate = firstByteDate.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mediaInfo = mediaInfo.asInstanceOf[js.Any], mediaStartTime = mediaStartTime.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], representationId = representationId.asInstanceOf[js.Any], requestStartDate = requestStartDate.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], serviceLocation = serviceLocation.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], timescale = timescale.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], requestEndDate = null, wallStartTime = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentRequest]
  }
  
  extension [Self <: FragmentRequest](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityEndTime(value: Double): Self = StObject.set(x, "availabilityEndTime", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStartTime(value: js.Date): Self = StObject.set(x, "availabilityStartTime", value.asInstanceOf[js.Any])
    
    inline def setBytesLoaded(value: Double): Self = StObject.set(x, "bytesLoaded", value.asInstanceOf[js.Any])
    
    inline def setBytesTotal(value: Double): Self = StObject.set(x, "bytesTotal", value.asInstanceOf[js.Any])
    
    inline def setDelayLoadingTime(value: Double): Self = StObject.set(x, "delayLoadingTime", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setFirstByteDate(value: js.Date): Self = StObject.set(x, "firstByteDate", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMediaInfo(value: MediaInfo): Self = StObject.set(x, "mediaInfo", value.asInstanceOf[js.Any])
    
    inline def setMediaStartTime(value: Double): Self = StObject.set(x, "mediaStartTime", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: MediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setRepresentationId(value: String): Self = StObject.set(x, "representationId", value.asInstanceOf[js.Any])
    
    inline def setRequestEndDate(value: js.Date): Self = StObject.set(x, "requestEndDate", value.asInstanceOf[js.Any])
    
    inline def setRequestEndDateNull: Self = StObject.set(x, "requestEndDate", null)
    
    inline def setRequestStartDate(value: js.Date): Self = StObject.set(x, "requestStartDate", value.asInstanceOf[js.Any])
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setServiceLocation(value: String): Self = StObject.set(x, "serviceLocation", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setTimescale(value: Double): Self = StObject.set(x, "timescale", value.asInstanceOf[js.Any])
    
    inline def setType(value: InitializationSegment | MediaSegment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWallStartTime(value: js.Date): Self = StObject.set(x, "wallStartTime", value.asInstanceOf[js.Any])
    
    inline def setWallStartTimeNull: Self = StObject.set(x, "wallStartTime", null)
  }
}
