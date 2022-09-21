package typings.chrome.anon

import typings.chrome.chrome.notifications.ButtonOptions
import typings.chrome.chrome.notifications.ItemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppIconMaskUrl extends StObject {
  
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
}
object AppIconMaskUrl {
  
  inline def apply(): AppIconMaskUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppIconMaskUrl]
  }
  
  extension [Self <: AppIconMaskUrl](x: Self) {
    
    inline def setAppIconMaskUrl(value: String): Self = StObject.set(x, "appIconMaskUrl", value.asInstanceOf[js.Any])
    
    inline def setAppIconMaskUrlUndefined: Self = StObject.set(x, "appIconMaskUrl", js.undefined)
    
    inline def setButtons(value: js.Array[ButtonOptions]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: ButtonOptions*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setContextMessage(value: String): Self = StObject.set(x, "contextMessage", value.asInstanceOf[js.Any])
    
    inline def setContextMessageUndefined: Self = StObject.set(x, "contextMessage", js.undefined)
    
    inline def setEventTime(value: Double): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setIsClickable(value: Boolean): Self = StObject.set(x, "isClickable", value.asInstanceOf[js.Any])
    
    inline def setIsClickableUndefined: Self = StObject.set(x, "isClickable", js.undefined)
    
    inline def setItems(value: js.Array[ItemOptions]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ItemOptions*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRequireInteraction(value: Boolean): Self = StObject.set(x, "requireInteraction", value.asInstanceOf[js.Any])
    
    inline def setRequireInteractionUndefined: Self = StObject.set(x, "requireInteraction", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
