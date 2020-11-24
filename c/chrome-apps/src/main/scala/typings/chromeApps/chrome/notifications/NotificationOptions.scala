package typings.chromeApps.chrome.notifications

import typings.chromeApps.anon.BASIC
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsNumbers.`-1`
import typings.chromeApps.chromeAppsNumbers.`-2`
import typings.chromeApps.chromeAppsNumbers.`0`
import typings.chromeApps.chromeAppsNumbers.`1`
import typings.chromeApps.chromeAppsNumbers.`2`
import typings.chromeApps.chromeAppsStrings.IMAGE
import typings.chromeApps.chromeAppsStrings.LIST
import typings.chromeApps.chromeAppsStrings.PROGRESS
import typings.chromeApps.chromeAppsStrings.basic_
import typings.chromeApps.chromeAppsStrings.image_
import typings.chromeApps.chromeAppsStrings.list_
import typings.chromeApps.chromeAppsStrings.progress_
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationOptions extends js.Object {
  
  /**
    * @deprecated since Chrome 59. The app icon mask is not visible for Mac OS X users.
    * A URL to the app icon mask. URLs have the same restrictions as iconUrl.
    * The app icon mask should be in alpha channel,
    * as only the alpha channel of the image will be considered.
    */
  var appIconMaskUrl: js.UndefOr[String] = js.native
  
  /** Text and icons for up to two notification action buttons. */
  var buttons: js.UndefOr[js.Array[ButtonOptions]] = js.native
  
  /**
    * Alternate notification content with a lower-weight font.
    * @since Chrome 31.
    */
  var contextMessage: js.UndefOr[String] = js.native
  
  /** A timestamp associated with the notification, in milliseconds past the epoch (e.g. Date.now() + n). */
  var eventTime: js.UndefOr[double] = js.native
  
  /**
    * Optional.
    * A URL to the sender's avatar, app icon, or a thumbnail for image notifications.
    * URLs can be a data URL, a blob URL, or a URL relative to a resource within this app's .crx file Required for notifications.create method.
    */
  var iconUrl: String = js.native
  
  /**
    * @deprecated Deprecated since Chrome 59. The image is not visible for Mac OS X users.
    * A URL to the image thumbnail for image-type notifications.
    * URLs have the same restrictions as iconUrl.
    */
  var imageUrl: js.UndefOr[String] = js.native
  
  /**
    * @deprecated Deprecated since Chrome 67. This UI hint is ignored as of Chrome 67
    * @description Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
    */
  var isClickable: js.UndefOr[Boolean] = js.native
  
  /**
    * Items for multi-item notifications.
    * Items for multi-item notifications. Users on Mac OS X only see the first item.
    */
  var items: js.UndefOr[js.Array[ItemOptions]] = js.native
  
  /** Main notification content. Required for notifications.create method. */
  var message: String = js.native
  
  /**
    * Priority ranges from -2 to 2. -2 is lowest priority. 2 is highest.
    * On platforms that don't support a notification center (Windows, Linux & Mac),
    * -2 and -1 result in an error as notifications with those priorities will not be shown at all.
    * @default 0
    */
  var priority: js.UndefOr[`-2` | `-1` | `0` | `1` | `2`] = js.native
  
  /**
    * Current progress ranges from 0 to 100.
    * @since Chrome 30.
    */
  var progress: js.UndefOr[integer] = js.native
  
  /**
    * Indicates that the notification should remain visible
    * on screen until the user activates or dismisses the notification.
    * This defaults to false.
    * @since Chrome 50
    */
  var requireInteraction: js.UndefOr[Boolean] = js.native
  
  /**
    * @since Chrome 70.
    * @description Indicates that no sounds or vibrations should be made when the notification is being shown.
    * @default false
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /** Title of the notification (e.g. sender name for email). Required for notifications.create method. */
  var title: String = js.native
  
  /**
    * Which type of notification to display. Required for notifications.create method.
    * @see enum TemplateType
    */
  var `type`: ToStringLiteral[
    BASIC, 
    /* keyof chrome-apps.anon.BASIC */ typings.chromeApps.chromeAppsStrings.BASIC | IMAGE | LIST | PROGRESS, 
    Exclude[
      /* keyof chrome-apps.anon.BASIC */ typings.chromeApps.chromeAppsStrings.BASIC | IMAGE | LIST | PROGRESS, 
      basic_ | image_ | list_ | progress_
    ]
  ] = js.native
}
object NotificationOptions {
  
  @scala.inline
  def apply(
    iconUrl: String,
    message: String,
    title: String,
    `type`: ToStringLiteral[
      BASIC, 
      /* keyof chrome-apps.anon.BASIC */ typings.chromeApps.chromeAppsStrings.BASIC | IMAGE | LIST | PROGRESS, 
      Exclude[
        /* keyof chrome-apps.anon.BASIC */ typings.chromeApps.chromeAppsStrings.BASIC | IMAGE | LIST | PROGRESS, 
        basic_ | image_ | list_ | progress_
      ]
    ]
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
  
  @scala.inline
  implicit class NotificationOptionsOps[Self <: NotificationOptions] (val x: Self) extends AnyVal {
    
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
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: ToStringLiteral[
          BASIC, 
          /* keyof chrome-apps.anon.BASIC */ typings.chromeApps.chromeAppsStrings.BASIC | IMAGE | LIST | PROGRESS, 
          Exclude[
            /* keyof chrome-apps.anon.BASIC */ typings.chromeApps.chromeAppsStrings.BASIC | IMAGE | LIST | PROGRESS, 
            basic_ | image_ | list_ | progress_
          ]
        ]
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIconMaskUrl(value: String): Self = this.set("appIconMaskUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppIconMaskUrl: Self = this.set("appIconMaskUrl", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: ButtonOptions*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[ButtonOptions]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setContextMessage(value: String): Self = this.set("contextMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMessage: Self = this.set("contextMessage", js.undefined)
    
    @scala.inline
    def setEventTime(value: double): Self = this.set("eventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTime: Self = this.set("eventTime", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setIsClickable(value: Boolean): Self = this.set("isClickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsClickable: Self = this.set("isClickable", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ItemOptions*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ItemOptions]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setPriority(value: `-2` | `-1` | `0` | `1` | `2`): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setProgress(value: integer): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setRequireInteraction(value: Boolean): Self = this.set("requireInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireInteraction: Self = this.set("requireInteraction", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
}
