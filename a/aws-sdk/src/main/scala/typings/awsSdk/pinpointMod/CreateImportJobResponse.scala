package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateImportJobResponse extends StObject {
  
  var ImportJobResponse: typings.awsSdk.pinpointMod.ImportJobResponse = js.native
}
object CreateImportJobResponse {
  
  @scala.inline
  def apply(ImportJobResponse: ImportJobResponse): CreateImportJobResponse = {
    val __obj = js.Dynamic.literal(ImportJobResponse = ImportJobResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImportJobResponse]
  }
  
  @scala.inline
  implicit class CreateImportJobResponseMutableBuilder[Self <: CreateImportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportJobResponse(value: ImportJobResponse): Self = StObject.set(x, "ImportJobResponse", value.asInstanceOf[js.Any])
  }
}
