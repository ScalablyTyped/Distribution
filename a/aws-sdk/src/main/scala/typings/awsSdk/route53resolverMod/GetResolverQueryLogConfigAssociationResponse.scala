package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverQueryLogConfigAssociationResponse extends StObject {
  
  /**
    * Information about the Resolver query logging configuration association that you specified in a GetQueryLogConfigAssociation request.
    */
  var ResolverQueryLogConfigAssociation: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverQueryLogConfigAssociation] = js.native
}
object GetResolverQueryLogConfigAssociationResponse {
  
  @scala.inline
  def apply(): GetResolverQueryLogConfigAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverQueryLogConfigAssociationResponse]
  }
  
  @scala.inline
  implicit class GetResolverQueryLogConfigAssociationResponseMutableBuilder[Self <: GetResolverQueryLogConfigAssociationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverQueryLogConfigAssociation(value: ResolverQueryLogConfigAssociation): Self = StObject.set(x, "ResolverQueryLogConfigAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverQueryLogConfigAssociationUndefined: Self = StObject.set(x, "ResolverQueryLogConfigAssociation", js.undefined)
  }
}
