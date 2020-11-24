package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccessPolicyRequest extends js.Object {
  
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
  implicit class DescribeAccessPolicyRequestOps[Self <: DescribeAccessPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessPolicyId(value: ID): Self = this.set("accessPolicyId", value.asInstanceOf[js.Any])
  }
}
