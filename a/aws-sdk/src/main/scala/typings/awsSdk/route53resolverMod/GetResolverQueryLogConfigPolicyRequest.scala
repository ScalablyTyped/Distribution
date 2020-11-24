package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverQueryLogConfigPolicyRequest extends js.Object {
  
  /**
    * The ARN of the query logging configuration that you want to get the query logging policy for.
    */
  var Arn: typings.awsSdk.route53resolverMod.Arn = js.native
}
object GetResolverQueryLogConfigPolicyRequest {
  
  @scala.inline
  def apply(Arn: Arn): GetResolverQueryLogConfigPolicyRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverQueryLogConfigPolicyRequest]
  }
  
  @scala.inline
  implicit class GetResolverQueryLogConfigPolicyRequestOps[Self <: GetResolverQueryLogConfigPolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
  }
}
