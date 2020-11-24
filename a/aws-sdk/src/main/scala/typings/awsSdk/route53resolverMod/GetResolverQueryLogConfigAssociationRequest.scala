package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverQueryLogConfigAssociationRequest extends js.Object {
  
  /**
    * The ID of the Resolver query logging configuration association that you want to get information about.
    */
  var ResolverQueryLogConfigAssociationId: ResourceId = js.native
}
object GetResolverQueryLogConfigAssociationRequest {
  
  @scala.inline
  def apply(ResolverQueryLogConfigAssociationId: ResourceId): GetResolverQueryLogConfigAssociationRequest = {
    val __obj = js.Dynamic.literal(ResolverQueryLogConfigAssociationId = ResolverQueryLogConfigAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverQueryLogConfigAssociationRequest]
  }
  
  @scala.inline
  implicit class GetResolverQueryLogConfigAssociationRequestOps[Self <: GetResolverQueryLogConfigAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResolverQueryLogConfigAssociationId(value: ResourceId): Self = this.set("ResolverQueryLogConfigAssociationId", value.asInstanceOf[js.Any])
  }
}
