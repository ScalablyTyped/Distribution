package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateResolverRuleResponse extends StObject {
  
  /**
    * The response to an UpdateResolverRule request.
    */
  var ResolverRule: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverRule] = js.native
}
object UpdateResolverRuleResponse {
  
  @scala.inline
  def apply(): UpdateResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResolverRuleResponse]
  }
  
  @scala.inline
  implicit class UpdateResolverRuleResponseMutableBuilder[Self <: UpdateResolverRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverRule(value: ResolverRule): Self = StObject.set(x, "ResolverRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverRuleUndefined: Self = StObject.set(x, "ResolverRule", js.undefined)
  }
}
