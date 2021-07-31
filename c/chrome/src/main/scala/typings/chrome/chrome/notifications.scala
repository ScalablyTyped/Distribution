package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Notifications
// https://developer.chrome.com/extensions/notifications
////////////////////
/**
  * Use the chrome.notifications API to create rich notifications using templates and show these notifications to users in the system tray.
  * Permissions:  "notifications"
  * @since Chrome 28.
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
  
  type NotificationButtonClickedEvent = Event[js.Function2[/* notificationId */ String, /* buttonIndex */ Double, Unit]]
  
  type NotificationClickedEvent = Event[js.Function1[/* notificationId */ String, Unit]]
  
  type NotificationClosedEvent = Event[js.Function2[/* notificationId */ String, /* byUser */ Boolean, Unit]]
  
  trait NotificationOptions extends StObject {
    
    /**
      * Optional.
      * A URL to the app icon mask. URLs have the same restrictions as iconUrl. The app icon mask should be in alpha channel, as only the alpha channel of the image will be considered.
      * @since Chrome 38.
      */
    var appIconMaskUrl: js.UndefOr[String] = js.undefined
    
    /** Optional. Text and icons for up to two notification action buttons. */
    var buttons: js.UndefOr[js.Array[ButtonOptions]] = js.undefined
    
    /**
      * Optional.
      * Alternate notification content with a lower-weight font.
      * @since Chrome 31.
      */
    var contextMessage: js.UndefOr[String] = js.undefined
    
    /** Optional. A timestamp associated with the notification, in milliseconds past the epoch (e.g. Date.now() + n). */
    var eventTime: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional.
      * A URL to the sender's avatar, app icon, or a thumbnail for image notifications.
      * URLs can be a data URL, a blob URL, or a URL relative to a resource within this extension's .crx file Required for notifications.create method.
      */
    var iconUrl: js.UndefOr[String] = js.undefined
    
    /** Optional. A URL to the image thumbnail for image-type notifications. URLs have the same restrictions as iconUrl. */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Optional.
      * Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
      * @since Chrome 32.
      */
    var isClickable: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. Items for multi-item notifications. */
    var items: js.UndefOr[js.Array[ItemOptions]] = js.undefined
    
    /** Optional. Main notification content. Required for notifications.create method. */
    var message: js.UndefOr[String] = js.undefined
    
    /** Optional. Priority ranges from -2 to 2. -2 is lowest priority. 2 is highest. Zero is default. */
    var priority: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional.
      * Current progress ranges from 0 to 100.
      * @since Chrome 30.
      */
    var progress: js.UndefOr[Double] = js.undefined
    
    /**
      * Indicates that the notification should remain visible on screen until the user activates or dismisses the notification.
      * This defaults to false.
      * @since Chrome 50
      */
    var requireInteraction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional.
      * Indicates that no sounds or vibrations should be made when the notification is being shown. This defaults to false.
      * @since Chrome 70
      */
    var silent: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. Title of the notification (e.g. sender name for email). Required for notifications.create method. */
    var title: js.UndefOr[String] = js.undefined
    
    /** Optional. Which type of notification to display. Required for notifications.create method. */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NotificationOptions {
    
    @scala.inline
    def apply(): NotificationOptions = {
      val __obj = js.Dynamic.literal()
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
      def setEventTime(value: Double): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
      
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
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
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
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type NotificationPermissionLevelChangedEvent = Event[js.Function1[/* level */ String, Unit]]
  
  type NotificationShowSettingsEvent = Event[js.Function0[Unit]]
}
