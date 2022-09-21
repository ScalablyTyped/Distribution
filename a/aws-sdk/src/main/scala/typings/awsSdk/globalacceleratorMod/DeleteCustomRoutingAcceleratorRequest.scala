package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomRoutingAcceleratorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom routing accelerator to delete.
    */
  var AcceleratorArn: GenericString
}
object DeleteCustomRoutingAcceleratorRequest {
  
  inline def apply(AcceleratorArn: GenericString): DeleteCustomRoutingAcceleratorRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomRoutingAcceleratorRequest]
  }
  
  extension [Self <: DeleteCustomRoutingAcceleratorRequest](x: Self) {
    
    inline def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
  }
}
