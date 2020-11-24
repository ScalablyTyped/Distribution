package typings.awsSdkClientPinpointBrowser.typesEndpointBatchRequestMod

import typings.awsSdkClientPinpointBrowser.typesEndpointBatchItemMod.EndpointBatchItem
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointBatchRequest extends js.Object {
  
  /**
    * List of items to update. Maximum 100 items
    */
  var Item: js.UndefOr[js.Array[EndpointBatchItem] | Iterable[EndpointBatchItem]] = js.native
}
object EndpointBatchRequest {
  
  @scala.inline
  def apply(): EndpointBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointBatchRequest]
  }
  
  @scala.inline
  implicit class EndpointBatchRequestOps[Self <: EndpointBatchRequest] (val x: Self) extends AnyVal {
    
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
    def setItemVarargs(value: EndpointBatchItem*): Self = this.set("Item", js.Array(value :_*))
    
    @scala.inline
    def setItem(value: js.Array[EndpointBatchItem] | Iterable[EndpointBatchItem]): Self = this.set("Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
  }
}
