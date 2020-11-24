package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverQueryLogConfigRequest extends js.Object {
  
  /**
    * The ID of the Resolver query logging configuration that you want to get information about.
    */
  var ResolverQueryLogConfigId: ResourceId = js.native
}
object GetResolverQueryLogConfigRequest {
  
  @scala.inline
  def apply(ResolverQueryLogConfigId: ResourceId): GetResolverQueryLogConfigRequest = {
    val __obj = js.Dynamic.literal(ResolverQueryLogConfigId = ResolverQueryLogConfigId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverQueryLogConfigRequest]
  }
  
  @scala.inline
  implicit class GetResolverQueryLogConfigRequestOps[Self <: GetResolverQueryLogConfigRequest] (val x: Self) extends AnyVal {
    
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
  }
}
