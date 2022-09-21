package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResolverConfigRequest extends StObject {
  
  /**
    * Indicates whether or not the Resolver will create autodefined rules for reverse DNS lookups. This is enabled by default. Disabling this option will also affect EC2-Classic instances using ClassicLink. For more information, see ClassicLink in the Amazon EC2 guide.  It can take some time for the status change to be completed.  
    */
  var AutodefinedReverseFlag: typings.awsSdk.route53resolverMod.AutodefinedReverseFlag
  
  /**
    * Resource ID of the Amazon VPC that you want to update the Resolver configuration for.
    */
  var ResourceId: typings.awsSdk.route53resolverMod.ResourceId
}
object UpdateResolverConfigRequest {
  
  inline def apply(AutodefinedReverseFlag: AutodefinedReverseFlag, ResourceId: ResourceId): UpdateResolverConfigRequest = {
    val __obj = js.Dynamic.literal(AutodefinedReverseFlag = AutodefinedReverseFlag.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResolverConfigRequest]
  }
  
  extension [Self <: UpdateResolverConfigRequest](x: Self) {
    
    inline def setAutodefinedReverseFlag(value: AutodefinedReverseFlag): Self = StObject.set(x, "AutodefinedReverseFlag", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
