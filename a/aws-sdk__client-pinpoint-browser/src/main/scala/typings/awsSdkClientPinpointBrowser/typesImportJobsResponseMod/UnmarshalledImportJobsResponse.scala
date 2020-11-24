package typings.awsSdkClientPinpointBrowser.typesImportJobsResponseMod

import typings.awsSdkClientPinpointBrowser.typesImportJobResponseMod.UnmarshalledImportJobResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledImportJobsResponse extends ImportJobsResponse {
  
  /**
    * A list of import jobs for the application.
    */
  @JSName("Item")
  var Item_UnmarshalledImportJobsResponse: js.UndefOr[js.Array[UnmarshalledImportJobResponse]] = js.native
}
object UnmarshalledImportJobsResponse {
  
  @scala.inline
  def apply(): UnmarshalledImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledImportJobsResponse]
  }
  
  @scala.inline
  implicit class UnmarshalledImportJobsResponseOps[Self <: UnmarshalledImportJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setItemVarargs(value: UnmarshalledImportJobResponse*): Self = this.set("Item", js.Array(value :_*))
    
    @scala.inline
    def setItem(value: js.Array[UnmarshalledImportJobResponse]): Self = this.set("Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
  }
}
