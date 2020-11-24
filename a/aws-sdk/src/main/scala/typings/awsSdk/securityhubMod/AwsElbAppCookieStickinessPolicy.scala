package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbAppCookieStickinessPolicy extends js.Object {
  
  /**
    * The name of the application cookie used for stickiness.
    */
  var CookieName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The mnemonic name for the policy being created. The name must be unique within the set of policies for the load balancer.
    */
  var PolicyName: js.UndefOr[NonEmptyString] = js.native
}
object AwsElbAppCookieStickinessPolicy {
  
  @scala.inline
  def apply(): AwsElbAppCookieStickinessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbAppCookieStickinessPolicy]
  }
  
  @scala.inline
  implicit class AwsElbAppCookieStickinessPolicyOps[Self <: AwsElbAppCookieStickinessPolicy] (val x: Self) extends AnyVal {
    
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
    def setCookieName(value: NonEmptyString): Self = this.set("CookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieName: Self = this.set("CookieName", js.undefined)
    
    @scala.inline
    def setPolicyName(value: NonEmptyString): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyName: Self = this.set("PolicyName", js.undefined)
  }
}
