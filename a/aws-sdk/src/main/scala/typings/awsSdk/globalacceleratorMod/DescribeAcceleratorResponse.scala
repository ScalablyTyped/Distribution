package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAcceleratorResponse extends StObject {
  
  /**
    * The description of the accelerator.
    */
  var Accelerator: js.UndefOr[typings.awsSdk.globalacceleratorMod.Accelerator] = js.undefined
}
object DescribeAcceleratorResponse {
  
  inline def apply(): DescribeAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAcceleratorResponse]
  }
  
  extension [Self <: DescribeAcceleratorResponse](x: Self) {
    
    inline def setAccelerator(value: Accelerator): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorUndefined: Self = StObject.set(x, "Accelerator", js.undefined)
  }
}
