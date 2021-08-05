package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessorInfo extends StObject {
  
  /**
    * The architectures supported by the instance type.
    */
  var SupportedArchitectures: js.UndefOr[ArchitectureTypeList] = js.undefined
  
  /**
    * The speed of the processor, in GHz.
    */
  var SustainedClockSpeedInGhz: js.UndefOr[ProcessorSustainedClockSpeed] = js.undefined
}
object ProcessorInfo {
  
  inline def apply(): ProcessorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessorInfo]
  }
  
  extension [Self <: ProcessorInfo](x: Self) {
    
    inline def setSupportedArchitectures(value: ArchitectureTypeList): Self = StObject.set(x, "SupportedArchitectures", value.asInstanceOf[js.Any])
    
    inline def setSupportedArchitecturesUndefined: Self = StObject.set(x, "SupportedArchitectures", js.undefined)
    
    inline def setSupportedArchitecturesVarargs(value: ArchitectureType*): Self = StObject.set(x, "SupportedArchitectures", js.Array(value :_*))
    
    inline def setSustainedClockSpeedInGhz(value: ProcessorSustainedClockSpeed): Self = StObject.set(x, "SustainedClockSpeedInGhz", value.asInstanceOf[js.Any])
    
    inline def setSustainedClockSpeedInGhzUndefined: Self = StObject.set(x, "SustainedClockSpeedInGhz", js.undefined)
  }
}
