package typings.chrome.chrome.contentSettings

import typings.chrome.chromeStrings.allow
import typings.chrome.chromeStrings.block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagesSetDetails extends SetDetails {
  
  @JSName("setting")
  var setting_ImagesSetDetails: allow | block = js.native
}
object ImagesSetDetails {
  
  @scala.inline
  def apply(primaryPattern: String, setting: allow | block): ImagesSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagesSetDetails]
  }
  
  @scala.inline
  implicit class ImagesSetDetailsMutableBuilder[Self <: ImagesSetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetting(value: allow | block): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
