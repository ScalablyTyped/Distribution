package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTextDetectionResponse extends StObject {
  
  /**
    * Identifier for the text detection job. Use JobId to identify the job in a subsequent call to GetTextDetection.
    */
  var JobId: js.UndefOr[typings.awsSdk.rekognitionMod.JobId] = js.undefined
}
object StartTextDetectionResponse {
  
  inline def apply(): StartTextDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTextDetectionResponse]
  }
  
  extension [Self <: StartTextDetectionResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
