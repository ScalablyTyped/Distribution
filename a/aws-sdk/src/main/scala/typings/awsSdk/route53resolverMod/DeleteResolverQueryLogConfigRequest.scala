package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteResolverQueryLogConfigRequest extends StObject {
  
  /**
    * The ID of the query logging configuration that you want to delete.
    */
  var ResolverQueryLogConfigId: ResourceId = js.native
}
object DeleteResolverQueryLogConfigRequest {
  
  @scala.inline
  def apply(ResolverQueryLogConfigId: ResourceId): DeleteResolverQueryLogConfigRequest = {
    val __obj = js.Dynamic.literal(ResolverQueryLogConfigId = ResolverQueryLogConfigId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResolverQueryLogConfigRequest]
  }
  
  @scala.inline
  implicit class DeleteResolverQueryLogConfigRequestMutableBuilder[Self <: DeleteResolverQueryLogConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverQueryLogConfigId(value: ResourceId): Self = StObject.set(x, "ResolverQueryLogConfigId", value.asInstanceOf[js.Any])
  }
}
