package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailSuppression extends StObject {
  
  /**
    * Sets the mode for avail suppression, also known as ad suppression. By default, ad suppression is off and all ad breaks are filled by MediaTailor with ads or slate.
    */
  var Mode: js.UndefOr[typings.awsSdk.mediatailorMod.Mode] = js.undefined
  
  /**
    * The avail suppression value is a live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or behind this time in the manifest lookback window. 
    */
  var Value: js.UndefOr[string] = js.undefined
}
object AvailSuppression {
  
  inline def apply(): AvailSuppression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailSuppression]
  }
  
  extension [Self <: AvailSuppression](x: Self) {
    
    inline def setMode(value: Mode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setValue(value: string): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
