package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPlatformApplicationAttributesResponse extends StObject {
  
  /**
    * Attributes include the following:    EventEndpointCreated – Topic ARN to which EndpointCreated event notifications should be sent.    EventEndpointDeleted – Topic ARN to which EndpointDeleted event notifications should be sent.    EventEndpointUpdated – Topic ARN to which EndpointUpdate event notifications should be sent.    EventDeliveryFailure – Topic ARN to which DeliveryFailure event notifications should be sent upon Direct Publish delivery failure (permanent) to one of the application's endpoints.  
    */
  var Attributes: js.UndefOr[MapStringToString] = js.native
}
object GetPlatformApplicationAttributesResponse {
  
  @scala.inline
  def apply(): GetPlatformApplicationAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPlatformApplicationAttributesResponse]
  }
  
  @scala.inline
  implicit class GetPlatformApplicationAttributesResponseMutableBuilder[Self <: GetPlatformApplicationAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: MapStringToString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
  }
}
