package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSegmentDetectionResponse extends StObject {
  
  /**
    * Unique identifier for the segment detection job. The JobId is returned from StartSegmentDetection. 
    */
  var JobId: js.UndefOr[typings.awsSdk.rekognitionMod.JobId] = js.native
}
object StartSegmentDetectionResponse {
  
  @scala.inline
  def apply(): StartSegmentDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSegmentDetectionResponse]
  }
  
  @scala.inline
  implicit class StartSegmentDetectionResponseMutableBuilder[Self <: StartSegmentDetectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
