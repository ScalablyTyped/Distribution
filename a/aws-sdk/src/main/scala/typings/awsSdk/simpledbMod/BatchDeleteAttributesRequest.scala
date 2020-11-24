package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteAttributesRequest extends js.Object {
  
  /**
    * The name of the domain in which the attributes are being deleted.
    */
  var DomainName: String = js.native
  
  /**
    * A list of items on which to perform the operation.
    */
  var Items: DeletableItemList = js.native
}
object BatchDeleteAttributesRequest {
  
  @scala.inline
  def apply(DomainName: String, Items: DeletableItemList): BatchDeleteAttributesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteAttributesRequest]
  }
  
  @scala.inline
  implicit class BatchDeleteAttributesRequestOps[Self <: BatchDeleteAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomainName(value: String): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: DeletableItem*): Self = this.set("Items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: DeletableItemList): Self = this.set("Items", value.asInstanceOf[js.Any])
  }
}
