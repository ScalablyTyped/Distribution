package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomRoutingListenerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the accelerator for a custom routing listener.
    */
  var AcceleratorArn: GenericString
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the request.
    */
  var IdempotencyToken: typings.awsSdk.globalacceleratorMod.IdempotencyToken
  
  /**
    * The port range to support for connections from clients to your accelerator. Separately, you set port ranges for endpoints. For more information, see About endpoints for custom routing accelerators.
    */
  var PortRanges: typings.awsSdk.globalacceleratorMod.PortRanges
}
object CreateCustomRoutingListenerRequest {
  
  inline def apply(AcceleratorArn: GenericString, IdempotencyToken: IdempotencyToken, PortRanges: PortRanges): CreateCustomRoutingListenerRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any], IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], PortRanges = PortRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomRoutingListenerRequest]
  }
  
  extension [Self <: CreateCustomRoutingListenerRequest](x: Self) {
    
    inline def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setPortRanges(value: PortRanges): Self = StObject.set(x, "PortRanges", value.asInstanceOf[js.Any])
    
    inline def setPortRangesVarargs(value: PortRange*): Self = StObject.set(x, "PortRanges", js.Array(value*))
  }
}
