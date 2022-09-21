package typings.chrome.anon

import typings.chrome.chrome.notifications.TemplateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconUrl extends StObject {
  
  /**
    * A URL to the sender's avatar, app icon, or a thumbnail for image notifications.
    * URLs can be a data URL, a blob URL, or a URL relative to a resource within this extension's .crx file. Required for notifications.create method.
    */
  var iconUrl: String
  
  /** Main notification content. Required for notifications.create method. */
  var message: String
  
  /** Title of the notification (e.g. sender name for email). Required for notifications.create method. */
  var title: String
  
  /** Which type of notification to display. Required for notifications.create method. */
  var `type`: TemplateType
}
object IconUrl {
  
  inline def apply(iconUrl: String, message: String, title: String, `type`: TemplateType): IconUrl = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconUrl]
  }
  
  extension [Self <: IconUrl](x: Self) {
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: TemplateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
