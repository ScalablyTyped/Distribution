package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointBatchItemMod

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

trait _UnmarshalledEndpointBatchItem extends _EndpointBatchItem {
  /**
    * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create a segment of users to engage with a messaging campaign.
    *
    * The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console does not display attributes that include these characters in the name. This limitation does not apply to attribute values.
    */
  @JSName("Attributes")
  var Attributes__UnmarshalledEndpointBatchItem: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  /**
    * The endpoint demographic attributes.
    */
  @JSName("Demographic")
  var Demographic__UnmarshalledEndpointBatchItem: js.UndefOr[_UnmarshalledEndpointDemographic] = js.undefined
  /**
    * The endpoint location attributes.
    */
  @JSName("Location")
  var Location__UnmarshalledEndpointBatchItem: js.UndefOr[_UnmarshalledEndpointLocation] = js.undefined
  /**
    * Custom metrics that your app reports to Amazon Pinpoint.
    */
  @JSName("Metrics")
  var Metrics__UnmarshalledEndpointBatchItem: js.UndefOr[StringDictionary[Double]] = js.undefined
  /**
    * Custom user-specific attributes that your app reports to Amazon Pinpoint.
    */
  @JSName("User")
  var User__UnmarshalledEndpointBatchItem: js.UndefOr[_UnmarshalledEndpointUser] = js.undefined
}

object _UnmarshalledEndpointBatchItem {
  @scala.inline
  def apply(
    Address: String = null,
    Attributes: StringDictionary[js.Array[String]] = null,
    ChannelType: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String = null,
    Demographic: _UnmarshalledEndpointDemographic = null,
    EffectiveDate: String = null,
    EndpointStatus: String = null,
    Id: String = null,
    Location: _UnmarshalledEndpointLocation = null,
    Metrics: StringDictionary[Double] = null,
    OptOut: String = null,
    RequestId: String = null,
    User: _UnmarshalledEndpointUser = null
  ): _UnmarshalledEndpointBatchItem = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (ChannelType != null) __obj.updateDynamic("ChannelType")(ChannelType.asInstanceOf[js.Any])
    if (Demographic != null) __obj.updateDynamic("Demographic")(Demographic)
    if (EffectiveDate != null) __obj.updateDynamic("EffectiveDate")(EffectiveDate)
    if (EndpointStatus != null) __obj.updateDynamic("EndpointStatus")(EndpointStatus)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics)
    if (OptOut != null) __obj.updateDynamic("OptOut")(OptOut)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (User != null) __obj.updateDynamic("User")(User)
    __obj.asInstanceOf[_UnmarshalledEndpointBatchItem]
  }
}

