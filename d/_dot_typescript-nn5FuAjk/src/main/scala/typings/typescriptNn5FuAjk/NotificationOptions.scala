package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationOptions extends StObject {
  
  var actions: js.UndefOr[Array[NotificationAction]] = js.undefined
  
  var badge: js.UndefOr[java.lang.String] = js.undefined
  
  var body: js.UndefOr[java.lang.String] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var dir: js.UndefOr[NotificationDirection] = js.undefined
  
  var icon: js.UndefOr[java.lang.String] = js.undefined
  
  var image: js.UndefOr[java.lang.String] = js.undefined
  
  var lang: js.UndefOr[java.lang.String] = js.undefined
  
  var renotify: js.UndefOr[scala.Boolean] = js.undefined
  
  var requireInteraction: js.UndefOr[scala.Boolean] = js.undefined
  
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  
  var tag: js.UndefOr[java.lang.String] = js.undefined
  
  var timestamp: js.UndefOr[EpochTimeStamp] = js.undefined
  
  var vibrate: js.UndefOr[VibratePattern] = js.undefined
}
object NotificationOptions {
  
  inline def apply(): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationOptions]
  }
  
  extension [Self <: NotificationOptions](x: Self) {
    
    inline def setActions(value: Array[NotificationAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setBadge(value: java.lang.String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setBody(value: java.lang.String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDir(value: NotificationDirection): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setIcon(value: java.lang.String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setImage(value: java.lang.String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLang(value: java.lang.String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setRenotify(value: scala.Boolean): Self = StObject.set(x, "renotify", value.asInstanceOf[js.Any])
    
    inline def setRenotifyUndefined: Self = StObject.set(x, "renotify", js.undefined)
    
    inline def setRequireInteraction(value: scala.Boolean): Self = StObject.set(x, "requireInteraction", value.asInstanceOf[js.Any])
    
    inline def setRequireInteractionUndefined: Self = StObject.set(x, "requireInteraction", js.undefined)
    
    inline def setSilent(value: scala.Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setTag(value: java.lang.String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTimestamp(value: EpochTimeStamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setVibrate(value: VibratePattern): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
    
    inline def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
  }
}
