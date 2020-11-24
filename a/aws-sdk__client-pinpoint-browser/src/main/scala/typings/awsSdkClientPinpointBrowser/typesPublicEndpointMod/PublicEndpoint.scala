package typings.awsSdkClientPinpointBrowser.typesPublicEndpointMod

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
import typings.awsSdkClientPinpointBrowser.typesEndpointLocationMod.EndpointLocation
import typings.awsSdkClientPinpointBrowser.typesEndpointUserMod.EndpointUser
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicEndpoint extends js.Object {
  
  /**
    * The unique identifier for the recipient. For example, an address could be a device token, email address, or mobile phone number.
    */
  var Address: js.UndefOr[String] = js.native
  
  /**
    * Custom attributes that your app reports to Amazon Pinpoint. You can use these attributes as selection criteria when you create a segment.
    */
  var Attributes: js.UndefOr[
    (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
  ] = js.native
  
  /**
    * The channel type.
    *
    * Valid values: APNS, GCM
    */
  var ChannelType: js.UndefOr[
    GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String
  ] = js.native
  
  /**
    * The endpoint demographic attributes.
    */
  var Demographic: js.UndefOr[EndpointDemographic] = js.native
  
  /**
    * The date and time when the endpoint was last updated, in  ISO 8601 format.
    */
  var EffectiveDate: js.UndefOr[String] = js.native
  
  /**
    * The status of the endpoint. If the update fails, the value is INACTIVE. If the endpoint is updated successfully, the value is ACTIVE.
    */
  var EndpointStatus: js.UndefOr[String] = js.native
  
  /**
    * The endpoint location attributes.
    */
  var Location: js.UndefOr[EndpointLocation] = js.native
  
  /**
    * Custom metrics that your app reports to Amazon Pinpoint.
    */
  var Metrics: js.UndefOr[StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])] = js.native
  
  /**
    * Indicates whether a user has opted out of receiving messages with one of the following values:
    *
    * ALL - User has opted out of all messages.
    *
    * NONE - Users has not opted out and receives all messages.
    */
  var OptOut: js.UndefOr[String] = js.native
  
  /**
    * A unique identifier that is generated each time the endpoint is updated.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * Custom user-specific attributes that your app reports to Amazon Pinpoint.
    */
  var User: js.UndefOr[EndpointUser] = js.native
}
object PublicEndpoint {
  
  @scala.inline
  def apply(): PublicEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicEndpoint]
  }
  
  @scala.inline
  implicit class PublicEndpointOps[Self <: PublicEndpoint] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("Address", js.undefined)
    
    @scala.inline
    def setAttributes(
      value: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
    ): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setChannelType(
      value: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String
    ): Self = this.set("ChannelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelType: Self = this.set("ChannelType", js.undefined)
    
    @scala.inline
    def setDemographic(value: EndpointDemographic): Self = this.set("Demographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDemographic: Self = this.set("Demographic", js.undefined)
    
    @scala.inline
    def setEffectiveDate(value: String): Self = this.set("EffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveDate: Self = this.set("EffectiveDate", js.undefined)
    
    @scala.inline
    def setEndpointStatus(value: String): Self = this.set("EndpointStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointStatus: Self = this.set("EndpointStatus", js.undefined)
    
    @scala.inline
    def setLocation(value: EndpointLocation): Self = this.set("Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    
    @scala.inline
    def setMetrics(value: StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
    
    @scala.inline
    def setOptOut(value: String): Self = this.set("OptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptOut: Self = this.set("OptOut", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setUser(value: EndpointUser): Self = this.set("User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
  }
}
