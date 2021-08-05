package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHostedZoneLimitRequest extends StObject {
  
  /**
    * The ID of the hosted zone that you want to get a limit for.
    */
  var HostedZoneId: ResourceId
  
  /**
    * The limit that you want to get. Valid values include the following:    MAX_RRSETS_BY_ZONE: The maximum number of records that you can create in the specified hosted zone.    MAX_VPCS_ASSOCIATED_BY_ZONE: The maximum number of Amazon VPCs that you can associate with the specified private hosted zone.  
    */
  var Type: HostedZoneLimitType
}
object GetHostedZoneLimitRequest {
  
  inline def apply(HostedZoneId: ResourceId, Type: HostedZoneLimitType): GetHostedZoneLimitRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedZoneLimitRequest]
  }
  
  extension [Self <: GetHostedZoneLimitRequest](x: Self) {
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setType(value: HostedZoneLimitType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
