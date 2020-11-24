package typings.awsSdkClientPinpointBrowser.typesExportJobsResponseMod

import typings.awsSdkClientPinpointBrowser.typesExportJobResponseMod.UnmarshalledExportJobResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledExportJobsResponse extends ExportJobsResponse {
  
  /**
    * A list of export jobs for the application.
    */
  @JSName("Item")
  var Item_UnmarshalledExportJobsResponse: js.UndefOr[js.Array[UnmarshalledExportJobResponse]] = js.native
}
object UnmarshalledExportJobsResponse {
  
  @scala.inline
  def apply(): UnmarshalledExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledExportJobsResponse]
  }
  
  @scala.inline
  implicit class UnmarshalledExportJobsResponseOps[Self <: UnmarshalledExportJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setItemVarargs(value: UnmarshalledExportJobResponse*): Self = this.set("Item", js.Array(value :_*))
    
    @scala.inline
    def setItem(value: js.Array[UnmarshalledExportJobResponse]): Self = this.set("Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
  }
}
