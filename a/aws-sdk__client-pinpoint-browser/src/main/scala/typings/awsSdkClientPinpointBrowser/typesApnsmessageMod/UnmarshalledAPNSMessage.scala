package typings.awsSdkClientPinpointBrowser.typesApnsmessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DEEP_LINK
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPEN_APP
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledAPNSMessage extends APNSMessage {
  /**
    * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
    */
  @JSName("Data")
  var Data_UnmarshalledAPNSMessage: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  @JSName("Substitutions")
  var Substitutions_UnmarshalledAPNSMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
}

object UnmarshalledAPNSMessage {
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
  ): UnmarshalledAPNSMessage = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Badge != null) __obj.updateDynamic("Badge")(Badge.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (Category != null) __obj.updateDynamic("Category")(Category.asInstanceOf[js.Any])
    if (CollapseId != null) __obj.updateDynamic("CollapseId")(CollapseId.asInstanceOf[js.Any])
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    if (MediaUrl != null) __obj.updateDynamic("MediaUrl")(MediaUrl.asInstanceOf[js.Any])
    if (PreferredAuthenticationMethod != null) __obj.updateDynamic("PreferredAuthenticationMethod")(PreferredAuthenticationMethod.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (RawContent != null) __obj.updateDynamic("RawContent")(RawContent.asInstanceOf[js.Any])
    if (!js.isUndefined(SilentPush)) __obj.updateDynamic("SilentPush")(SilentPush.asInstanceOf[js.Any])
    if (Sound != null) __obj.updateDynamic("Sound")(Sound.asInstanceOf[js.Any])
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    if (ThreadId != null) __obj.updateDynamic("ThreadId")(ThreadId.asInstanceOf[js.Any])
    if (TimeToLive != null) __obj.updateDynamic("TimeToLive")(TimeToLive.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAPNSMessage]
  }
}

