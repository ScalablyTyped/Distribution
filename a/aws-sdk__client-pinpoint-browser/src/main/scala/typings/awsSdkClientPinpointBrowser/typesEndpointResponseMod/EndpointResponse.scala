package typings.awsSdkClientPinpointBrowser.typesEndpointResponseMod

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
import scala.scalajs.js.annotation._

@js.native
trait EndpointResponse extends js.Object {
  /**
    * The address of the endpoint as provided by your push provider. For example, the DeviceToken or RegistrationId.
    */
  var Address: js.UndefOr[String] = js.native
  /**
    * The ID of the application that is associated with the endpoint.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the following values: ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create segments.
    *
    * The Amazon Pinpoint console can't display attribute names that include the following characters: hash/pound sign (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason, you should avoid using these characters in the names of custom attributes.
    */
  var Attributes: js.UndefOr[
    (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
  ] = js.native
  /**
    * The channel type.
    *
    * Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
    */
  var ChannelType: js.UndefOr[
    GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String
  ] = js.native
  /**
    * A number from 0-99 that represents the cohort the endpoint is assigned to. Endpoints are grouped into cohorts randomly, and each cohort contains approximately 1 percent of the endpoints for an app. Amazon Pinpoint assigns cohorts to the holdout or treatment allocations for a campaign.
    */
  var CohortId: js.UndefOr[String] = js.native
  /**
    * The date and time when the endpoint was created, shown in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * The endpoint demographic attributes.
    */
  var Demographic: js.UndefOr[EndpointDemographic] = js.native
  /**
    * The date and time when the endpoint was last updated, shown in ISO 8601 format.
    */
  var EffectiveDate: js.UndefOr[String] = js.native
  /**
    * Unused.
    */
  var EndpointStatus: js.UndefOr[String] = js.native
  /**
    * The unique ID that you assigned to the endpoint. The ID should be a globally unique identifier (GUID) to ensure that it doesn't conflict with other endpoint IDs associated with the application.
    */
  var Id: js.UndefOr[String] = js.native
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
    * The unique ID for the most recent request to update the endpoint.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * Custom user-specific attributes that your app reports to Amazon Pinpoint.
    */
  var User: js.UndefOr[EndpointUser] = js.native
}

object EndpointResponse {
  @scala.inline
  def apply(): EndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointResponse]
  }
  @scala.inline
  implicit class EndpointResponseOps[Self <: EndpointResponse] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: String): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
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
    def setCohortId(value: String): Self = this.set("CohortId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCohortId: Self = this.set("CohortId", js.undefined)
    @scala.inline
    def setCreationDate(value: String): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
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

