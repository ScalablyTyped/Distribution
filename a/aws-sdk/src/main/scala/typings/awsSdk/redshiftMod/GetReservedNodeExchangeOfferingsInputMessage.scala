package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReservedNodeExchangeOfferingsInputMessage extends StObject {
  
  /**
    * A value that indicates the starting point for the next set of ReservedNodeOfferings.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * An integer setting the maximum number of ReservedNodeOfferings to retrieve.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A string representing the node identifier for the DC1 Reserved Node to be exchanged.
    */
  var ReservedNodeId: String
}
object GetReservedNodeExchangeOfferingsInputMessage {
  
  @scala.inline
  def apply(ReservedNodeId: String): GetReservedNodeExchangeOfferingsInputMessage = {
    val __obj = js.Dynamic.literal(ReservedNodeId = ReservedNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservedNodeExchangeOfferingsInputMessage]
  }
  
  @scala.inline
  implicit class GetReservedNodeExchangeOfferingsInputMessageMutableBuilder[Self <: GetReservedNodeExchangeOfferingsInputMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setReservedNodeId(value: String): Self = StObject.set(x, "ReservedNodeId", value.asInstanceOf[js.Any])
  }
}
