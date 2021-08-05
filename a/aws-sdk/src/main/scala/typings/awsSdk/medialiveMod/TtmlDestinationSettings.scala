package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TtmlDestinationSettings extends StObject {
  
  /**
    * When set to passthrough, passes through style and position information from a TTML-like input source (TTML, SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
    */
  var StyleControl: js.UndefOr[TtmlDestinationStyleControl] = js.undefined
}
object TtmlDestinationSettings {
  
  inline def apply(): TtmlDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TtmlDestinationSettings]
  }
  
  extension [Self <: TtmlDestinationSettings](x: Self) {
    
    inline def setStyleControl(value: TtmlDestinationStyleControl): Self = StObject.set(x, "StyleControl", value.asInstanceOf[js.Any])
    
    inline def setStyleControlUndefined: Self = StObject.set(x, "StyleControl", js.undefined)
  }
}
