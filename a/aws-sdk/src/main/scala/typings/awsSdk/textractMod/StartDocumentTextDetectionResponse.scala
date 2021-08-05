package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDocumentTextDetectionResponse extends StObject {
  
  /**
    * The identifier of the text detection job for the document. Use JobId to identify the job in a subsequent call to GetDocumentTextDetection. A JobId value is only valid for 7 days.
    */
  var JobId: js.UndefOr[typings.awsSdk.textractMod.JobId] = js.undefined
}
object StartDocumentTextDetectionResponse {
  
  inline def apply(): StartDocumentTextDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDocumentTextDetectionResponse]
  }
  
  extension [Self <: StartDocumentTextDetectionResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
