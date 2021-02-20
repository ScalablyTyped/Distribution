package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverRuleRequest extends StObject {
  
  /**
    * The ID of the Resolver rule that you want to get information about.
    */
  var ResolverRuleId: ResourceId = js.native
}
object GetResolverRuleRequest {
  
  @scala.inline
  def apply(ResolverRuleId: ResourceId): GetResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRuleRequest]
  }
  
  @scala.inline
  implicit class GetResolverRuleRequestMutableBuilder[Self <: GetResolverRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverRuleId(value: ResourceId): Self = StObject.set(x, "ResolverRuleId", value.asInstanceOf[js.Any])
  }
}
