package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateAttributeGroupResponse extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the application that was augmented with attributes.
    */
  var applicationArn: js.UndefOr[ApplicationArn] = js.undefined
  
  /**
    * The Amazon resource name (ARN) of the attribute group that contains the application's new attributes.
    */
  var attributeGroupArn: js.UndefOr[AttributeGroupArn] = js.undefined
}
object AssociateAttributeGroupResponse {
  
  @scala.inline
  def apply(): AssociateAttributeGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateAttributeGroupResponse]
  }
  
  @scala.inline
  implicit class AssociateAttributeGroupResponseMutableBuilder[Self <: AssociateAttributeGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationArn(value: ApplicationArn): Self = StObject.set(x, "applicationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationArnUndefined: Self = StObject.set(x, "applicationArn", js.undefined)
    
    @scala.inline
    def setAttributeGroupArn(value: AttributeGroupArn): Self = StObject.set(x, "attributeGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeGroupArnUndefined: Self = StObject.set(x, "attributeGroupArn", js.undefined)
  }
}
