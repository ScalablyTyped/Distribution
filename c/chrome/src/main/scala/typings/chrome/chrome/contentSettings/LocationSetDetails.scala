package typings.chrome.chrome.contentSettings

import typings.chrome.chromeStrings.allow
import typings.chrome.chromeStrings.ask
import typings.chrome.chromeStrings.block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationSetDetails
  extends StObject
     with SetDetails {
  
  @JSName("setting")
  var setting_LocationSetDetails: allow | block | ask
}
object LocationSetDetails {
  
  @scala.inline
  def apply(primaryPattern: String, setting: allow | block | ask): LocationSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationSetDetails]
  }
  
  @scala.inline
  implicit class LocationSetDetailsMutableBuilder[Self <: LocationSetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetting(value: allow | block | ask): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
