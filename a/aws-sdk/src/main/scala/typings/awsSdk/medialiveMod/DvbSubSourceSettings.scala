package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DvbSubSourceSettings extends StObject {
  
  /**
    * When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source content. Unused for DVB-Sub passthrough. All DVB-Sub content is passed through, regardless of selectors.
    */
  var Pid: js.UndefOr[integerMin1] = js.undefined
}
object DvbSubSourceSettings {
  
  inline def apply(): DvbSubSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvbSubSourceSettings]
  }
  
  extension [Self <: DvbSubSourceSettings](x: Self) {
    
    inline def setPid(value: integerMin1): Self = StObject.set(x, "Pid", value.asInstanceOf[js.Any])
    
    inline def setPidUndefined: Self = StObject.set(x, "Pid", js.undefined)
  }
}
