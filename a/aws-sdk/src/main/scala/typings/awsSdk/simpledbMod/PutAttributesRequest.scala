package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAttributesRequest extends js.Object {
  
  /**
    * The list of attributes.
    */
  var Attributes: ReplaceableAttributeList = js.native
  
  /**
    * The name of the domain in which to perform the operation.
    */
  var DomainName: String = js.native
  
  /**
    * The update condition which, if specified, determines whether the specified attributes will be updated or not. The update condition must be satisfied in order for this request to be processed and the attributes to be updated.
    */
  var Expected: js.UndefOr[UpdateCondition] = js.native
  
  /**
    * The name of the item.
    */
  var ItemName: String = js.native
}
object PutAttributesRequest {
  
  @scala.inline
  def apply(Attributes: ReplaceableAttributeList, DomainName: String, ItemName: String): PutAttributesRequest = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAttributesRequest]
  }
  
  @scala.inline
  implicit class PutAttributesRequestOps[Self <: PutAttributesRequest] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: ReplaceableAttribute*): Self = this.set("Attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: ReplaceableAttributeList): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: String): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemName(value: String): Self = this.set("ItemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpected(value: UpdateCondition): Self = this.set("Expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpected: Self = this.set("Expected", js.undefined)
  }
}
