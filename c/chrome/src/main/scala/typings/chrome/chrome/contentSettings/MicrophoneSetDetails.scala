package typings.chrome.chrome.contentSettings

import typings.chrome.chromeStrings.allow
import typings.chrome.chromeStrings.ask
import typings.chrome.chromeStrings.block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MicrophoneSetDetails extends SetDetails {
  
  @JSName("setting")
  var setting_MicrophoneSetDetails: allow | block | ask = js.native
}
object MicrophoneSetDetails {
  
  @scala.inline
  def apply(primaryPattern: String, setting: allow | block | ask): MicrophoneSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicrophoneSetDetails]
  }
  
  @scala.inline
  implicit class MicrophoneSetDetailsMutableBuilder[Self <: MicrophoneSetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetting(value: allow | block | ask): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
