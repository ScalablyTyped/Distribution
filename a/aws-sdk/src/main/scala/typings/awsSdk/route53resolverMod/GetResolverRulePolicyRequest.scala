package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverRulePolicyRequest extends StObject {
  
  /**
    * The ID of the Resolver rule policy that you want to get information about.
    */
  var Arn: typings.awsSdk.route53resolverMod.Arn = js.native
}
object GetResolverRulePolicyRequest {
  
  @scala.inline
  def apply(Arn: Arn): GetResolverRulePolicyRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRulePolicyRequest]
  }
  
  @scala.inline
  implicit class GetResolverRulePolicyRequestMutableBuilder[Self <: GetResolverRulePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
