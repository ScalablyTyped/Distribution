package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromoteResourceShareCreatedFromPolicyRequest extends StObject {
  
  /**
    * The ARN of the resource share to promote.
    */
  var resourceShareArn: String = js.native
}
object PromoteResourceShareCreatedFromPolicyRequest {
  
  @scala.inline
  def apply(resourceShareArn: String): PromoteResourceShareCreatedFromPolicyRequest = {
    val __obj = js.Dynamic.literal(resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromoteResourceShareCreatedFromPolicyRequest]
  }
  
  @scala.inline
  implicit class PromoteResourceShareCreatedFromPolicyRequestMutableBuilder[Self <: PromoteResourceShareCreatedFromPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
  }
}
