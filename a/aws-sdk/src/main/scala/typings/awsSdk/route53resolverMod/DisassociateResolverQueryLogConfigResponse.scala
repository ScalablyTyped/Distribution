package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateResolverQueryLogConfigResponse extends StObject {
  
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
  implicit class DisassociateResolverQueryLogConfigResponseMutableBuilder[Self <: DisassociateResolverQueryLogConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverQueryLogConfigAssociation(value: ResolverQueryLogConfigAssociation): Self = StObject.set(x, "ResolverQueryLogConfigAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverQueryLogConfigAssociationUndefined: Self = StObject.set(x, "ResolverQueryLogConfigAssociation", js.undefined)
  }
}
