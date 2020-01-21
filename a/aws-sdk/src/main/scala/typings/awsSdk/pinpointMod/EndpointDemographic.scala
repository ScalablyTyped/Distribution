package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointDemographic extends js.Object {
  /**
    * The version of the app that's associated with the endpoint.
    */
  var AppVersion: js.UndefOr[string] = js.native
  /**
    * The locale of the endpoint, in the following format: the ISO 639-1 alpha-2 code, followed by an underscore (_), followed by an ISO 3166-1 alpha-2 value.
    */
  var Locale: js.UndefOr[string] = js.native
  /**
    * The manufacturer of the endpoint device, such as apple or samsung.
    */
  var Make: js.UndefOr[string] = js.native
  /**
    * The model name or number of the endpoint device, such as iPhone or SM-G900F.
    */
  var Model: js.UndefOr[string] = js.native
  /**
    * The model version of the endpoint device.
    */
  var ModelVersion: js.UndefOr[string] = js.native
  /**
    * The platform of the endpoint device, such as ios.
    */
  var Platform: js.UndefOr[string] = js.native
  /**
    * The platform version of the endpoint device.
    */
  var PlatformVersion: js.UndefOr[string] = js.native
  /**
    * The time zone of the endpoint, specified as a tz database name value, such as America/Los_Angeles.
    */
  var Timezone: js.UndefOr[string] = js.native
}

object EndpointDemographic {
  @scala.inline
  def apply(
    AppVersion: string = null,
    Locale: string = null,
    Make: string = null,
    Model: string = null,
    ModelVersion: string = null,
    Platform: string = null,
    PlatformVersion: string = null,
    Timezone: string = null
  ): EndpointDemographic = {
    val __obj = js.Dynamic.literal()
    if (AppVersion != null) __obj.updateDynamic("AppVersion")(AppVersion.asInstanceOf[js.Any])
    if (Locale != null) __obj.updateDynamic("Locale")(Locale.asInstanceOf[js.Any])
    if (Make != null) __obj.updateDynamic("Make")(Make.asInstanceOf[js.Any])
    if (Model != null) __obj.updateDynamic("Model")(Model.asInstanceOf[js.Any])
    if (ModelVersion != null) __obj.updateDynamic("ModelVersion")(ModelVersion.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (PlatformVersion != null) __obj.updateDynamic("PlatformVersion")(PlatformVersion.asInstanceOf[js.Any])
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointDemographic]
  }
}

