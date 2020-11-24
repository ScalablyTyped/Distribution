package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateResolverQueryLogConfigRequest extends js.Object {
  
  /**
    * The ID of the query logging configuration that you want to disassociate a specified VPC from.
    */
  var ResolverQueryLogConfigId: ResourceId = js.native
  
  /**
    * The ID of the Amazon VPC that you want to disassociate from a specified query logging configuration.
    */
  var ResourceId: typings.awsSdk.route53resolverMod.ResourceId = js.native
}
object DisassociateResolverQueryLogConfigRequest {
  
  @scala.inline
  def apply(ResolverQueryLogConfigId: ResourceId, ResourceId: ResourceId): DisassociateResolverQueryLogConfigRequest = {
    val __obj = js.Dynamic.literal(ResolverQueryLogConfigId = ResolverQueryLogConfigId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateResolverQueryLogConfigRequest]
  }
  
  @scala.inline
  implicit class DisassociateResolverQueryLogConfigRequestOps[Self <: DisassociateResolverQueryLogConfigRequest] (val x: Self) extends AnyVal {
    
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
    def setResolverQueryLogConfigId(value: ResourceId): Self = this.set("ResolverQueryLogConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
  }
}
