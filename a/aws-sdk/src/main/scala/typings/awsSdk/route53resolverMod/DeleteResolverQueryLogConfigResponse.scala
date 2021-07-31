package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResolverQueryLogConfigResponse extends StObject {
  
  /**
    * Information about the query logging configuration that you deleted, including the status of the request.
    */
  var ResolverQueryLogConfig: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverQueryLogConfig] = js.undefined
}
object DeleteResolverQueryLogConfigResponse {
  
  @scala.inline
  def apply(): DeleteResolverQueryLogConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResolverQueryLogConfigResponse]
  }
  
  @scala.inline
  implicit class DeleteResolverQueryLogConfigResponseMutableBuilder[Self <: DeleteResolverQueryLogConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverQueryLogConfig(value: ResolverQueryLogConfig): Self = StObject.set(x, "ResolverQueryLogConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverQueryLogConfigUndefined: Self = StObject.set(x, "ResolverQueryLogConfig", js.undefined)
  }
}
