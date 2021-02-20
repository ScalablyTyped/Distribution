package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEndpointAttributesResponse extends StObject {
  
  /**
    * Attributes include the following:    CustomUserData – arbitrary user data to associate with the endpoint. Amazon SNS does not use this data. The data must be in UTF-8 format and less than 2KB.    Enabled – flag that enables/disables delivery to the endpoint. Amazon SNS will set this to false when a notification service indicates to Amazon SNS that the endpoint is invalid. Users can set it back to true, typically after updating Token.    Token – device token, also referred to as a registration id, for an app and mobile device. This is returned from the notification service when an app and mobile device are registered with the notification service.  The device token for the iOS platform is returned in lowercase.   
    */
  var Attributes: js.UndefOr[MapStringToString] = js.native
}
object GetEndpointAttributesResponse {
  
  @scala.inline
  def apply(): GetEndpointAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEndpointAttributesResponse]
  }
  
  @scala.inline
  implicit class GetEndpointAttributesResponseMutableBuilder[Self <: GetEndpointAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: MapStringToString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
  }
}
