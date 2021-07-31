package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImscDestinationSettings extends StObject {
  
  /**
    * Keep this setting enabled to have MediaConvert use the font style and position information from the captions source in the output. This option is available only when your input captions are IMSC, SMPTE-TT, or TTML. Disable this setting for simplified output captions.
    */
  var StylePassthrough: js.UndefOr[ImscStylePassthrough] = js.undefined
}
object ImscDestinationSettings {
  
  @scala.inline
  def apply(): ImscDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImscDestinationSettings]
  }
  
  @scala.inline
  implicit class ImscDestinationSettingsMutableBuilder[Self <: ImscDestinationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStylePassthrough(value: ImscStylePassthrough): Self = StObject.set(x, "StylePassthrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylePassthroughUndefined: Self = StObject.set(x, "StylePassthrough", js.undefined)
  }
}
