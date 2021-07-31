package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemovePermissionResponse extends StObject {
  
  /**
    *  The JSON-formatted resource-based policy on the profiling group after the specified permissions were removed. 
    */
  var policy: String
  
  /**
    *  A universally unique identifier (UUID) for the revision of the resource-based policy after the specified permissions were removed. The updated JSON-formatted policy is in the policy element of the response. 
    */
  var revisionId: RevisionId
}
object RemovePermissionResponse {
  
  @scala.inline
  def apply(policy: String, revisionId: RevisionId): RemovePermissionResponse = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovePermissionResponse]
  }
  
  @scala.inline
  implicit class RemovePermissionResponseMutableBuilder[Self <: RemovePermissionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
  }
}
