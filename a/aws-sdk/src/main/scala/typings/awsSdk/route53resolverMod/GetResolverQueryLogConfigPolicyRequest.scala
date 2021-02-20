package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverQueryLogConfigPolicyRequest extends StObject {
  
  /**
    * The ARN of the query logging configuration that you want to get the query logging policy for.
    */
  var Arn: typings.awsSdk.route53resolverMod.Arn = js.native
}
object GetResolverQueryLogConfigPolicyRequest {
  
  @scala.inline
  def apply(Arn: Arn): GetResolverQueryLogConfigPolicyRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverQueryLogConfigPolicyRequest]
  }
  
  @scala.inline
  implicit class GetResolverQueryLogConfigPolicyRequestMutableBuilder[Self <: GetResolverQueryLogConfigPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
