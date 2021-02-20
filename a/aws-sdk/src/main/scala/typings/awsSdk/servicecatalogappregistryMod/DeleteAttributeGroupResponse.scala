package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAttributeGroupResponse extends StObject {
  
  /**
    * Information about the deleted attribute group.
    */
  var attributeGroup: js.UndefOr[AttributeGroupSummary] = js.native
}
object DeleteAttributeGroupResponse {
  
  @scala.inline
  def apply(): DeleteAttributeGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAttributeGroupResponse]
  }
  
  @scala.inline
  implicit class DeleteAttributeGroupResponseMutableBuilder[Self <: DeleteAttributeGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeGroup(value: AttributeGroupSummary): Self = StObject.set(x, "attributeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeGroupUndefined: Self = StObject.set(x, "attributeGroup", js.undefined)
  }
}
