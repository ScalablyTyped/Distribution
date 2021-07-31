package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResolverRuleResponse extends StObject {
  
  /**
    * Information about the DeleteResolverRule request, including the status of the request.
    */
  var ResolverRule: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverRule] = js.undefined
}
object DeleteResolverRuleResponse {
  
  @scala.inline
  def apply(): DeleteResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResolverRuleResponse]
  }
  
  @scala.inline
  implicit class DeleteResolverRuleResponseMutableBuilder[Self <: DeleteResolverRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverRule(value: ResolverRule): Self = StObject.set(x, "ResolverRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverRuleUndefined: Self = StObject.set(x, "ResolverRule", js.undefined)
  }
}
