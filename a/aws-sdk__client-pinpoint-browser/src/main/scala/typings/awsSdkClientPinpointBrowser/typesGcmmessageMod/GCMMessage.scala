package typings.awsSdkClientPinpointBrowser.typesGcmmessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DEEP_LINK
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPEN_APP
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.URL
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GCMMessage extends js.Object {
  /**
    * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app launches, or it becomes the foreground app if it has been sent to the background. This is the default action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
    */
  var Action: js.UndefOr[OPEN_APP | DEEP_LINK | URL | String] = js.undefined
  /**
    * The message body of the notification.
    */
  var Body: js.UndefOr[String] = js.undefined
  /**
    * This parameter identifies a group of messages (e.g., with collapse_key: "Updates Available") that can be collapsed, so that only the last message gets sent when delivery can be resumed. This is intended to avoid sending too many of the same messages when the device comes back online or becomes active.
    */
  var CollapseKey: js.UndefOr[String] = js.undefined
  /**
    * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
    */
  var Data: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
  /**
    * The icon image name of the asset saved in your application.
    */
  var IconReference: js.UndefOr[String] = js.undefined
  /**
    * The URL that points to an image used as the large icon to the notification content view.
    */
  var ImageIconUrl: js.UndefOr[String] = js.undefined
  /**
    * The URL that points to an image used in the push notification.
    */
  var ImageUrl: js.UndefOr[String] = js.undefined
  /**
    * The message priority. Amazon Pinpoint uses this value to set the FCM or GCM priority parameter when it sends the message. Accepts the following values:
    *
    * "Normal" - Messages might be delayed. Delivery is optimized for battery usage on the receiving device. Use normal priority unless immediate delivery is required.
    *
    * "High" - Messages are sent immediately and might wake a sleeping device.
    *
    * The equivalent values for APNs messages are "5" and "10". Amazon Pinpoint accepts these values here and converts them.
    *
    * For more information, see About FCM Messages in the Firebase documentation.
    */
  var Priority: js.UndefOr[String] = js.undefined
  /**
    * The Raw JSON formatted string to be used as the payload. This value overrides the message.
    */
  var RawContent: js.UndefOr[String] = js.undefined
  /**
    * This parameter specifies the package name of the application where the registration tokens must match in order to receive the message.
    */
  var RestrictedPackageName: js.UndefOr[String] = js.undefined
  /**
    * Indicates if the message should display on the users device. Silent pushes can be used for Remote Configuration and Phone Home use cases.
    */
  var SilentPush: js.UndefOr[Boolean] = js.undefined
  /**
    * The URL that points to an image used as the small icon for the notification which will be used to represent the notification in the status bar and content view
    */
  var SmallImageIconUrl: js.UndefOr[String] = js.undefined
  /**
    * Indicates a sound to play when the device receives the notification. Supports default, or the filename of a sound resource bundled in the app. Android sound files must reside in /res/raw/
    */
  var Sound: js.UndefOr[String] = js.undefined
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  var Substitutions: js.UndefOr[
    (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
  ] = js.undefined
  /**
    * The length of time (in seconds) that FCM or GCM stores and attempts to deliver the message. If unspecified, the value defaults to the maximum, which is 2,419,200 seconds (28 days). Amazon Pinpoint uses this value to set the FCM or GCM time_to_live parameter.
    */
  var TimeToLive: js.UndefOr[Double] = js.undefined
  /**
    * The message title that displays above the message on the user's device.
    */
  var Title: js.UndefOr[String] = js.undefined
  /**
    * The URL to open in the user's mobile browser. Used if the value for Action is URL.
    */
  var Url: js.UndefOr[String] = js.undefined
}

object GCMMessage {
  @scala.inline
  def apply(
    Action: OPEN_APP | DEEP_LINK | URL | String = null,
    Body: String = null,
    CollapseKey: String = null,
    Data: StringDictionary[String] | (Iterable[js.Tuple2[String, String]]) = null,
    IconReference: String = null,
    ImageIconUrl: String = null,
    ImageUrl: String = null,
    Priority: String = null,
    RawContent: String = null,
    RestrictedPackageName: String = null,
    SilentPush: js.UndefOr[Boolean] = js.undefined,
    SmallImageIconUrl: String = null,
    Sound: String = null,
    Substitutions: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]]) = null,
    TimeToLive: js.UndefOr[Double] = js.undefined,
    Title: String = null,
    Url: String = null
  ): GCMMessage = {
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
    __obj.asInstanceOf[GCMMessage]
  }
}

