package typings.awsSdk.migrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyRequest extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the resource associated with the policy. 
    */
  var Identifier: ResourcePolicyIdentifier
}
object DeleteResourcePolicyRequest {
  
  inline def apply(Identifier: ResourcePolicyIdentifier): DeleteResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePolicyRequest]
  }
  
  extension [Self <: DeleteResourcePolicyRequest](x: Self) {
    
    inline def setIdentifier(value: ResourcePolicyIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
