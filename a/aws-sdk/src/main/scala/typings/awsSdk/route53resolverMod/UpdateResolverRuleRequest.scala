package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateResolverRuleRequest extends StObject {
  
  /**
    * The new settings for the Resolver rule.
    */
  var Config: ResolverRuleConfig = js.native
  
  /**
    * The ID of the Resolver rule that you want to update.
    */
  var ResolverRuleId: ResourceId = js.native
}
object UpdateResolverRuleRequest {
  
  @scala.inline
  def apply(Config: ResolverRuleConfig, ResolverRuleId: ResourceId): UpdateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(Config = Config.asInstanceOf[js.Any], ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResolverRuleRequest]
  }
  
  @scala.inline
  implicit class UpdateResolverRuleRequestMutableBuilder[Self <: UpdateResolverRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: ResolverRuleConfig): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverRuleId(value: ResourceId): Self = StObject.set(x, "ResolverRuleId", value.asInstanceOf[js.Any])
  }
}
