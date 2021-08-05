package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExportJobRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  var ExportJobRequest: typings.awsSdk.pinpointMod.ExportJobRequest
}
object CreateExportJobRequest {
  
  inline def apply(ApplicationId: string, ExportJobRequest: ExportJobRequest): CreateExportJobRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ExportJobRequest = ExportJobRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExportJobRequest]
  }
  
  extension [Self <: CreateExportJobRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setExportJobRequest(value: ExportJobRequest): Self = StObject.set(x, "ExportJobRequest", value.asInstanceOf[js.Any])
  }
}
