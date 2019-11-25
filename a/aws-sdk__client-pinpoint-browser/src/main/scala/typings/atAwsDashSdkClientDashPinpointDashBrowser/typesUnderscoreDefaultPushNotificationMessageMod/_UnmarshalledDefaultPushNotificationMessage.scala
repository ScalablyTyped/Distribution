package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreDefaultPushNotificationMessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.DEEP_LINK
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.OPEN_APP
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledDefaultPushNotificationMessage extends _DefaultPushNotificationMessage {
  /**
    * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
    */
  @JSName("Data")
  var Data__UnmarshalledDefaultPushNotificationMessage: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  @JSName("Substitutions")
  var Substitutions__UnmarshalledDefaultPushNotificationMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
}

object _UnmarshalledDefaultPushNotificationMessage {
  @scala.inline
  def apply(
    Action: OPEN_APP | DEEP_LINK | URL | String = null,
    Body: String = null,
    Data: StringDictionary[String] = null,
    SilentPush: js.UndefOr[Boolean] = js.undefined,
    Substitutions: StringDictionary[js.Array[String]] = null,
    Title: String = null,
    Url: String = null
  ): _UnmarshalledDefaultPushNotificationMessage = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    if (!js.isUndefined(SilentPush)) __obj.updateDynamic("SilentPush")(SilentPush.asInstanceOf[js.Any])
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledDefaultPushNotificationMessage]
  }
}

