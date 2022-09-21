package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomRoutingAcceleratorResponse extends StObject {
  
  /**
    * The description of the custom routing accelerator.
    */
  var Accelerator: js.UndefOr[CustomRoutingAccelerator] = js.undefined
}
object DescribeCustomRoutingAcceleratorResponse {
  
  inline def apply(): DescribeCustomRoutingAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomRoutingAcceleratorResponse]
  }
  
  extension [Self <: DescribeCustomRoutingAcceleratorResponse](x: Self) {
    
    inline def setAccelerator(value: CustomRoutingAccelerator): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorUndefined: Self = StObject.set(x, "Accelerator", js.undefined)
  }
}
