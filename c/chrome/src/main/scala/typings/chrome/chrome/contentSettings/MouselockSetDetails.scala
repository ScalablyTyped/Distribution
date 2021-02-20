package typings.chrome.chrome.contentSettings

import typings.chrome.chromeStrings.allow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouselockSetDetails extends SetDetails {
  
  @JSName("setting")
  var setting_MouselockSetDetails: allow = js.native
}
object MouselockSetDetails {
  
  @scala.inline
  def apply(primaryPattern: String, setting: allow): MouselockSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouselockSetDetails]
  }
  
  @scala.inline
  implicit class MouselockSetDetailsMutableBuilder[Self <: MouselockSetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetting(value: allow): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
