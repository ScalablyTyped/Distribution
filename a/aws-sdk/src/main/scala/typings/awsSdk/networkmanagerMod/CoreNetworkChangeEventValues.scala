package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreNetworkChangeEventValues extends StObject {
  
  /**
    * The ID of the attachment if the change event is associated with an attachment. 
    */
  var AttachmentId: js.UndefOr[typings.awsSdk.networkmanagerMod.AttachmentId] = js.undefined
  
  /**
    * For a STATIC_ROUTE event, this is the IP address.
    */
  var Cidr: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The edge location for the core network change event.
    */
  var EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined
  
  /**
    * The segment name if the change event is associated with a segment.
    */
  var SegmentName: js.UndefOr[ConstrainedString] = js.undefined
}
object CoreNetworkChangeEventValues {
  
  inline def apply(): CoreNetworkChangeEventValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreNetworkChangeEventValues]
  }
  
  extension [Self <: CoreNetworkChangeEventValues](x: Self) {
    
    inline def setAttachmentId(value: AttachmentId): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "AttachmentId", js.undefined)
    
    inline def setCidr(value: ConstrainedString): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    inline def setEdgeLocation(value: ExternalRegionCode): Self = StObject.set(x, "EdgeLocation", value.asInstanceOf[js.Any])
    
    inline def setEdgeLocationUndefined: Self = StObject.set(x, "EdgeLocation", js.undefined)
    
    inline def setSegmentName(value: ConstrainedString): Self = StObject.set(x, "SegmentName", value.asInstanceOf[js.Any])
    
    inline def setSegmentNameUndefined: Self = StObject.set(x, "SegmentName", js.undefined)
  }
}
