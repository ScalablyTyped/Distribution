package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TtmlDestinationSettings extends StObject {
  
  /**
    * Pass through style and position information from a TTML-like input source (TTML, SMPTE-TT) to the TTML output.
    */
  var StylePassthrough: js.UndefOr[TtmlStylePassthrough] = js.undefined
}
object TtmlDestinationSettings {
  
  @scala.inline
  def apply(): TtmlDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TtmlDestinationSettings]
  }
  
  @scala.inline
  implicit class TtmlDestinationSettingsMutableBuilder[Self <: TtmlDestinationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStylePassthrough(value: TtmlStylePassthrough): Self = StObject.set(x, "StylePassthrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylePassthroughUndefined: Self = StObject.set(x, "StylePassthrough", js.undefined)
  }
}
