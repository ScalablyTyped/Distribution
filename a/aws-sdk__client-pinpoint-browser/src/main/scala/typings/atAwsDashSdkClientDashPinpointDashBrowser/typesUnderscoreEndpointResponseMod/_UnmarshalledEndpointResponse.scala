package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.ADM
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.APNS
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.APNS_SANDBOX
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.APNS_VOIP
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.APNS_VOIP_SANDBOX
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.BAIDU
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.CUSTOM
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.EMAIL
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.GCM
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.SMS
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointDemographicMod._UnmarshalledEndpointDemographic
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointLocationMod._UnmarshalledEndpointLocation
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointUserMod._UnmarshalledEndpointUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledEndpointResponse extends _EndpointResponse {
  /**
    * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the following values: ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create segments.
    *
    * The Amazon Pinpoint console can't display attribute names that include the following characters: hash/pound sign (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason, you should avoid using these characters in the names of custom attributes.
    */
  @JSName("Attributes")
  var Attributes__UnmarshalledEndpointResponse: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  /**
    * The endpoint demographic attributes.
    */
  @JSName("Demographic")
  var Demographic__UnmarshalledEndpointResponse: js.UndefOr[_UnmarshalledEndpointDemographic] = js.undefined
  /**
    * The endpoint location attributes.
    */
  @JSName("Location")
  var Location__UnmarshalledEndpointResponse: js.UndefOr[_UnmarshalledEndpointLocation] = js.undefined
  /**
    * Custom metrics that your app reports to Amazon Pinpoint.
    */
  @JSName("Metrics")
  var Metrics__UnmarshalledEndpointResponse: js.UndefOr[StringDictionary[Double]] = js.undefined
  /**
    * Custom user-specific attributes that your app reports to Amazon Pinpoint.
    */
  @JSName("User")
  var User__UnmarshalledEndpointResponse: js.UndefOr[_UnmarshalledEndpointUser] = js.undefined
}

object _UnmarshalledEndpointResponse {
  @scala.inline
  def apply(
    Address: String = null,
    ApplicationId: String = null,
    Attributes: StringDictionary[js.Array[String]] = null,
    ChannelType: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String = null,
    CohortId: String = null,
    CreationDate: String = null,
    Demographic: _UnmarshalledEndpointDemographic = null,
    EffectiveDate: String = null,
    EndpointStatus: String = null,
    Id: String = null,
    Location: _UnmarshalledEndpointLocation = null,
    Metrics: StringDictionary[Double] = null,
    OptOut: String = null,
    RequestId: String = null,
    User: _UnmarshalledEndpointUser = null
  ): _UnmarshalledEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (ChannelType != null) __obj.updateDynamic("ChannelType")(ChannelType.asInstanceOf[js.Any])
    if (CohortId != null) __obj.updateDynamic("CohortId")(CohortId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Demographic != null) __obj.updateDynamic("Demographic")(Demographic.asInstanceOf[js.Any])
    if (EffectiveDate != null) __obj.updateDynamic("EffectiveDate")(EffectiveDate.asInstanceOf[js.Any])
    if (EndpointStatus != null) __obj.updateDynamic("EndpointStatus")(EndpointStatus.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (OptOut != null) __obj.updateDynamic("OptOut")(OptOut.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledEndpointResponse]
  }
}

