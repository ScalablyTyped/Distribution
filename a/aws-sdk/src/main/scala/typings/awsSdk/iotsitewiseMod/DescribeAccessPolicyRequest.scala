package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccessPolicyRequest extends StObject {
  
  /**
    * The ID of the access policy.
    */
  var accessPolicyId: ID = js.native
}
object DescribeAccessPolicyRequest {
  
  @scala.inline
  def apply(accessPolicyId: ID): DescribeAccessPolicyRequest = {
    val __obj = js.Dynamic.literal(accessPolicyId = accessPolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccessPolicyRequest]
  }
  
  @scala.inline
  implicit class DescribeAccessPolicyRequestMutableBuilder[Self <: DescribeAccessPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPolicyId(value: ID): Self = StObject.set(x, "accessPolicyId", value.asInstanceOf[js.Any])
  }
}
