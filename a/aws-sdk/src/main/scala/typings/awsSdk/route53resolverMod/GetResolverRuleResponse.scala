package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverRuleResponse extends js.Object {
  
  /**
    * Information about the Resolver rule that you specified in a GetResolverRule request.
    */
  var ResolverRule: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverRule] = js.native
}
object GetResolverRuleResponse {
  
  @scala.inline
  def apply(): GetResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverRuleResponse]
  }
  
  @scala.inline
  implicit class GetResolverRuleResponseOps[Self <: GetResolverRuleResponse] (val x: Self) extends AnyVal {
    
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
    def setResolverRule(value: ResolverRule): Self = this.set("ResolverRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverRule: Self = this.set("ResolverRule", js.undefined)
  }
}
