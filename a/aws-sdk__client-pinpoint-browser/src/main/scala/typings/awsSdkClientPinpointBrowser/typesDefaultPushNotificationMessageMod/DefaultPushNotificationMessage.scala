package typings.awsSdkClientPinpointBrowser.typesDefaultPushNotificationMessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DEEP_LINK
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPEN_APP
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.URL
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultPushNotificationMessage extends js.Object {
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
    * Indicates if the message should display on the recipient's device. You can use silent pushes for remote configuration or to deliver messages to in-app notification centers.
    */
  var SilentPush: js.UndefOr[Boolean] = js.native
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  var Substitutions: js.UndefOr[
    (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
  ] = js.native
  /**
    * The message title that displays above the message on the user's device.
    */
  var Title: js.UndefOr[String] = js.native
  /**
    * The URL to open in the user's mobile browser. Used if the value for Action is URL.
    */
  var Url: js.UndefOr[String] = js.native
}

object DefaultPushNotificationMessage {
  @scala.inline
  def apply(): DefaultPushNotificationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultPushNotificationMessage]
  }
  @scala.inline
  implicit class DefaultPushNotificationMessageOps[Self <: DefaultPushNotificationMessage] (val x: Self) extends AnyVal {
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
    def setSilentPush(value: Boolean): Self = this.set("SilentPush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilentPush: Self = this.set("SilentPush", js.undefined)
    @scala.inline
    def setSubstitutions(
      value: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
    ): Self = this.set("Substitutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstitutions: Self = this.set("Substitutions", js.undefined)
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

