package typings.awsSdkClientPinpointBrowser.typesMessageMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DEEP_LINK
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPEN_APP
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /**
    * The action that occurs if the user taps a push notification delivered by the campaign:
    * OPEN_APP - Your app launches, or it becomes the foreground app if it has been sent to the background. This is the default action.
    *
    * DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface within the app.
    *
    * URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify.
    */
  var Action: js.UndefOr[OPEN_APP | DEEP_LINK | URL | String] = js.undefined
  /**
    * The message body. Can include up to 140 characters.
    */
  var Body: js.UndefOr[String] = js.undefined
  /**
    * The URL that points to the icon image for the push notification icon, for example, the app icon.
    */
  var ImageIconUrl: js.UndefOr[String] = js.undefined
  /**
    * The URL that points to the small icon image for the push notification icon, for example, the app icon.
    */
  var ImageSmallIconUrl: js.UndefOr[String] = js.undefined
  /**
    * The URL that points to an image used in the push notification.
    */
  var ImageUrl: js.UndefOr[String] = js.undefined
  /**
    * The JSON payload used for a silent push.
    */
  var JsonBody: js.UndefOr[String] = js.undefined
  /**
    * The URL that points to the media resource, for example a .mp4 or .gif file.
    */
  var MediaUrl: js.UndefOr[String] = js.undefined
  /**
    * The Raw JSON formatted string to be used as the payload. This value overrides the message.
    */
  var RawContent: js.UndefOr[String] = js.undefined
  /**
    * Indicates if the message should display on the users device.
    *
    * Silent pushes can be used for Remote Configuration and Phone Home use cases.
    */
  var SilentPush: js.UndefOr[Boolean] = js.undefined
  /**
    * This parameter specifies how long (in seconds) the message should be kept if the service is unable to deliver the notification the first time. If the value is 0, it treats the notification as if it expires immediately and does not store the notification or attempt to redeliver it. This value is converted to the expiration field when sent to the service. It only applies to APNs and GCM
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

object Message {
  @scala.inline
  def apply(
    Action: OPEN_APP | DEEP_LINK | URL | String = null,
    Body: String = null,
    ImageIconUrl: String = null,
    ImageSmallIconUrl: String = null,
    ImageUrl: String = null,
    JsonBody: String = null,
    MediaUrl: String = null,
    RawContent: String = null,
    SilentPush: js.UndefOr[Boolean] = js.undefined,
    TimeToLive: js.UndefOr[Double] = js.undefined,
    Title: String = null,
    Url: String = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (ImageIconUrl != null) __obj.updateDynamic("ImageIconUrl")(ImageIconUrl.asInstanceOf[js.Any])
    if (ImageSmallIconUrl != null) __obj.updateDynamic("ImageSmallIconUrl")(ImageSmallIconUrl.asInstanceOf[js.Any])
    if (ImageUrl != null) __obj.updateDynamic("ImageUrl")(ImageUrl.asInstanceOf[js.Any])
    if (JsonBody != null) __obj.updateDynamic("JsonBody")(JsonBody.asInstanceOf[js.Any])
    if (MediaUrl != null) __obj.updateDynamic("MediaUrl")(MediaUrl.asInstanceOf[js.Any])
    if (RawContent != null) __obj.updateDynamic("RawContent")(RawContent.asInstanceOf[js.Any])
    if (!js.isUndefined(SilentPush)) __obj.updateDynamic("SilentPush")(SilentPush.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TimeToLive)) __obj.updateDynamic("TimeToLive")(TimeToLive.get.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

