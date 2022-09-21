package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VCpuCountRangeRequest extends StObject {
  
  /**
    * The maximum number of vCPUs. To specify no maximum limit, omit this parameter.
    */
  var Max: js.UndefOr[Integer] = js.undefined
  
  /**
    * The minimum number of vCPUs. To specify no minimum limit, specify 0.
    */
  var Min: Integer
}
object VCpuCountRangeRequest {
  
  inline def apply(Min: Integer): VCpuCountRangeRequest = {
    val __obj = js.Dynamic.literal(Min = Min.asInstanceOf[js.Any])
    __obj.asInstanceOf[VCpuCountRangeRequest]
  }
  
  extension [Self <: VCpuCountRangeRequest](x: Self) {
    
    inline def setMax(value: Integer): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: Integer): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
  }
}
