package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPolicyResponse extends StObject {
  
  /**
    * The JSON-formatted resource-based policy attached to the ProfilingGroup.
    */
  var policy: String
  
  /**
    * A unique identifier for the current revision of the returned policy.
    */
  var revisionId: RevisionId
}
object GetPolicyResponse {
  
  @scala.inline
  def apply(policy: String, revisionId: RevisionId): GetPolicyResponse = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyResponse]
  }
  
  @scala.inline
  implicit class GetPolicyResponseMutableBuilder[Self <: GetPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
  }
}
