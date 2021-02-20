package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributesResource extends StObject {
  
  /**
    * The unique identifier for the application.
    */
  var ApplicationId: string = js.native
  
  /**
    * The type of attribute or attributes that were removed from the endpoints. Valid values are: endpoint-custom-attributes - Custom attributes that describe endpoints. endpoint-metric-attributes - Custom metrics that your app reports to Amazon Pinpoint for endpoints. endpoint-user-attributes - Custom attributes that describe users.
    */
  var AttributeType: string = js.native
  
  /**
    * An array that specifies the names of the attributes that were removed from the endpoints.
    */
  var Attributes: js.UndefOr[ListOfString] = js.native
}
object AttributesResource {
  
  @scala.inline
  def apply(ApplicationId: string, AttributeType: string): AttributesResource = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesResource]
  }
  
  @scala.inline
  implicit class AttributesResourceMutableBuilder[Self <: AttributesResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeType(value: string): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: ListOfString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: string*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
  }
}
