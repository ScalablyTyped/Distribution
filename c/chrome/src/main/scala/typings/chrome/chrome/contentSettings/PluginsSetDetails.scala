package typings.chrome.chrome.contentSettings

import typings.chrome.chromeStrings.allow
import typings.chrome.chromeStrings.block
import typings.chrome.chromeStrings.detect_important_content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginsSetDetails
  extends StObject
     with SetDetails {
  
  @JSName("setting")
  var setting_PluginsSetDetails: allow | block | detect_important_content
}
object PluginsSetDetails {
  
  @scala.inline
  def apply(primaryPattern: String, setting: allow | block | detect_important_content): PluginsSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginsSetDetails]
  }
  
  @scala.inline
  implicit class PluginsSetDetailsMutableBuilder[Self <: PluginsSetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetting(value: allow | block | detect_important_content): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
