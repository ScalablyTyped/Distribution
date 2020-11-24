package typings.dashjs.mod

import typings.dashjs.dashjsStrings.InitializationSegment
import typings.dashjs.dashjsStrings.MediaSegment
import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.embeddedText
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.text
import typings.dashjs.dashjsStrings.video
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragmentRequest extends js.Object {
  
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
  implicit class FragmentRequestOps[Self <: FragmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityEndTime(value: Double): Self = this.set("availabilityEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityStartTime(value: Date): Self = this.set("availabilityStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesLoaded(value: Double): Self = this.set("bytesLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesTotal(value: Double): Self = this.set("bytesTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayLoadingTime(value: Double): Self = this.set("delayLoadingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstByteDate(value: Date): Self = this.set("firstByteDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaInfo(value: MediaInfo): Self = this.set("mediaInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: video | audio | text | fragmentedText | embeddedText): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepresentationId(value: String): Self = this.set("representationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestStartDate(value: Date): Self = this.set("requestStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceLocation(value: String): Self = this.set("serviceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimescale(value: Double): Self = this.set("timescale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: InitializationSegment | MediaSegment): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestEndDate(value: Date): Self = this.set("requestEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestEndDateNull: Self = this.set("requestEndDate", null)
  }
}
