package typings.awsSdk.simpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAttributesRequest extends StObject {
  
  /**
    * A list of Attributes. Similar to columns on a spreadsheet, attributes represent categories of data that can be assigned to items.
    */
  var Attributes: js.UndefOr[DeletableAttributeList] = js.native
  
  /**
    * The name of the domain in which to perform the operation.
    */
  var DomainName: String = js.native
  
  /**
    * The update condition which, if specified, determines whether the specified attributes will be deleted or not. The update condition must be satisfied in order for this request to be processed and the attributes to be deleted.
    */
  var Expected: js.UndefOr[UpdateCondition] = js.native
  
  /**
    * The name of the item. Similar to rows on a spreadsheet, items represent individual objects that contain one or more value-attribute pairs.
    */
  var ItemName: String = js.native
}
object DeleteAttributesRequest {
  
  @scala.inline
  def apply(DomainName: String, ItemName: String): DeleteAttributesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAttributesRequest]
  }
  
  @scala.inline
  implicit class DeleteAttributesRequestMutableBuilder[Self <: DeleteAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: DeletableAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: DeletableAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpected(value: UpdateCondition): Self = StObject.set(x, "Expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedUndefined: Self = StObject.set(x, "Expected", js.undefined)
    
    @scala.inline
    def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
  }
}
