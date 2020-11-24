package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverQueryLogConfigResponse extends js.Object {
  
  /**
    * Information about the Resolver query logging configuration that you specified in a GetQueryLogConfig request.
    */
  var ResolverQueryLogConfig: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverQueryLogConfig] = js.native
}
object GetResolverQueryLogConfigResponse {
  
  @scala.inline
  def apply(): GetResolverQueryLogConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverQueryLogConfigResponse]
  }
  
  @scala.inline
  implicit class GetResolverQueryLogConfigResponseOps[Self <: GetResolverQueryLogConfigResponse] (val x: Self) extends AnyVal {
    
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
