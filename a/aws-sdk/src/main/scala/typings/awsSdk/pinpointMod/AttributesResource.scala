package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesResource extends StObject {
  
  /**
    * The unique identifier for the application.
    */
  var ApplicationId: string
  
  /**
    * The type of attribute or attributes that were removed from the endpoints. Valid values are: endpoint-custom-attributes - Custom attributes that describe endpoints. endpoint-metric-attributes - Custom metrics that your app reports to Amazon Pinpoint for endpoints. endpoint-user-attributes - Custom attributes that describe users.
    */
  var AttributeType: string
  
  /**
    * An array that specifies the names of the attributes that were removed from the endpoints.
    */
  var Attributes: js.UndefOr[ListOfString] = js.undefined
}
object AttributesResource {
  
  inline def apply(ApplicationId: string, AttributeType: string): AttributesResource = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesResource]
  }
  
  extension [Self <: AttributesResource](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setAttributeType(value: string): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: ListOfString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: string*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
  }
}
