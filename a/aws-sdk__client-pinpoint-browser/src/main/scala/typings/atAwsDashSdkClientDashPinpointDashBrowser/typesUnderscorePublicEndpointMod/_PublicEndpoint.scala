package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscorePublicEndpointMod

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
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointDemographicMod._EndpointDemographic
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointLocationMod._EndpointLocation
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointUserMod._EndpointUser
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PublicEndpoint extends js.Object {
  /**
    * The unique identifier for the recipient. For example, an address could be a device token, email address, or mobile phone number.
    */
  var Address: js.UndefOr[String] = js.undefined
  /**
    * Custom attributes that your app reports to Amazon Pinpoint. You can use these attributes as selection criteria when you create a segment.
    */
  var Attributes: js.UndefOr[
    (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
  ] = js.undefined
  /**
    * The channel type.
    *
    * Valid values: APNS, GCM
    */
  var ChannelType: js.UndefOr[
    GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String
  ] = js.undefined
  /**
    * The endpoint demographic attributes.
    */
  var Demographic: js.UndefOr[_EndpointDemographic] = js.undefined
  /**
    * The date and time when the endpoint was last updated, in  ISO 8601 format.
    */
  var EffectiveDate: js.UndefOr[String] = js.undefined
  /**
    * The status of the endpoint. If the update fails, the value is INACTIVE. If the endpoint is updated successfully, the value is ACTIVE.
    */
  var EndpointStatus: js.UndefOr[String] = js.undefined
  /**
    * The endpoint location attributes.
    */
  var Location: js.UndefOr[_EndpointLocation] = js.undefined
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
    * A unique identifier that is generated each time the endpoint is updated.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  /**
    * Custom user-specific attributes that your app reports to Amazon Pinpoint.
    */
  var User: js.UndefOr[_EndpointUser] = js.undefined
}

object _PublicEndpoint {
  @scala.inline
  def apply(
    Address: String = null,
    Attributes: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]]) = null,
    ChannelType: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String = null,
    Demographic: _EndpointDemographic = null,
    EffectiveDate: String = null,
    EndpointStatus: String = null,
    Location: _EndpointLocation = null,
    Metrics: StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]]) = null,
    OptOut: String = null,
    RequestId: String = null,
    User: _EndpointUser = null
  ): _PublicEndpoint = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (ChannelType != null) __obj.updateDynamic("ChannelType")(ChannelType.asInstanceOf[js.Any])
    if (Demographic != null) __obj.updateDynamic("Demographic")(Demographic.asInstanceOf[js.Any])
    if (EffectiveDate != null) __obj.updateDynamic("EffectiveDate")(EffectiveDate.asInstanceOf[js.Any])
    if (EndpointStatus != null) __obj.updateDynamic("EndpointStatus")(EndpointStatus.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (OptOut != null) __obj.updateDynamic("OptOut")(OptOut.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[_PublicEndpoint]
  }
}

