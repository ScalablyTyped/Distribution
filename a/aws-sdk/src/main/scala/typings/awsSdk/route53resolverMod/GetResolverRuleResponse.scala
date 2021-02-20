package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverRuleResponse extends StObject {
  
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
  implicit class GetResolverRuleResponseMutableBuilder[Self <: GetResolverRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverRule(value: ResolverRule): Self = StObject.set(x, "ResolverRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverRuleUndefined: Self = StObject.set(x, "ResolverRule", js.undefined)
  }
}
