package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverDnssecConfigRequest extends StObject {
  
  /**
    * The ID of the virtual private cloud (VPC) for the DNSSEC validation status.
    */
  var ResourceId: typings.awsSdk.route53resolverMod.ResourceId
}
object GetResolverDnssecConfigRequest {
  
  inline def apply(ResourceId: ResourceId): GetResolverDnssecConfigRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverDnssecConfigRequest]
  }
  
  extension [Self <: GetResolverDnssecConfigRequest](x: Self) {
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
