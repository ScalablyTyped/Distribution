package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImportJobResponse extends StObject {
  
  var ImportJobResponse: typings.awsSdk.pinpointMod.ImportJobResponse
}
object GetImportJobResponse {
  
  @scala.inline
  def apply(ImportJobResponse: ImportJobResponse): GetImportJobResponse = {
    val __obj = js.Dynamic.literal(ImportJobResponse = ImportJobResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportJobResponse]
  }
  
  @scala.inline
  implicit class GetImportJobResponseMutableBuilder[Self <: GetImportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportJobResponse(value: ImportJobResponse): Self = StObject.set(x, "ImportJobResponse", value.asInstanceOf[js.Any])
  }
}
