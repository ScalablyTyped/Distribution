package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAttributeGroupRequest extends StObject {
  
  /**
    * The name or ID of the attribute group that holds the attributes to describe the application.
    */
  var attributeGroup: AttributeGroupSpecifier = js.native
}
object GetAttributeGroupRequest {
  
  @scala.inline
  def apply(attributeGroup: AttributeGroupSpecifier): GetAttributeGroupRequest = {
    val __obj = js.Dynamic.literal(attributeGroup = attributeGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttributeGroupRequest]
  }
  
  @scala.inline
  implicit class GetAttributeGroupRequestMutableBuilder[Self <: GetAttributeGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeGroup(value: AttributeGroupSpecifier): Self = StObject.set(x, "attributeGroup", value.asInstanceOf[js.Any])
  }
}
