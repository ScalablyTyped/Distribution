package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteResolverQueryLogConfigResponse extends js.Object {
  
  /**
    * Information about the query logging configuration that you deleted, including the status of the request.
    */
  var ResolverQueryLogConfig: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverQueryLogConfig] = js.native
}
object DeleteResolverQueryLogConfigResponse {
  
  @scala.inline
  def apply(): DeleteResolverQueryLogConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResolverQueryLogConfigResponse]
  }
  
  @scala.inline
  implicit class DeleteResolverQueryLogConfigResponseOps[Self <: DeleteResolverQueryLogConfigResponse] (val x: Self) extends AnyVal {
    
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
    def setResolverQueryLogConfig(value: ResolverQueryLogConfig): Self = this.set("ResolverQueryLogConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverQueryLogConfig: Self = this.set("ResolverQueryLogConfig", js.undefined)
  }
}
