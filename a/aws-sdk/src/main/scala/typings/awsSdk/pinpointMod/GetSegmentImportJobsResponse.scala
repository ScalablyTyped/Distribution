package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSegmentImportJobsResponse extends StObject {
  
  var ImportJobsResponse: typings.awsSdk.pinpointMod.ImportJobsResponse
}
object GetSegmentImportJobsResponse {
  
  inline def apply(ImportJobsResponse: ImportJobsResponse): GetSegmentImportJobsResponse = {
    val __obj = js.Dynamic.literal(ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentImportJobsResponse]
  }
  
  extension [Self <: GetSegmentImportJobsResponse](x: Self) {
    
    inline def setImportJobsResponse(value: ImportJobsResponse): Self = StObject.set(x, "ImportJobsResponse", value.asInstanceOf[js.Any])
  }
}
