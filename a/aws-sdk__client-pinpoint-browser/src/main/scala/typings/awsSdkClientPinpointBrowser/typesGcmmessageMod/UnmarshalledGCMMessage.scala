package typings.awsSdkClientPinpointBrowser.typesGcmmessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DEEP_LINK
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPEN_APP
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledGCMMessage extends GCMMessage {
  /**
    * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
    */
  @JSName("Data")
  var Data_UnmarshalledGCMMessage: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  @JSName("Substitutions")
  var Substitutions_UnmarshalledGCMMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
}

object UnmarshalledGCMMessage {
  @scala.inline
  def apply(
    Action: OPEN_APP | DEEP_LINK | URL | String = null,
    Body: String = null,
    CollapseKey: String = null,
    Data: StringDictionary[String] = null,
    IconReference: String = null,
    ImageIconUrl: String = null,
    ImageUrl: String = null,
    Priority: String = null,
    RawContent: String = null,
    RestrictedPackageName: String = null,
    SilentPush: js.UndefOr[Boolean] = js.undefined,
    SmallImageIconUrl: String = null,
    Sound: String = null,
    Substitutions: StringDictionary[js.Array[String]] = null,
    TimeToLive: js.UndefOr[Double] = js.undefined,
    Title: String = null,
    Url: String = null
  ): UnmarshalledGCMMessage = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (CollapseKey != null) __obj.updateDynamic("CollapseKey")(CollapseKey.asInstanceOf[js.Any])
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    if (IconReference != null) __obj.updateDynamic("IconReference")(IconReference.asInstanceOf[js.Any])
    if (ImageIconUrl != null) __obj.updateDynamic("ImageIconUrl")(ImageIconUrl.asInstanceOf[js.Any])
    if (ImageUrl != null) __obj.updateDynamic("ImageUrl")(ImageUrl.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (RawContent != null) __obj.updateDynamic("RawContent")(RawContent.asInstanceOf[js.Any])
    if (RestrictedPackageName != null) __obj.updateDynamic("RestrictedPackageName")(RestrictedPackageName.asInstanceOf[js.Any])
    if (!js.isUndefined(SilentPush)) __obj.updateDynamic("SilentPush")(SilentPush.get.asInstanceOf[js.Any])
    if (SmallImageIconUrl != null) __obj.updateDynamic("SmallImageIconUrl")(SmallImageIconUrl.asInstanceOf[js.Any])
    if (Sound != null) __obj.updateDynamic("Sound")(Sound.asInstanceOf[js.Any])
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    if (!js.isUndefined(TimeToLive)) __obj.updateDynamic("TimeToLive")(TimeToLive.get.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledGCMMessage]
  }
}

