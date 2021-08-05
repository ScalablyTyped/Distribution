package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputLossFailoverSettings extends StObject {
  
  /**
    * The amount of time (in milliseconds) that no input is detected. After that time, an input failover will occur.
    */
  var InputLossThresholdMsec: js.UndefOr[integerMin100] = js.undefined
}
object InputLossFailoverSettings {
  
  inline def apply(): InputLossFailoverSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputLossFailoverSettings]
  }
  
  extension [Self <: InputLossFailoverSettings](x: Self) {
    
    inline def setInputLossThresholdMsec(value: integerMin100): Self = StObject.set(x, "InputLossThresholdMsec", value.asInstanceOf[js.Any])
    
    inline def setInputLossThresholdMsecUndefined: Self = StObject.set(x, "InputLossThresholdMsec", js.undefined)
  }
}
