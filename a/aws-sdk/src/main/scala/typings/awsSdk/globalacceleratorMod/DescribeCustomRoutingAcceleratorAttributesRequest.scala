package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomRoutingAcceleratorAttributesRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom routing accelerator to describe the attributes for.
    */
  var AcceleratorArn: GenericString
}
object DescribeCustomRoutingAcceleratorAttributesRequest {
  
  inline def apply(AcceleratorArn: GenericString): DescribeCustomRoutingAcceleratorAttributesRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCustomRoutingAcceleratorAttributesRequest]
  }
  
  extension [Self <: DescribeCustomRoutingAcceleratorAttributesRequest](x: Self) {
    
    inline def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
  }
}
