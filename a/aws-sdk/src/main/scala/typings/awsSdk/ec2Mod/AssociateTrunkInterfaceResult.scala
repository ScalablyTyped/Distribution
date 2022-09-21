package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTrunkInterfaceResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the association between the trunk network interface and branch network interface.
    */
  var InterfaceAssociation: js.UndefOr[TrunkInterfaceAssociation] = js.undefined
}
object AssociateTrunkInterfaceResult {
  
  inline def apply(): AssociateTrunkInterfaceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateTrunkInterfaceResult]
  }
  
  extension [Self <: AssociateTrunkInterfaceResult](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setInterfaceAssociation(value: TrunkInterfaceAssociation): Self = StObject.set(x, "InterfaceAssociation", value.asInstanceOf[js.Any])
    
    inline def setInterfaceAssociationUndefined: Self = StObject.set(x, "InterfaceAssociation", js.undefined)
  }
}
