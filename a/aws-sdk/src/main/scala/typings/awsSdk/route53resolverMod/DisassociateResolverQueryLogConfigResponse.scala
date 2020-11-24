package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateResolverQueryLogConfigResponse extends js.Object {
  
  /**
    * A complex type that contains settings for the association that you deleted between an Amazon VPC and a query logging configuration.
    */
  var ResolverQueryLogConfigAssociation: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverQueryLogConfigAssociation] = js.native
}
object DisassociateResolverQueryLogConfigResponse {
  
  @scala.inline
  def apply(): DisassociateResolverQueryLogConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateResolverQueryLogConfigResponse]
  }
  
  @scala.inline
  implicit class DisassociateResolverQueryLogConfigResponseOps[Self <: DisassociateResolverQueryLogConfigResponse] (val x: Self) extends AnyVal {
    
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
    def setResolverQueryLogConfigAssociation(value: ResolverQueryLogConfigAssociation): Self = this.set("ResolverQueryLogConfigAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverQueryLogConfigAssociation: Self = this.set("ResolverQueryLogConfigAssociation", js.undefined)
  }
}
