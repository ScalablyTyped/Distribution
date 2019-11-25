package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointDemographicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EndpointDemographic extends js.Object {
  /**
    * The version of the application associated with the endpoint.
    */
  var AppVersion: js.UndefOr[String] = js.undefined
  /**
    * The endpoint locale in the following format: The ISO 639-1 alpha-2 code, followed by an underscore, followed by an ISO 3166-1 alpha-2 value.
    *
    */
  var Locale: js.UndefOr[String] = js.undefined
  /**
    * The manufacturer of the endpoint device, such as Apple or Samsung.
    */
  var Make: js.UndefOr[String] = js.undefined
  /**
    * The model name or number of the endpoint device, such as iPhone.
    */
  var Model: js.UndefOr[String] = js.undefined
  /**
    * The model version of the endpoint device.
    */
  var ModelVersion: js.UndefOr[String] = js.undefined
  /**
    * The platform of the endpoint device, such as iOS or Android.
    */
  var Platform: js.UndefOr[String] = js.undefined
  /**
    * The platform version of the endpoint device.
    */
  var PlatformVersion: js.UndefOr[String] = js.undefined
  /**
    * The timezone of the endpoint. Specified as a tz database value, such as Americas/Los_Angeles.
    */
  var Timezone: js.UndefOr[String] = js.undefined
}

object _EndpointDemographic {
  @scala.inline
  def apply(
    AppVersion: String = null,
    Locale: String = null,
    Make: String = null,
    Model: String = null,
    ModelVersion: String = null,
    Platform: String = null,
    PlatformVersion: String = null,
    Timezone: String = null
  ): _EndpointDemographic = {
    val __obj = js.Dynamic.literal()
    if (AppVersion != null) __obj.updateDynamic("AppVersion")(AppVersion.asInstanceOf[js.Any])
    if (Locale != null) __obj.updateDynamic("Locale")(Locale.asInstanceOf[js.Any])
    if (Make != null) __obj.updateDynamic("Make")(Make.asInstanceOf[js.Any])
    if (Model != null) __obj.updateDynamic("Model")(Model.asInstanceOf[js.Any])
    if (ModelVersion != null) __obj.updateDynamic("ModelVersion")(ModelVersion.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (PlatformVersion != null) __obj.updateDynamic("PlatformVersion")(PlatformVersion.asInstanceOf[js.Any])
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EndpointDemographic]
  }
}

