package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutPermissionResponse extends StObject {
  
  /**
    *  The JSON-formatted resource-based policy on the profiling group that includes the added permissions. 
    */
  var policy: String = js.native
  
  /**
    *  A universally unique identifier (UUID) for the revision of the resource-based policy that includes the added permissions. The JSON-formatted policy is in the policy element of the response. 
    */
  var revisionId: RevisionId = js.native
}
object PutPermissionResponse {
  
  @scala.inline
  def apply(policy: String, revisionId: RevisionId): PutPermissionResponse = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPermissionResponse]
  }
  
  @scala.inline
  implicit class PutPermissionResponseMutableBuilder[Self <: PutPermissionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
  }
}
