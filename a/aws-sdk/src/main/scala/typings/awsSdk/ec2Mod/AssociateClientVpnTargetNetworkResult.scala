package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateClientVpnTargetNetworkResult extends StObject {
  
  /**
    * The unique ID of the target network association.
    */
  var AssociationId: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the target network association.
    */
  var Status: js.UndefOr[AssociationStatus] = js.undefined
}
object AssociateClientVpnTargetNetworkResult {
  
  inline def apply(): AssociateClientVpnTargetNetworkResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateClientVpnTargetNetworkResult]
  }
  
  extension [Self <: AssociateClientVpnTargetNetworkResult](x: Self) {
    
    inline def setAssociationId(value: String): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setStatus(value: AssociationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
