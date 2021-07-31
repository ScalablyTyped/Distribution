package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverQueryLogConfigPolicyResponse extends StObject {
  
  /**
    * Information about the query logging policy for the query logging configuration that you specified in a GetResolverQueryLogConfigPolicy request.
    */
  var ResolverQueryLogConfigPolicy: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverQueryLogConfigPolicy] = js.undefined
}
object GetResolverQueryLogConfigPolicyResponse {
  
  @scala.inline
  def apply(): GetResolverQueryLogConfigPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverQueryLogConfigPolicyResponse]
  }
  
  @scala.inline
  implicit class GetResolverQueryLogConfigPolicyResponseMutableBuilder[Self <: GetResolverQueryLogConfigPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverQueryLogConfigPolicy(value: ResolverQueryLogConfigPolicy): Self = StObject.set(x, "ResolverQueryLogConfigPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverQueryLogConfigPolicyUndefined: Self = StObject.set(x, "ResolverQueryLogConfigPolicy", js.undefined)
  }
}
