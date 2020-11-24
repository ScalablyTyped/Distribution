package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketPolicyResult extends js.Object {
  
  /**
    * The policy of the Outposts bucket.
    */
  var Policy: js.UndefOr[typings.awsSdk.s3controlMod.Policy] = js.native
}
object GetBucketPolicyResult {
  
  @scala.inline
  def apply(): GetBucketPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketPolicyResult]
  }
  
  @scala.inline
  implicit class GetBucketPolicyResultOps[Self <: GetBucketPolicyResult] (val x: Self) extends AnyVal {
    
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
    def setPolicy(value: Policy): Self = this.set("Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
  }
}
