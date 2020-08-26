package typings.chromeApps.anon

import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.notifications.ButtonOptions
import typings.chromeApps.chrome.notifications.ItemOptions
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
import scala.scalajs.js.annotation._

/* Inlined std.Partial<chrome-apps.chrome.notifications.NotificationOptions> */
@js.native
trait PartialNotificationOption extends js.Object {
  var appIconMaskUrl: js.UndefOr[String] = js.native
  var buttons: js.UndefOr[js.Array[ButtonOptions]] = js.native
  var contextMessage: js.UndefOr[String] = js.native
  var eventTime: js.UndefOr[double] = js.native
  var iconUrl: js.UndefOr[String] = js.native
  var imageUrl: js.UndefOr[String] = js.native
  var isClickable: js.UndefOr[Boolean] = js.native
  var items: js.UndefOr[js.Array[ItemOptions]] = js.native
  var message: js.UndefOr[String] = js.native
  var priority: js.UndefOr[`-2` | `-1` | `0` | `1` | `2`] = js.native
  var progress: js.UndefOr[integer] = js.native
  var requireInteraction: js.UndefOr[Boolean] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[
    ToStringLiteral[
      BASIC, 
      /* keyof chrome-apps.anon.BASIC */ typings.chromeApps.chromeAppsStrings.BASIC | IMAGE | LIST | PROGRESS, 
      Exclude[
        /* keyof chrome-apps.anon.BASIC */ typings.chromeApps.chromeAppsStrings.BASIC | IMAGE | LIST | PROGRESS, 
        basic_ | image_ | list_ | progress_
      ]
    ]
  ] = js.native
}

object PartialNotificationOption {
  @scala.inline
  def apply(): PartialNotificationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNotificationOption]
  }
  @scala.inline
  implicit class PartialNotificationOptionOps[Self <: PartialNotificationOption] (val x: Self) extends AnyVal {
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
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
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
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
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
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

