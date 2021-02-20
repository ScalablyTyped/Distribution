package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutResourcePolicyResponse extends StObject {
  
  /**
    * The new policy.
    */
  var resourcePolicy: js.UndefOr[ResourcePolicy] = js.native
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
    def setResourcePolicy(value: ResourcePolicy): Self = StObject.set(x, "resourcePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePolicyUndefined: Self = StObject.set(x, "resourcePolicy", js.undefined)
  }
}
