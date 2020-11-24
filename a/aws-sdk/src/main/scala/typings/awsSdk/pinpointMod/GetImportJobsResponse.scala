package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImportJobsResponse extends js.Object {
  
  var ImportJobsResponse: typings.awsSdk.pinpointMod.ImportJobsResponse = js.native
}
object GetImportJobsResponse {
  
  @scala.inline
  def apply(ImportJobsResponse: ImportJobsResponse): GetImportJobsResponse = {
    val __obj = js.Dynamic.literal(ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportJobsResponse]
  }
  
  @scala.inline
  implicit class GetImportJobsResponseOps[Self <: GetImportJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImportJobsResponse(value: ImportJobsResponse): Self = this.set("ImportJobsResponse", value.asInstanceOf[js.Any])
  }
}
