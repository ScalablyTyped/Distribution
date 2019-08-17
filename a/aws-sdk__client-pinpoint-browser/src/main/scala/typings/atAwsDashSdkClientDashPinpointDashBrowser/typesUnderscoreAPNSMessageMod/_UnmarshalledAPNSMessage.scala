package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAPNSMessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.DEEP_LINK
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.OPEN_APP
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledAPNSMessage extends _APNSMessage {
  /**
    * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
    */
  @JSName("Data")
  var Data__UnmarshalledAPNSMessage: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  @JSName("Substitutions")
  var Substitutions__UnmarshalledAPNSMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
}

object _UnmarshalledAPNSMessage {
  @scala.inline
  def apply(
    Action: OPEN_APP | DEEP_LINK | URL | String = null,
    Badge: Int | Double = null,
    Body: String = null,
    Category: String = null,
    CollapseId: String = null,
    Data: StringDictionary[String] = null,
    MediaUrl: String = null,
    PreferredAuthenticationMethod: String = null,
    Priority: String = null,
    RawContent: String = null,
    SilentPush: js.UndefOr[Boolean] = js.undefined,
    Sound: String = null,
    Substitutions: StringDictionary[js.Array[String]] = null,
    ThreadId: String = null,
    TimeToLive: Int | Double = null,
    Title: String = null,
    Url: String = null
  ): _UnmarshalledAPNSMessage = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Badge != null) __obj.updateDynamic("Badge")(Badge.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (Category != null) __obj.updateDynamic("Category")(Category)
    if (CollapseId != null) __obj.updateDynamic("CollapseId")(CollapseId)
    if (Data != null) __obj.updateDynamic("Data")(Data)
    if (MediaUrl != null) __obj.updateDynamic("MediaUrl")(MediaUrl)
    if (PreferredAuthenticationMethod != null) __obj.updateDynamic("PreferredAuthenticationMethod")(PreferredAuthenticationMethod)
    if (Priority != null) __obj.updateDynamic("Priority")(Priority)
    if (RawContent != null) __obj.updateDynamic("RawContent")(RawContent)
    if (!js.isUndefined(SilentPush)) __obj.updateDynamic("SilentPush")(SilentPush)
    if (Sound != null) __obj.updateDynamic("Sound")(Sound)
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions)
    if (ThreadId != null) __obj.updateDynamic("ThreadId")(ThreadId)
    if (TimeToLive != null) __obj.updateDynamic("TimeToLive")(TimeToLive.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[_UnmarshalledAPNSMessage]
  }
}

