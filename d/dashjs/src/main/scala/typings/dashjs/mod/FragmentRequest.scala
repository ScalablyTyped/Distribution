package typings.dashjs.mod

import typings.dashjs.dashjsStrings.InitializationSegment
import typings.dashjs.dashjsStrings.MediaSegment
import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.embeddedText
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.text
import typings.dashjs.dashjsStrings.video
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragmentRequest extends StObject {
  
  var action: String = js.native
  
  var availabilityEndTime: Double = js.native
  
  var availabilityStartTime: Date = js.native
  
  var bytesLoaded: Double = js.native
  
  var bytesTotal: Double = js.native
  
  var delayLoadingTime: Double = js.native
  
  var duration: Double = js.native
  
  var firstByteDate: Date = js.native
  
  var index: Double = js.native
  
  var mediaInfo: MediaInfo = js.native
  
  var mediaType: video | audio | text | fragmentedText | embeddedText = js.native
  
  var quality: Double = js.native
  
  var representationId: String = js.native
  
  var requestEndDate: Date | Null = js.native
  
  var requestStartDate: Date = js.native
  
  var responseType: String = js.native
  
  var serviceLocation: String = js.native
  
  var startTime: Double = js.native
  
  var timescale: Double = js.native
  
  var `type`: InitializationSegment | MediaSegment = js.native
  
  var url: String = js.native
}
object FragmentRequest {
  
  @scala.inline
  def apply(
    action: String,
    availabilityEndTime: Double,
    availabilityStartTime: Date,
    bytesLoaded: Double,
    bytesTotal: Double,
    delayLoadingTime: Double,
    duration: Double,
    firstByteDate: Date,
    index: Double,
    mediaInfo: MediaInfo,
    mediaType: video | audio | text | fragmentedText | embeddedText,
    quality: Double,
    representationId: String,
    requestStartDate: Date,
    responseType: String,
    serviceLocation: String,
    startTime: Double,
    timescale: Double,
    `type`: InitializationSegment | MediaSegment,
    url: String
  ): FragmentRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], availabilityEndTime = availabilityEndTime.asInstanceOf[js.Any], availabilityStartTime = availabilityStartTime.asInstanceOf[js.Any], bytesLoaded = bytesLoaded.asInstanceOf[js.Any], bytesTotal = bytesTotal.asInstanceOf[js.Any], delayLoadingTime = delayLoadingTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], firstByteDate = firstByteDate.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mediaInfo = mediaInfo.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], representationId = representationId.asInstanceOf[js.Any], requestStartDate = requestStartDate.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], serviceLocation = serviceLocation.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], timescale = timescale.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentRequest]
  }
  
  @scala.inline
  implicit class FragmentRequestMutableBuilder[Self <: FragmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityEndTime(value: Double): Self = StObject.set(x, "availabilityEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityStartTime(value: Date): Self = StObject.set(x, "availabilityStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesLoaded(value: Double): Self = StObject.set(x, "bytesLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesTotal(value: Double): Self = StObject.set(x, "bytesTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayLoadingTime(value: Double): Self = StObject.set(x, "delayLoadingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstByteDate(value: Date): Self = StObject.set(x, "firstByteDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaInfo(value: MediaInfo): Self = StObject.set(x, "mediaInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: video | audio | text | fragmentedText | embeddedText): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepresentationId(value: String): Self = StObject.set(x, "representationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestEndDate(value: Date): Self = StObject.set(x, "requestEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestEndDateNull: Self = StObject.set(x, "requestEndDate", null)
    
    @scala.inline
    def setRequestStartDate(value: Date): Self = StObject.set(x, "requestStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceLocation(value: String): Self = StObject.set(x, "serviceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimescale(value: Double): Self = StObject.set(x, "timescale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: InitializationSegment | MediaSegment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
