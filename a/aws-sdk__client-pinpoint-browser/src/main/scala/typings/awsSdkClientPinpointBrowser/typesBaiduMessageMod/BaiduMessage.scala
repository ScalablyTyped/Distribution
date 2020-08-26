package typings.awsSdkClientPinpointBrowser.typesBaiduMessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DEEP_LINK
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPEN_APP
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.URL
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaiduMessage extends js.Object {
  /**
    * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app launches, or it becomes the foreground app if it has been sent to the background. This is the default action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
    */
  var Action: js.UndefOr[OPEN_APP | DEEP_LINK | URL | String] = js.native
  /**
    * The message body of the notification.
    */
  var Body: js.UndefOr[String] = js.native
  /**
    * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
    */
  var Data: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
  /**
    * The icon image name of the asset saved in your application.
    */
  var IconReference: js.UndefOr[String] = js.native
  /**
    * The URL that points to an image used as the large icon to the notification content view.
    */
  var ImageIconUrl: js.UndefOr[String] = js.native
  /**
    * The URL that points to an image used in the push notification.
    */
  var ImageUrl: js.UndefOr[String] = js.native
  /**
    * The Raw JSON formatted string to be used as the payload. This value overrides the message.
    */
  var RawContent: js.UndefOr[String] = js.native
  /**
    * Indicates if the message should display on the users device. Silent pushes can be used for Remote Configuration and Phone Home use cases.
    */
  var SilentPush: js.UndefOr[Boolean] = js.native
  /**
    * The URL that points to an image used as the small icon for the notification which will be used to represent the notification in the status bar and content view
    */
  var SmallImageIconUrl: js.UndefOr[String] = js.native
  /**
    * Indicates a sound to play when the device receives the notification. Supports default, or the filename of a sound resource bundled in the app. Android sound files must reside in /res/raw/
    */
  var Sound: js.UndefOr[String] = js.native
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  var Substitutions: js.UndefOr[
    (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
  ] = js.native
  /**
    * This parameter specifies how long (in seconds) the message should be kept in Baidu storage if the device is offline. The and the default value and the maximum time to live supported is 7 days (604800 seconds)
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

object BaiduMessage {
  @scala.inline
  def apply(): BaiduMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaiduMessage]
  }
  @scala.inline
  implicit class BaiduMessageOps[Self <: BaiduMessage] (val x: Self) extends AnyVal {
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
    def setData(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
    @scala.inline
    def setIconReference(value: String): Self = this.set("IconReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconReference: Self = this.set("IconReference", js.undefined)
    @scala.inline
    def setImageIconUrl(value: String): Self = this.set("ImageIconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageIconUrl: Self = this.set("ImageIconUrl", js.undefined)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("ImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("ImageUrl", js.undefined)
    @scala.inline
    def setRawContent(value: String): Self = this.set("RawContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawContent: Self = this.set("RawContent", js.undefined)
    @scala.inline
    def setSilentPush(value: Boolean): Self = this.set("SilentPush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilentPush: Self = this.set("SilentPush", js.undefined)
    @scala.inline
    def setSmallImageIconUrl(value: String): Self = this.set("SmallImageIconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmallImageIconUrl: Self = this.set("SmallImageIconUrl", js.undefined)
    @scala.inline
    def setSound(value: String): Self = this.set("Sound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSound: Self = this.set("Sound", js.undefined)
    @scala.inline
    def setSubstitutions(
      value: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
    ): Self = this.set("Substitutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstitutions: Self = this.set("Substitutions", js.undefined)
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

