package typings.awsSdkClientDynamodbBrowser.typesWriteRequestMod

import typings.awsSdkClientDynamodbBrowser.typesDeleteRequestMod.UnmarshalledDeleteRequest
import typings.awsSdkClientDynamodbBrowser.typesPutRequestMod.UnmarshalledPutRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledWriteRequest extends WriteRequest {
  
  /**
    * <p>A request to perform a <code>DeleteItem</code> operation.</p>
    */
  @JSName("DeleteRequest")
  var DeleteRequest_UnmarshalledWriteRequest: js.UndefOr[UnmarshalledDeleteRequest] = js.native
  
  /**
    * <p>A request to perform a <code>PutItem</code> operation.</p>
    */
  @JSName("PutRequest")
  var PutRequest_UnmarshalledWriteRequest: js.UndefOr[UnmarshalledPutRequest] = js.native
}
object UnmarshalledWriteRequest {
  
  @scala.inline
  def apply(): UnmarshalledWriteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledWriteRequest]
  }
  
  @scala.inline
  implicit class UnmarshalledWriteRequestOps[Self <: UnmarshalledWriteRequest] (val x: Self) extends AnyVal {
    
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
    def setDeleteRequest(value: UnmarshalledDeleteRequest): Self = this.set("DeleteRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteRequest: Self = this.set("DeleteRequest", js.undefined)
    
    @scala.inline
    def setPutRequest(value: UnmarshalledPutRequest): Self = this.set("PutRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePutRequest: Self = this.set("PutRequest", js.undefined)
  }
}
