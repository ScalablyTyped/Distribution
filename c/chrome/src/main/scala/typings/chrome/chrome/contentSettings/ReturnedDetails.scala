package typings.chrome.chrome.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnedDetails extends StObject {
  
  /** The content setting. See the description of the individual ContentSetting objects for the possible values. */
  var setting: DefaultContentSettingDetails
}
object ReturnedDetails {
  
  inline def apply(setting: DefaultContentSettingDetails): ReturnedDetails = {
    val __obj = js.Dynamic.literal(setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnedDetails]
  }
  
  extension [Self <: ReturnedDetails](x: Self) {
    
    inline def setSetting(value: DefaultContentSettingDetails): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
