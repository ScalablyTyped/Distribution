package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetExportJobResponse extends StObject {
  
  var ExportJobResponse: typings.awsSdk.pinpointMod.ExportJobResponse = js.native
}
object GetExportJobResponse {
  
  @scala.inline
  def apply(ExportJobResponse: ExportJobResponse): GetExportJobResponse = {
    val __obj = js.Dynamic.literal(ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportJobResponse]
  }
  
  @scala.inline
  implicit class GetExportJobResponseMutableBuilder[Self <: GetExportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportJobResponse(value: ExportJobResponse): Self = StObject.set(x, "ExportJobResponse", value.asInstanceOf[js.Any])
  }
}
