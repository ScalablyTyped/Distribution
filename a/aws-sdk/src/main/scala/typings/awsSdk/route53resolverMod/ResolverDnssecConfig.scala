package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolverDnssecConfig extends StObject {
  
  /**
    * The ID for a configuration for DNSSEC validation.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The owner account ID of the virtual private cloud (VPC) for a configuration for DNSSEC validation.
    */
  var OwnerId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC validation status for.
    */
  var ResourceId: js.UndefOr[typings.awsSdk.route53resolverMod.ResourceId] = js.undefined
  
  /**
    * The validation status for a DNSSEC configuration. The status can be one of the following:    ENABLING: DNSSEC validation is being enabled but is not complete.    ENABLED: DNSSEC validation is enabled.    DISABLING: DNSSEC validation is being disabled but is not complete.    DISABLED DNSSEC validation is disabled.  
    */
  var ValidationStatus: js.UndefOr[ResolverDNSSECValidationStatus] = js.undefined
}
object ResolverDnssecConfig {
  
  inline def apply(): ResolverDnssecConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverDnssecConfig]
  }
  
  extension [Self <: ResolverDnssecConfig](x: Self) {
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setOwnerId(value: AccountId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setValidationStatus(value: ResolverDNSSECValidationStatus): Self = StObject.set(x, "ValidationStatus", value.asInstanceOf[js.Any])
    
    inline def setValidationStatusUndefined: Self = StObject.set(x, "ValidationStatus", js.undefined)
  }
}
