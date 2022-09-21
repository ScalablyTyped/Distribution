package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayMulticastDomainOptions extends StObject {
  
  /**
    * Indicates whether to automatically cross-account subnet associations that are associated with the transit gateway multicast domain.
    */
  var AutoAcceptSharedAssociations: js.UndefOr[AutoAcceptSharedAssociationsValue] = js.undefined
  
  /**
    * Indicates whether Internet Group Management Protocol (IGMP) version 2 is turned on for the transit gateway multicast domain.
    */
  var Igmpv2Support: js.UndefOr[Igmpv2SupportValue] = js.undefined
  
  /**
    * Indicates whether support for statically configuring transit gateway multicast group sources is turned on.
    */
  var StaticSourcesSupport: js.UndefOr[StaticSourcesSupportValue] = js.undefined
}
object TransitGatewayMulticastDomainOptions {
  
  inline def apply(): TransitGatewayMulticastDomainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayMulticastDomainOptions]
  }
  
  extension [Self <: TransitGatewayMulticastDomainOptions](x: Self) {
    
    inline def setAutoAcceptSharedAssociations(value: AutoAcceptSharedAssociationsValue): Self = StObject.set(x, "AutoAcceptSharedAssociations", value.asInstanceOf[js.Any])
    
    inline def setAutoAcceptSharedAssociationsUndefined: Self = StObject.set(x, "AutoAcceptSharedAssociations", js.undefined)
    
    inline def setIgmpv2Support(value: Igmpv2SupportValue): Self = StObject.set(x, "Igmpv2Support", value.asInstanceOf[js.Any])
    
    inline def setIgmpv2SupportUndefined: Self = StObject.set(x, "Igmpv2Support", js.undefined)
    
    inline def setStaticSourcesSupport(value: StaticSourcesSupportValue): Self = StObject.set(x, "StaticSourcesSupport", value.asInstanceOf[js.Any])
    
    inline def setStaticSourcesSupportUndefined: Self = StObject.set(x, "StaticSourcesSupport", js.undefined)
  }
}
