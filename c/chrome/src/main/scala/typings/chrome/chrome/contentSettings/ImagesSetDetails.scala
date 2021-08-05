package typings.chrome.chrome.contentSettings

import typings.chrome.chromeStrings.allow
import typings.chrome.chromeStrings.block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagesSetDetails
  extends StObject
     with SetDetails {
  
  @JSName("setting")
  var setting_ImagesSetDetails: allow | block
}
object ImagesSetDetails {
  
  inline def apply(primaryPattern: String, setting: allow | block): ImagesSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagesSetDetails]
  }
  
  extension [Self <: ImagesSetDetails](x: Self) {
    
    inline def setSetting(value: allow | block): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
