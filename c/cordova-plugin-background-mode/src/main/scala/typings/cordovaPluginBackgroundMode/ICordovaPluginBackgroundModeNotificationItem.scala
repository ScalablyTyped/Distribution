package typings.cordovaPluginBackgroundMode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICordovaPluginBackgroundModeNotificationItem extends StObject {
  
  /**
    * Handles if app is coming to foreground when tapping on the notification
    */
  var resume: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Handles if there is a notification when background is activated
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The body of the notification displayed in background mode
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The ticker of the notification displayed in background mode
    */
  var ticker: js.UndefOr[String] = js.undefined
  
  /**
    * The title of the notification displayed in background mode
    */
  var title: js.UndefOr[String] = js.undefined
}
object ICordovaPluginBackgroundModeNotificationItem {
  
  @scala.inline
  def apply(): ICordovaPluginBackgroundModeNotificationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICordovaPluginBackgroundModeNotificationItem]
  }
  
  @scala.inline
  implicit class ICordovaPluginBackgroundModeNotificationItemMutableBuilder[Self <: ICordovaPluginBackgroundModeNotificationItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResume(value: Boolean): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumeUndefined: Self = StObject.set(x, "resume", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTicker(value: String): Self = StObject.set(x, "ticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickerUndefined: Self = StObject.set(x, "ticker", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
