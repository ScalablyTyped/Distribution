package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImportJobRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  var ImportJobRequest: typings.awsSdk.pinpointMod.ImportJobRequest
}
object CreateImportJobRequest {
  
  @scala.inline
  def apply(ApplicationId: string, ImportJobRequest: ImportJobRequest): CreateImportJobRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ImportJobRequest = ImportJobRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImportJobRequest]
  }
  
  @scala.inline
  implicit class CreateImportJobRequestMutableBuilder[Self <: CreateImportJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportJobRequest(value: ImportJobRequest): Self = StObject.set(x, "ImportJobRequest", value.asInstanceOf[js.Any])
  }
}
