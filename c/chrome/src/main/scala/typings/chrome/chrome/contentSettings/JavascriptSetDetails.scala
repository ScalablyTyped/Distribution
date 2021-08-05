package typings.chrome.chrome.contentSettings

import typings.chrome.chromeStrings.allow
import typings.chrome.chromeStrings.block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JavascriptSetDetails
  extends StObject
     with SetDetails {
  
  @JSName("setting")
  var setting_JavascriptSetDetails: allow | block
}
object JavascriptSetDetails {
  
  inline def apply(primaryPattern: String, setting: allow | block): JavascriptSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[JavascriptSetDetails]
  }
  
  extension [Self <: JavascriptSetDetails](x: Self) {
    
    inline def setSetting(value: allow | block): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
