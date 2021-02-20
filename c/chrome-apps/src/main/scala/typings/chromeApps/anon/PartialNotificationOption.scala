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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chrome-apps.chrome.notifications.NotificationOptions> */
@js.native
trait PartialNotificationOption extends StObject {
  
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
  implicit class PartialNotificationOptionMutableBuilder[Self <: PartialNotificationOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppIconMaskUrl(value: String): Self = StObject.set(x, "appIconMaskUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIconMaskUrlUndefined: Self = StObject.set(x, "appIconMaskUrl", js.undefined)
    
    @scala.inline
    def setButtons(value: js.Array[ButtonOptions]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: ButtonOptions*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setContextMessage(value: String): Self = StObject.set(x, "contextMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextMessageUndefined: Self = StObject.set(x, "contextMessage", js.undefined)
    
    @scala.inline
    def setEventTime(value: double): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setIsClickable(value: Boolean): Self = StObject.set(x, "isClickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClickableUndefined: Self = StObject.set(x, "isClickable", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[ItemOptions]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ItemOptions*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setPriority(value: `-2` | `-1` | `0` | `1` | `2`): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setProgress(value: integer): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setRequireInteraction(value: Boolean): Self = StObject.set(x, "requireInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireInteractionUndefined: Self = StObject.set(x, "requireInteraction", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
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
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
