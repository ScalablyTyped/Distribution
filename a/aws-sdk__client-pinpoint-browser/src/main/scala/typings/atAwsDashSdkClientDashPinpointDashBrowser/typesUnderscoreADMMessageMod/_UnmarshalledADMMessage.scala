package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreADMMessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.DEEP_LINK
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.OPEN_APP
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledADMMessage extends _ADMMessage {
  /**
    * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
    */
  @JSName("Data")
  var Data__UnmarshalledADMMessage: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  @JSName("Substitutions")
  var Substitutions__UnmarshalledADMMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
}

object _UnmarshalledADMMessage {
  @scala.inline
  def apply(
    Action: OPEN_APP | DEEP_LINK | URL | String = null,
    Body: String = null,
    ConsolidationKey: String = null,
    Data: StringDictionary[String] = null,
    ExpiresAfter: String = null,
    IconReference: String = null,
    ImageIconUrl: String = null,
    ImageUrl: String = null,
    MD5: String = null,
    RawContent: String = null,
    SilentPush: js.UndefOr[Boolean] = js.undefined,
    SmallImageIconUrl: String = null,
    Sound: String = null,
    Substitutions: StringDictionary[js.Array[String]] = null,
    Title: String = null,
    Url: String = null
  ): _UnmarshalledADMMessage = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (ConsolidationKey != null) __obj.updateDynamic("ConsolidationKey")(ConsolidationKey.asInstanceOf[js.Any])
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    if (ExpiresAfter != null) __obj.updateDynamic("ExpiresAfter")(ExpiresAfter.asInstanceOf[js.Any])
    if (IconReference != null) __obj.updateDynamic("IconReference")(IconReference.asInstanceOf[js.Any])
    if (ImageIconUrl != null) __obj.updateDynamic("ImageIconUrl")(ImageIconUrl.asInstanceOf[js.Any])
    if (ImageUrl != null) __obj.updateDynamic("ImageUrl")(ImageUrl.asInstanceOf[js.Any])
    if (MD5 != null) __obj.updateDynamic("MD5")(MD5.asInstanceOf[js.Any])
    if (RawContent != null) __obj.updateDynamic("RawContent")(RawContent.asInstanceOf[js.Any])
    if (!js.isUndefined(SilentPush)) __obj.updateDynamic("SilentPush")(SilentPush.asInstanceOf[js.Any])
    if (SmallImageIconUrl != null) __obj.updateDynamic("SmallImageIconUrl")(SmallImageIconUrl.asInstanceOf[js.Any])
    if (Sound != null) __obj.updateDynamic("Sound")(Sound.asInstanceOf[js.Any])
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledADMMessage]
  }
}

