package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLifecyclePolicyResponse extends js.Object {
  
  /**
    * Detailed information about the lifecycle policy.
    */
  var Policy: js.UndefOr[LifecyclePolicy] = js.native
}
object GetLifecyclePolicyResponse {
  
  @scala.inline
  def apply(): GetLifecyclePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLifecyclePolicyResponse]
  }
  
  @scala.inline
  implicit class GetLifecyclePolicyResponseOps[Self <: GetLifecyclePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPolicy(value: LifecyclePolicy): Self = this.set("Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
  }
}
