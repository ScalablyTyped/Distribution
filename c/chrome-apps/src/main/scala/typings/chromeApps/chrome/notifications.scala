package typings.chromeApps.chrome

import typings.chromeApps.anon.BASIC
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion chrome.networking.*
// #region chrome.notifications
///////////////////
// Notifications //
///////////////////
/**
  * Use the chrome.notifications API to create rich notifications using
  * templates and show these notifications to users in the system tray.
  * @requires Permissions: 'notifications'
  * @since Chrome 28.
  * @see[Docs]{@link https://developer.chrome.com/extensions/notifications}
  */
object notifications {
  
  trait ButtonOptions extends StObject {
    
    var iconUrl: js.UndefOr[String] = js.undefined
    
    var title: String
  }
  object ButtonOptions {
    
    @scala.inline
    def apply(title: String): ButtonOptions = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonOptions]
    }
    
    @scala.inline
    implicit class ButtonOptionsMutableBuilder[Self <: ButtonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemOptions extends StObject {
    
    /** Additional details about this item. */
    var message: String
    
    /** Title of one item of a list notification. */
    var title: String
  }
  object ItemOptions {
    
    @scala.inline
    def apply(message: String, title: String): ItemOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemOptions]
    }
    
    @scala.inline
    implicit class ItemOptionsMutableBuilder[Self <: ItemOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotificationOptions extends StObject {
    
    /**
      * @deprecated since Chrome 59. The app icon mask is not visible for Mac OS X users.
      * A URL to the app icon mask. URLs have the same restrictions as iconUrl.
      * The app icon mask should be in alpha channel,
      * as only the alpha channel of the image will be considered.
      */
    var appIconMaskUrl: js.UndefOr[String] = js.undefined
    
    /** Text and icons for up to two notification action buttons. */
    var buttons: js.UndefOr[js.Array[ButtonOptions]] = js.undefined
    
    /**
      * Alternate notification content with a lower-weight font.
      * @since Chrome 31.
      */
    var contextMessage: js.UndefOr[String] = js.undefined
    
    /** A timestamp associated with the notification, in milliseconds past the epoch (e.g. Date.now() + n). */
    var eventTime: js.UndefOr[double] = js.undefined
    
    /**
      * Optional.
      * A URL to the sender's avatar, app icon, or a thumbnail for image notifications.
      * URLs can be a data URL, a blob URL, or a URL relative to a resource within this app's .crx file Required for notifications.create method.
      */
    var iconUrl: String
    
    /**
      * @deprecated Deprecated since Chrome 59. The image is not visible for Mac OS X users.
      * A URL to the image thumbnail for image-type notifications.
      * URLs have the same restrictions as iconUrl.
      */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated Deprecated since Chrome 67. This UI hint is ignored as of Chrome 67
      * @description Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
      */
    var isClickable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Items for multi-item notifications.
      * Items for multi-item notifications. Users on Mac OS X only see the first item.
      */
    var items: js.UndefOr[js.Array[ItemOptions]] = js.undefined
    
    /** Main notification content. Required for notifications.create method. */
    var message: String
    
    /**
      * Priority ranges from -2 to 2. -2 is lowest priority. 2 is highest.
      * On platforms that don't support a notification center (Windows, Linux & Mac),
      * -2 and -1 result in an error as notifications with those priorities will not be shown at all.
      * @default 0
      */
    var priority: js.UndefOr[`-2` | `-1` | `0` | `1` | `2`] = js.undefined
    
    /**
      * Current progress ranges from 0 to 100.
      * @since Chrome 30.
      */
    var progress: js.UndefOr[integer] = js.undefined
    
    /**
      * Indicates that the notification should remain visible
      * on screen until the user activates or dismisses the notification.
      * This defaults to false.
      * @since Chrome 50
      */
    var requireInteraction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @since Chrome 70.
      * @description Indicates that no sounds or vibrations should be made when the notification is being shown.
      * @default false
      */
    var silent: js.UndefOr[Boolean] = js.undefined
    
    /** Title of the notification (e.g. sender name for email). Required for notifications.create method. */
    var title: String
    
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
      ]
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
    implicit class NotificationOptionsMutableBuilder[Self <: NotificationOptions] (val x: Self) extends AnyVal {
      
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
    }
  }
}
