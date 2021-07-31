package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPolicyResponse extends StObject {
  
  /**
    * The resource-based policy.
    */
  var Policy: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier for the current revision of the policy.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
}
object GetPolicyResponse {
  
  @scala.inline
  def apply(): GetPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPolicyResponse]
  }
  
  @scala.inline
  implicit class GetPolicyResponseMutableBuilder[Self <: GetPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
  }
}
