package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverQueryLogConfigPolicyResponse extends js.Object {
  
  /**
    * Information about the query logging policy for the query logging configuration that you specified in a GetResolverQueryLogConfigPolicy request.
    */
  var ResolverQueryLogConfigPolicy: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverQueryLogConfigPolicy] = js.native
}
object GetResolverQueryLogConfigPolicyResponse {
  
  @scala.inline
  def apply(): GetResolverQueryLogConfigPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverQueryLogConfigPolicyResponse]
  }
  
  @scala.inline
  implicit class GetResolverQueryLogConfigPolicyResponseOps[Self <: GetResolverQueryLogConfigPolicyResponse] (val x: Self) extends AnyVal {
    
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
    def setResolverQueryLogConfigPolicy(value: ResolverQueryLogConfigPolicy): Self = this.set("ResolverQueryLogConfigPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverQueryLogConfigPolicy: Self = this.set("ResolverQueryLogConfigPolicy", js.undefined)
  }
}
