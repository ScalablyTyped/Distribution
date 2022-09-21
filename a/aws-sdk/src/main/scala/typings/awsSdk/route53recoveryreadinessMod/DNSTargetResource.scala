package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DNSTargetResource extends StObject {
  
  /**
    * The domain name that acts as an ingress point to a portion of the customer application.
    */
  var DomainName: js.UndefOr[string] = js.undefined
  
  /**
    * The hosted zone Amazon Resource Name (ARN) that contains the DNS record with the provided name of the target resource.
    */
  var HostedZoneArn: js.UndefOr[string] = js.undefined
  
  /**
    * The Route 53 record set ID that uniquely identifies a DNS record, given a name and a type.
    */
  var RecordSetId: js.UndefOr[string] = js.undefined
  
  /**
    * The type of DNS record of the target resource.
    */
  var RecordType: js.UndefOr[string] = js.undefined
  
  /**
    * The target resource of the DNS target resource.
    */
  var TargetResource: js.UndefOr[typings.awsSdk.route53recoveryreadinessMod.TargetResource] = js.undefined
}
object DNSTargetResource {
  
  inline def apply(): DNSTargetResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DNSTargetResource]
  }
  
  extension [Self <: DNSTargetResource](x: Self) {
    
    inline def setDomainName(value: string): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setHostedZoneArn(value: string): Self = StObject.set(x, "HostedZoneArn", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneArnUndefined: Self = StObject.set(x, "HostedZoneArn", js.undefined)
    
    inline def setRecordSetId(value: string): Self = StObject.set(x, "RecordSetId", value.asInstanceOf[js.Any])
    
    inline def setRecordSetIdUndefined: Self = StObject.set(x, "RecordSetId", js.undefined)
    
    inline def setRecordType(value: string): Self = StObject.set(x, "RecordType", value.asInstanceOf[js.Any])
    
    inline def setRecordTypeUndefined: Self = StObject.set(x, "RecordType", js.undefined)
    
    inline def setTargetResource(value: TargetResource): Self = StObject.set(x, "TargetResource", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceUndefined: Self = StObject.set(x, "TargetResource", js.undefined)
  }
}
