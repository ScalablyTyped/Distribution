package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateAttributeGroupResponse extends StObject {
  
  /**
    * The Amazon resource name (ARN) that specifies the application.
    */
  var applicationArn: js.UndefOr[ApplicationArn] = js.native
  
  /**
    * The Amazon resource name (ARN) that specifies the attribute group.
    */
  var attributeGroupArn: js.UndefOr[AttributeGroupArn] = js.native
}
object DisassociateAttributeGroupResponse {
  
  @scala.inline
  def apply(): DisassociateAttributeGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateAttributeGroupResponse]
  }
  
  @scala.inline
  implicit class DisassociateAttributeGroupResponseMutableBuilder[Self <: DisassociateAttributeGroupResponse] (val x: Self) extends AnyVal {
    
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
