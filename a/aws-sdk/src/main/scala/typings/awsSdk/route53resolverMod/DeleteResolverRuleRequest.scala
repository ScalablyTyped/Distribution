package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResolverRuleRequest extends StObject {
  
  /**
    * The ID of the Resolver rule that you want to delete.
    */
  var ResolverRuleId: ResourceId
}
object DeleteResolverRuleRequest {
  
  inline def apply(ResolverRuleId: ResourceId): DeleteResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResolverRuleRequest]
  }
  
  extension [Self <: DeleteResolverRuleRequest](x: Self) {
    
    inline def setResolverRuleId(value: ResourceId): Self = StObject.set(x, "ResolverRuleId", value.asInstanceOf[js.Any])
  }
}
