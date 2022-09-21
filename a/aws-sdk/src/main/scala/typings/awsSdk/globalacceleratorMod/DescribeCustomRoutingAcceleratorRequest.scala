package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomRoutingAcceleratorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the accelerator to describe.
    */
  var AcceleratorArn: GenericString
}
object DescribeCustomRoutingAcceleratorRequest {
  
  inline def apply(AcceleratorArn: GenericString): DescribeCustomRoutingAcceleratorRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCustomRoutingAcceleratorRequest]
  }
  
  extension [Self <: DescribeCustomRoutingAcceleratorRequest](x: Self) {
    
    inline def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
  }
}
