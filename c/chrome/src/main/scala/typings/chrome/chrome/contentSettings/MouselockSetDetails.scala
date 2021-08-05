package typings.chrome.chrome.contentSettings

import typings.chrome.chromeStrings.allow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouselockSetDetails
  extends StObject
     with SetDetails {
  
  @JSName("setting")
  var setting_MouselockSetDetails: allow
}
object MouselockSetDetails {
  
  inline def apply(primaryPattern: String): MouselockSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = "allow")
    __obj.asInstanceOf[MouselockSetDetails]
  }
  
  extension [Self <: MouselockSetDetails](x: Self) {
    
    inline def setSetting(value: allow): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
