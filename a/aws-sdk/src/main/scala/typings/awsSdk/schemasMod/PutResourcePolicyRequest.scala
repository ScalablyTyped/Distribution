package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyRequest extends StObject {
  
  /**
    * The resource-based policy.
    */
  var Policy: string
  
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[string] = js.undefined
  
  /**
    * The revision ID of the policy.
    */
  var RevisionId: js.UndefOr[string] = js.undefined
}
object PutResourcePolicyRequest {
  
  inline def apply(Policy: string): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  
  extension [Self <: PutResourcePolicyRequest](x: Self) {
    
    inline def setPolicy(value: string): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    inline def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    inline def setRevisionId(value: string): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
  }
}
