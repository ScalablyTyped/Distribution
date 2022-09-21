package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateTransitGatewayPolicyTableRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the transit gateway attachment to disassociate from the policy table.
    */
  var TransitGatewayAttachmentId: typings.awsSdk.ec2Mod.TransitGatewayAttachmentId
  
  /**
    * The ID of the disassociated policy table.
    */
  var TransitGatewayPolicyTableId: typings.awsSdk.ec2Mod.TransitGatewayPolicyTableId
}
object DisassociateTransitGatewayPolicyTableRequest {
  
  inline def apply(
    TransitGatewayAttachmentId: TransitGatewayAttachmentId,
    TransitGatewayPolicyTableId: TransitGatewayPolicyTableId
  ): DisassociateTransitGatewayPolicyTableRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayAttachmentId = TransitGatewayAttachmentId.asInstanceOf[js.Any], TransitGatewayPolicyTableId = TransitGatewayPolicyTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTransitGatewayPolicyTableRequest]
  }
  
  extension [Self <: DisassociateTransitGatewayPolicyTableRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPolicyTableId(value: TransitGatewayPolicyTableId): Self = StObject.set(x, "TransitGatewayPolicyTableId", value.asInstanceOf[js.Any])
  }
}
