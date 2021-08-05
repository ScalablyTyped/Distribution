package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateAttributeGroupResponse extends StObject {
  
  /**
    * The Amazon resource name (ARN) that specifies the application.
    */
  var applicationArn: js.UndefOr[ApplicationArn] = js.undefined
  
  /**
    * The Amazon resource name (ARN) that specifies the attribute group.
    */
  var attributeGroupArn: js.UndefOr[AttributeGroupArn] = js.undefined
}
object DisassociateAttributeGroupResponse {
  
  inline def apply(): DisassociateAttributeGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateAttributeGroupResponse]
  }
  
  extension [Self <: DisassociateAttributeGroupResponse](x: Self) {
    
    inline def setApplicationArn(value: ApplicationArn): Self = StObject.set(x, "applicationArn", value.asInstanceOf[js.Any])
    
    inline def setApplicationArnUndefined: Self = StObject.set(x, "applicationArn", js.undefined)
    
    inline def setAttributeGroupArn(value: AttributeGroupArn): Self = StObject.set(x, "attributeGroupArn", value.asInstanceOf[js.Any])
    
    inline def setAttributeGroupArnUndefined: Self = StObject.set(x, "attributeGroupArn", js.undefined)
  }
}
