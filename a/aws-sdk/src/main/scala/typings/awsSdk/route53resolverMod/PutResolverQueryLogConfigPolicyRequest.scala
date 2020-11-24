package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutResolverQueryLogConfigPolicyRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the account that you want to share rules with.
    */
  var Arn: typings.awsSdk.route53resolverMod.Arn = js.native
  
  /**
    * An AWS Identity and Access Management policy statement that lists the query logging configurations that you want to share with another AWS account and the operations that you want the account to be able to perform. You can specify the following operations in the Actions section of the statement:    route53resolver:AssociateResolverQueryLogConfig     route53resolver:DisassociateResolverQueryLogConfig     route53resolver:ListResolverQueryLogConfigAssociations     route53resolver:ListResolverQueryLogConfigs    In the Resource section of the statement, you specify the ARNs for the query logging configurations that you want to share with the account that you specified in Arn. 
    */
  var ResolverQueryLogConfigPolicy: typings.awsSdk.route53resolverMod.ResolverQueryLogConfigPolicy = js.native
}
object PutResolverQueryLogConfigPolicyRequest {
  
  @scala.inline
  def apply(Arn: Arn, ResolverQueryLogConfigPolicy: ResolverQueryLogConfigPolicy): PutResolverQueryLogConfigPolicyRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], ResolverQueryLogConfigPolicy = ResolverQueryLogConfigPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResolverQueryLogConfigPolicyRequest]
  }
  
  @scala.inline
  implicit class PutResolverQueryLogConfigPolicyRequestOps[Self <: PutResolverQueryLogConfigPolicyRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setResolverQueryLogConfigPolicy(value: ResolverQueryLogConfigPolicy): Self = this.set("ResolverQueryLogConfigPolicy", value.asInstanceOf[js.Any])
  }
}
