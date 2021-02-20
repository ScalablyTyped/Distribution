package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutResourcePolicyResponse extends StObject {
  
  /**
    * The resource-based policy.
    */
  var Policy: js.UndefOr[string] = js.native
  
  /**
    * The revision ID of the policy.
    */
  var RevisionId: js.UndefOr[string] = js.native
}
object PutResourcePolicyResponse {
  
  @scala.inline
  def apply(): PutResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePolicyResponse]
  }
  
  @scala.inline
  implicit class PutResourcePolicyResponseMutableBuilder[Self <: PutResourcePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: string): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    @scala.inline
    def setRevisionId(value: string): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
  }
}
