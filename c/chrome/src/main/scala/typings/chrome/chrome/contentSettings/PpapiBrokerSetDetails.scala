package typings.chrome.chrome.contentSettings

import typings.chrome.chromeStrings.allow
import typings.chrome.chromeStrings.ask
import typings.chrome.chromeStrings.block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PpapiBrokerSetDetails
  extends StObject
     with SetDetails {
  
  @JSName("setting")
  var setting_PpapiBrokerSetDetails: allow | block | ask
}
object PpapiBrokerSetDetails {
  
  inline def apply(primaryPattern: String, setting: allow | block | ask): PpapiBrokerSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[PpapiBrokerSetDetails]
  }
  
  extension [Self <: PpapiBrokerSetDetails](x: Self) {
    
    inline def setSetting(value: allow | block | ask): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
