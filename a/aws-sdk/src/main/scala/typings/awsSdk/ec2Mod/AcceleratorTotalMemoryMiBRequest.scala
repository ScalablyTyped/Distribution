package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceleratorTotalMemoryMiBRequest extends StObject {
  
  /**
    * The maximum amount of accelerator memory, in MiB. To specify no maximum limit, omit this parameter.
    */
  var Max: js.UndefOr[Integer] = js.undefined
  
  /**
    * The minimum amount of accelerator memory, in MiB. To specify no minimum limit, omit this parameter.
    */
  var Min: js.UndefOr[Integer] = js.undefined
}
object AcceleratorTotalMemoryMiBRequest {
  
  inline def apply(): AcceleratorTotalMemoryMiBRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorTotalMemoryMiBRequest]
  }
  
  extension [Self <: AcceleratorTotalMemoryMiBRequest](x: Self) {
    
    inline def setMax(value: Integer): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: Integer): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
