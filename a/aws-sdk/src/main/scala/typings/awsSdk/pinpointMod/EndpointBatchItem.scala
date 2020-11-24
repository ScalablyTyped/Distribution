package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointBatchItem extends js.Object {
  
  /**
    * The destination address for messages or push notifications that you send to the endpoint. The address varies by channel. For a push-notification channel, use the token provided by the push notification service, such as an Apple Push Notification service (APNs) device token or a Firebase Cloud Messaging (FCM) registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100. For the email channel, use an email address.
    */
  var Address: js.UndefOr[string] = js.native
  
  /**
    * One or more custom attributes that describe the endpoint by associating a name with an array of values. For example, the value of a custom attribute named Interests might be: ["Science", "Music", "Travel"]. You can use these attributes as filter criteria when you create segments. Attribute names are case sensitive. An attribute name can contain up to 50 characters. An attribute value can contain up to 100 characters. When you define the name of a custom attribute, avoid using the following characters: number sign (#), colon (:), question mark (?), backslash (\), and slash (/). The Amazon Pinpoint console can't display attribute names that contain these characters. This restriction doesn't apply to attribute values.
    */
  var Attributes: js.UndefOr[MapOfListOfString] = js.native
  
  /**
    * The channel to use when sending messages or push notifications to the endpoint.
    */
  var ChannelType: js.UndefOr[typings.awsSdk.pinpointMod.ChannelType] = js.native
  
  /**
    * The demographic information for the endpoint, such as the time zone and platform.
    */
  var Demographic: js.UndefOr[EndpointDemographic] = js.native
  
  /**
    * The date and time, in ISO 8601 format, when the endpoint was created or updated.
    */
  var EffectiveDate: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether to send messages or push notifications to the endpoint. Valid values are: ACTIVE, messages are sent to the endpoint; and, INACTIVE, messages aren’t sent to the endpoint. Amazon Pinpoint automatically sets this value to ACTIVE when you create an endpoint or update an existing endpoint. Amazon Pinpoint automatically sets this value to INACTIVE if you update another endpoint that has the same address specified by the Address property.
    */
  var EndpointStatus: js.UndefOr[string] = js.native
  
  /**
    * The unique identifier for the endpoint in the context of the batch.
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * The geographic information for the endpoint.
    */
  var Location: js.UndefOr[EndpointLocation] = js.native
  
  /**
    * One or more custom metrics that your app reports to Amazon Pinpoint for the endpoint.
    */
  var Metrics: js.UndefOr[MapOfDouble] = js.native
  
  /**
    * Specifies whether the user who's associated with the endpoint has opted out of receiving messages and push notifications from you. Possible values are: ALL, the user has opted out and doesn't want to receive any messages or push notifications; and, NONE, the user hasn't opted out and wants to receive all messages and push notifications.
    */
  var OptOut: js.UndefOr[string] = js.native
  
  /**
    * The unique identifier for the request to create or update the endpoint.
    */
  var RequestId: js.UndefOr[string] = js.native
  
  /**
    * One or more custom attributes that describe the user who's associated with the endpoint.
    */
  var User: js.UndefOr[EndpointUser] = js.native
}
object EndpointBatchItem {
  
  @scala.inline
  def apply(): EndpointBatchItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointBatchItem]
  }
  
  @scala.inline
  implicit class EndpointBatchItemOps[Self <: EndpointBatchItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: string): Self = this.set("Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("Address", js.undefined)
    
    @scala.inline
    def setAttributes(value: MapOfListOfString): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setChannelType(value: ChannelType): Self = this.set("ChannelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelType: Self = this.set("ChannelType", js.undefined)
    
    @scala.inline
    def setDemographic(value: EndpointDemographic): Self = this.set("Demographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDemographic: Self = this.set("Demographic", js.undefined)
    
    @scala.inline
    def setEffectiveDate(value: string): Self = this.set("EffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveDate: Self = this.set("EffectiveDate", js.undefined)
    
    @scala.inline
    def setEndpointStatus(value: string): Self = this.set("EndpointStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointStatus: Self = this.set("EndpointStatus", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setLocation(value: EndpointLocation): Self = this.set("Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    
    @scala.inline
    def setMetrics(value: MapOfDouble): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
    
    @scala.inline
    def setOptOut(value: string): Self = this.set("OptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptOut: Self = this.set("OptOut", js.undefined)
    
    @scala.inline
    def setRequestId(value: string): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setUser(value: EndpointUser): Self = this.set("User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
  }
}
