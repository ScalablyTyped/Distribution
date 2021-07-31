package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicEndpoint extends StObject {
  
  /**
    * The unique identifier for the recipient, such as a device token, email address, or mobile phone number.
    */
  var Address: js.UndefOr[string] = js.undefined
  
  /**
    * One or more custom attributes that describe the endpoint by associating a name with an array of values. You can use these attributes as filter criteria when you create segments.
    */
  var Attributes: js.UndefOr[MapOfListOfString] = js.undefined
  
  /**
    * The channel that's used when sending messages or push notifications to the endpoint.
    */
  var ChannelType: js.UndefOr[typings.awsSdk.pinpointMod.ChannelType] = js.undefined
  
  /**
    * The demographic information for the endpoint, such as the time zone and platform.
    */
  var Demographic: js.UndefOr[EndpointDemographic] = js.undefined
  
  /**
    * The date and time, in ISO 8601 format, when the endpoint was last updated.
    */
  var EffectiveDate: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether to send messages or push notifications to the endpoint. Valid values are: ACTIVE, messages are sent to the endpoint; and, INACTIVE, messages aren’t sent to the endpoint. Amazon Pinpoint automatically sets this value to ACTIVE when you create an endpoint or update an existing endpoint. Amazon Pinpoint automatically sets this value to INACTIVE if you update another endpoint that has the same address specified by the Address property.
    */
  var EndpointStatus: js.UndefOr[string] = js.undefined
  
  /**
    * The geographic information for the endpoint.
    */
  var Location: js.UndefOr[EndpointLocation] = js.undefined
  
  /**
    * One or more custom metrics that your app reports to Amazon Pinpoint for the endpoint.
    */
  var Metrics: js.UndefOr[MapOfDouble] = js.undefined
  
  /**
    * Specifies whether the user who's associated with the endpoint has opted out of receiving messages and push notifications from you. Possible values are: ALL, the user has opted out and doesn't want to receive any messages or push notifications; and, NONE, the user hasn't opted out and wants to receive all messages and push notifications.
    */
  var OptOut: js.UndefOr[string] = js.undefined
  
  /**
    * A unique identifier that's generated each time the endpoint is updated.
    */
  var RequestId: js.UndefOr[string] = js.undefined
  
  /**
    * One or more custom user attributes that your app reports to Amazon Pinpoint for the user who's associated with the endpoint.
    */
  var User: js.UndefOr[EndpointUser] = js.undefined
}
object PublicEndpoint {
  
  @scala.inline
  def apply(): PublicEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicEndpoint]
  }
  
  @scala.inline
  implicit class PublicEndpointMutableBuilder[Self <: PublicEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: string): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    @scala.inline
    def setAttributes(value: MapOfListOfString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setChannelType(value: ChannelType): Self = StObject.set(x, "ChannelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTypeUndefined: Self = StObject.set(x, "ChannelType", js.undefined)
    
    @scala.inline
    def setDemographic(value: EndpointDemographic): Self = StObject.set(x, "Demographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemographicUndefined: Self = StObject.set(x, "Demographic", js.undefined)
    
    @scala.inline
    def setEffectiveDate(value: string): Self = StObject.set(x, "EffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveDateUndefined: Self = StObject.set(x, "EffectiveDate", js.undefined)
    
    @scala.inline
    def setEndpointStatus(value: string): Self = StObject.set(x, "EndpointStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointStatusUndefined: Self = StObject.set(x, "EndpointStatus", js.undefined)
    
    @scala.inline
    def setLocation(value: EndpointLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    @scala.inline
    def setMetrics(value: MapOfDouble): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    @scala.inline
    def setOptOut(value: string): Self = StObject.set(x, "OptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptOutUndefined: Self = StObject.set(x, "OptOut", js.undefined)
    
    @scala.inline
    def setRequestId(value: string): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setUser(value: EndpointUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
