package typings.awsSdkClientPinpointBrowser.typesEndpointBatchRequestMod

import typings.awsSdkClientPinpointBrowser.typesEndpointBatchItemMod.UnmarshalledEndpointBatchItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledEndpointBatchRequest extends EndpointBatchRequest {
  
  /**
    * List of items to update. Maximum 100 items
    */
  @JSName("Item")
  var Item_UnmarshalledEndpointBatchRequest: js.UndefOr[js.Array[UnmarshalledEndpointBatchItem]] = js.native
}
object UnmarshalledEndpointBatchRequest {
  
  @scala.inline
  def apply(): UnmarshalledEndpointBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEndpointBatchRequest]
  }
  
  @scala.inline
  implicit class UnmarshalledEndpointBatchRequestOps[Self <: UnmarshalledEndpointBatchRequest] (val x: Self) extends AnyVal {
    
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
    def setItemVarargs(value: UnmarshalledEndpointBatchItem*): Self = this.set("Item", js.Array(value :_*))
    
    @scala.inline
    def setItem(value: js.Array[UnmarshalledEndpointBatchItem]): Self = this.set("Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
  }
}
