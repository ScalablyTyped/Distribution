package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPermissionResponse extends StObject {
  
  /**
    *  The JSON-formatted resource-based policy on the profiling group that includes the added permissions. 
    */
  var policy: String
  
  /**
    *  A universally unique identifier (UUID) for the revision of the resource-based policy that includes the added permissions. The JSON-formatted policy is in the policy element of the response. 
    */
  var revisionId: RevisionId
}
object PutPermissionResponse {
  
  inline def apply(policy: String, revisionId: RevisionId): PutPermissionResponse = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPermissionResponse]
  }
  
  extension [Self <: PutPermissionResponse](x: Self) {
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
  }
}
