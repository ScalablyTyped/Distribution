package typings.awsSdkClientPinpointBrowser.typesMessageMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DEEP_LINK
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPEN_APP
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  /**
    * The action that occurs if the user taps a push notification delivered by the campaign:
    * OPEN_APP - Your app launches, or it becomes the foreground app if it has been sent to the background. This is the default action.
    *
    * DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface within the app.
    *
    * URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify.
    */
  var Action: js.UndefOr[OPEN_APP | DEEP_LINK | URL | String] = js.native
  /**
    * The message body. Can include up to 140 characters.
    */
  var Body: js.UndefOr[String] = js.native
  /**
    * The URL that points to the icon image for the push notification icon, for example, the app icon.
    */
  var ImageIconUrl: js.UndefOr[String] = js.native
  /**
    * The URL that points to the small icon image for the push notification icon, for example, the app icon.
    */
  var ImageSmallIconUrl: js.UndefOr[String] = js.native
  /**
    * The URL that points to an image used in the push notification.
    */
  var ImageUrl: js.UndefOr[String] = js.native
  /**
    * The JSON payload used for a silent push.
    */
  var JsonBody: js.UndefOr[String] = js.native
  /**
    * The URL that points to the media resource, for example a .mp4 or .gif file.
    */
  var MediaUrl: js.UndefOr[String] = js.native
  /**
    * The Raw JSON formatted string to be used as the payload. This value overrides the message.
    */
  var RawContent: js.UndefOr[String] = js.native
  /**
    * Indicates if the message should display on the users device.
    *
    * Silent pushes can be used for Remote Configuration and Phone Home use cases.
    */
  var SilentPush: js.UndefOr[Boolean] = js.native
  /**
    * This parameter specifies how long (in seconds) the message should be kept if the service is unable to deliver the notification the first time. If the value is 0, it treats the notification as if it expires immediately and does not store the notification or attempt to redeliver it. This value is converted to the expiration field when sent to the service. It only applies to APNs and GCM
    */
  var TimeToLive: js.UndefOr[Double] = js.native
  /**
    * The message title that displays above the message on the user's device.
    */
  var Title: js.UndefOr[String] = js.native
  /**
    * The URL to open in the user's mobile browser. Used if the value for Action is URL.
    */
  var Url: js.UndefOr[String] = js.native
}

object Message {
  @scala.inline
  def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: OPEN_APP | DEEP_LINK | URL | String): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    @scala.inline
    def setBody(value: String): Self = this.set("Body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    @scala.inline
    def setImageIconUrl(value: String): Self = this.set("ImageIconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageIconUrl: Self = this.set("ImageIconUrl", js.undefined)
    @scala.inline
    def setImageSmallIconUrl(value: String): Self = this.set("ImageSmallIconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSmallIconUrl: Self = this.set("ImageSmallIconUrl", js.undefined)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("ImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("ImageUrl", js.undefined)
    @scala.inline
    def setJsonBody(value: String): Self = this.set("JsonBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonBody: Self = this.set("JsonBody", js.undefined)
    @scala.inline
    def setMediaUrl(value: String): Self = this.set("MediaUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaUrl: Self = this.set("MediaUrl", js.undefined)
    @scala.inline
    def setRawContent(value: String): Self = this.set("RawContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawContent: Self = this.set("RawContent", js.undefined)
    @scala.inline
    def setSilentPush(value: Boolean): Self = this.set("SilentPush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilentPush: Self = this.set("SilentPush", js.undefined)
    @scala.inline
    def setTimeToLive(value: Double): Self = this.set("TimeToLive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeToLive: Self = this.set("TimeToLive", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
  
}

