package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketPolicyStatusOutput extends js.Object {
  
  /**
    * The policy status for the specified bucket.
    */
  var PolicyStatus: js.UndefOr[typings.awsSdk.s3Mod.PolicyStatus] = js.native
}
object GetBucketPolicyStatusOutput {
  
  @scala.inline
  def apply(): GetBucketPolicyStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketPolicyStatusOutput]
  }
  
  @scala.inline
  implicit class GetBucketPolicyStatusOutputOps[Self <: GetBucketPolicyStatusOutput] (val x: Self) extends AnyVal {
    
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
    def setPolicyStatus(value: PolicyStatus): Self = this.set("PolicyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyStatus: Self = this.set("PolicyStatus", js.undefined)
  }
}
