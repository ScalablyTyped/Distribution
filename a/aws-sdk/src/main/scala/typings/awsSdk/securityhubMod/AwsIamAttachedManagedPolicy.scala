package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamAttachedManagedPolicy extends js.Object {
  
  /**
    * The ARN of the policy.
    */
  var PolicyArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[NonEmptyString] = js.native
}
object AwsIamAttachedManagedPolicy {
  
  @scala.inline
  def apply(): AwsIamAttachedManagedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamAttachedManagedPolicy]
  }
  
  @scala.inline
  implicit class AwsIamAttachedManagedPolicyOps[Self <: AwsIamAttachedManagedPolicy] (val x: Self) extends AnyVal {
    
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
    def setPolicyArn(value: NonEmptyString): Self = this.set("PolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyArn: Self = this.set("PolicyArn", js.undefined)
    
    @scala.inline
    def setPolicyName(value: NonEmptyString): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyName: Self = this.set("PolicyName", js.undefined)
  }
}
