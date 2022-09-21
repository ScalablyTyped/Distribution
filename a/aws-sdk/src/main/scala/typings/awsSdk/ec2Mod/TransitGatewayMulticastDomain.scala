package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayMulticastDomain extends StObject {
  
  /**
    * The time the transit gateway multicast domain was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The options for the transit gateway multicast domain.
    */
  var Options: js.UndefOr[TransitGatewayMulticastDomainOptions] = js.undefined
  
  /**
    *  The ID of the Amazon Web Services account that owns the transit gateway multicast domain.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the transit gateway multicast domain.
    */
  var State: js.UndefOr[TransitGatewayMulticastDomainState] = js.undefined
  
  /**
    * The tags for the transit gateway multicast domain.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[String] = js.undefined
}
object TransitGatewayMulticastDomain {
  
  inline def apply(): TransitGatewayMulticastDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayMulticastDomain]
  }
  
  extension [Self <: TransitGatewayMulticastDomain](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setOptions(value: TransitGatewayMulticastDomainOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setState(value: TransitGatewayMulticastDomainState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTransitGatewayId(value: String): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    inline def setTransitGatewayMulticastDomainArn(value: String): Self = StObject.set(x, "TransitGatewayMulticastDomainArn", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayMulticastDomainArnUndefined: Self = StObject.set(x, "TransitGatewayMulticastDomainArn", js.undefined)
    
    inline def setTransitGatewayMulticastDomainId(value: String): Self = StObject.set(x, "TransitGatewayMulticastDomainId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayMulticastDomainIdUndefined: Self = StObject.set(x, "TransitGatewayMulticastDomainId", js.undefined)
  }
}
