package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ADM
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.APNS
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.APNS_SANDBOX
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.APNS_VOIP
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.APNS_VOIP_SANDBOX
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.BAIDU
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CUSTOM
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.EMAIL
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.GCM
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.SMS
import typings.awsSdkClientPinpointBrowser.typesEndpointDemographicMod.EndpointDemographic
import typings.awsSdkClientPinpointBrowser.typesEndpointDemographicMod.UnmarshalledEndpointDemographic
import typings.awsSdkClientPinpointBrowser.typesEndpointLocationMod.EndpointLocation
import typings.awsSdkClientPinpointBrowser.typesEndpointLocationMod.UnmarshalledEndpointLocation
import typings.awsSdkClientPinpointBrowser.typesEndpointUserMod.EndpointUser
import typings.awsSdkClientPinpointBrowser.typesEndpointUserMod.UnmarshalledEndpointUser
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEndpointRequestMod {
  
  trait EndpointRequest extends StObject {
    
    /**
      * The destination for messages that you send to this endpoint. The address varies by channel. For mobile push channels, use the token provided by the push notification service, such as the APNs device token or the FCM registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100. For the email channel, use an email address.
      */
    var Address: js.UndefOr[String] = js.undefined
    
    /**
      * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create a segment of users to engage with a messaging campaign.
      *
      * The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console does not display attributes that include these characters in the name. This limitation does not apply to attribute values.
      */
    var Attributes: js.UndefOr[
        (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ] = js.undefined
    
    /**
      * The channel type.
      *
      * Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
      */
    var ChannelType: js.UndefOr[
        GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String
      ] = js.undefined
    
    /**
      * Demographic attributes for the endpoint.
      */
    var Demographic: js.UndefOr[EndpointDemographic] = js.undefined
    
    /**
      * The date and time when the endpoint was updated, shown in ISO 8601 format.
      */
    var EffectiveDate: js.UndefOr[String] = js.undefined
    
    /**
      * Unused.
      */
    var EndpointStatus: js.UndefOr[String] = js.undefined
    
    /**
      * The endpoint location attributes.
      */
    var Location: js.UndefOr[EndpointLocation] = js.undefined
    
    /**
      * Custom metrics that your app reports to Amazon Pinpoint.
      */
    var Metrics: js.UndefOr[StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])] = js.undefined
    
    /**
      * Indicates whether a user has opted out of receiving messages with one of the following values:
      *
      * ALL - User has opted out of all messages.
      *
      * NONE - Users has not opted out and receives all messages.
      */
    var OptOut: js.UndefOr[String] = js.undefined
    
    /**
      * The unique ID for the most recent request to update the endpoint.
      */
    var RequestId: js.UndefOr[String] = js.undefined
    
    /**
      * Custom user-specific attributes that your app reports to Amazon Pinpoint.
      */
    var User: js.UndefOr[EndpointUser] = js.undefined
  }
  object EndpointRequest {
    
    @scala.inline
    def apply(): EndpointRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointRequest]
    }
    
    @scala.inline
    implicit class EndpointRequestMutableBuilder[Self <: EndpointRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
      
      @scala.inline
      def setAttributes(
        value: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setChannelType(
        value: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String
      ): Self = StObject.set(x, "ChannelType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelTypeUndefined: Self = StObject.set(x, "ChannelType", js.undefined)
      
      @scala.inline
      def setDemographic(value: EndpointDemographic): Self = StObject.set(x, "Demographic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDemographicUndefined: Self = StObject.set(x, "Demographic", js.undefined)
      
      @scala.inline
      def setEffectiveDate(value: String): Self = StObject.set(x, "EffectiveDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectiveDateUndefined: Self = StObject.set(x, "EffectiveDate", js.undefined)
      
      @scala.inline
      def setEndpointStatus(value: String): Self = StObject.set(x, "EndpointStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointStatusUndefined: Self = StObject.set(x, "EndpointStatus", js.undefined)
      
      @scala.inline
      def setLocation(value: EndpointLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
      
      @scala.inline
      def setMetrics(value: StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
      
      @scala.inline
      def setOptOut(value: String): Self = StObject.set(x, "OptOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptOutUndefined: Self = StObject.set(x, "OptOut", js.undefined)
      
      @scala.inline
      def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
      
      @scala.inline
      def setUser(value: EndpointUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    }
  }
  
  trait UnmarshalledEndpointRequest
    extends StObject
       with EndpointRequest {
    
    /**
      * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create a segment of users to engage with a messaging campaign.
      *
      * The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console does not display attributes that include these characters in the name. This limitation does not apply to attribute values.
      */
    @JSName("Attributes")
    var Attributes_UnmarshalledEndpointRequest: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
    
    /**
      * Demographic attributes for the endpoint.
      */
    @JSName("Demographic")
    var Demographic_UnmarshalledEndpointRequest: js.UndefOr[UnmarshalledEndpointDemographic] = js.undefined
    
    /**
      * The endpoint location attributes.
      */
    @JSName("Location")
    var Location_UnmarshalledEndpointRequest: js.UndefOr[UnmarshalledEndpointLocation] = js.undefined
    
    /**
      * Custom metrics that your app reports to Amazon Pinpoint.
      */
    @JSName("Metrics")
    var Metrics_UnmarshalledEndpointRequest: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    /**
      * Custom user-specific attributes that your app reports to Amazon Pinpoint.
      */
    @JSName("User")
    var User_UnmarshalledEndpointRequest: js.UndefOr[UnmarshalledEndpointUser] = js.undefined
  }
  object UnmarshalledEndpointRequest {
    
    @scala.inline
    def apply(): UnmarshalledEndpointRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEndpointRequest]
    }
    
    @scala.inline
    implicit class UnmarshalledEndpointRequestMutableBuilder[Self <: UnmarshalledEndpointRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setDemographic(value: UnmarshalledEndpointDemographic): Self = StObject.set(x, "Demographic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDemographicUndefined: Self = StObject.set(x, "Demographic", js.undefined)
      
      @scala.inline
      def setLocation(value: UnmarshalledEndpointLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
      
      @scala.inline
      def setMetrics(value: StringDictionary[Double]): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
      
      @scala.inline
      def setUser(value: UnmarshalledEndpointUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    }
  }
}
