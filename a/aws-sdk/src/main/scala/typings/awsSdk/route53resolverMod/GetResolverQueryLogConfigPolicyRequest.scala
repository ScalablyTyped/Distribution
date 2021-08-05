package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverQueryLogConfigPolicyRequest extends StObject {
  
  /**
    * The ARN of the query logging configuration that you want to get the query logging policy for.
    */
  var Arn: typings.awsSdk.route53resolverMod.Arn
}
object GetResolverQueryLogConfigPolicyRequest {
  
  inline def apply(Arn: Arn): GetResolverQueryLogConfigPolicyRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverQueryLogConfigPolicyRequest]
  }
  
  extension [Self <: GetResolverQueryLogConfigPolicyRequest](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
