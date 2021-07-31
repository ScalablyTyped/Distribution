package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSegmentImportJobsResponse extends StObject {
  
  var ImportJobsResponse: typings.awsSdk.pinpointMod.ImportJobsResponse
}
object GetSegmentImportJobsResponse {
  
  @scala.inline
  def apply(ImportJobsResponse: ImportJobsResponse): GetSegmentImportJobsResponse = {
    val __obj = js.Dynamic.literal(ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentImportJobsResponse]
  }
  
  @scala.inline
  implicit class GetSegmentImportJobsResponseMutableBuilder[Self <: GetSegmentImportJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportJobsResponse(value: ImportJobsResponse): Self = StObject.set(x, "ImportJobsResponse", value.asInstanceOf[js.Any])
  }
}
