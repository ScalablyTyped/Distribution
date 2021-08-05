package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedDBInstancesOfferingMessage extends StObject {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of reserved DB instance offerings.
    */
  var ReservedDBInstancesOfferings: js.UndefOr[ReservedDBInstancesOfferingList] = js.undefined
}
object ReservedDBInstancesOfferingMessage {
  
  inline def apply(): ReservedDBInstancesOfferingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedDBInstancesOfferingMessage]
  }
  
  extension [Self <: ReservedDBInstancesOfferingMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setReservedDBInstancesOfferings(value: ReservedDBInstancesOfferingList): Self = StObject.set(x, "ReservedDBInstancesOfferings", value.asInstanceOf[js.Any])
    
    inline def setReservedDBInstancesOfferingsUndefined: Self = StObject.set(x, "ReservedDBInstancesOfferings", js.undefined)
    
    inline def setReservedDBInstancesOfferingsVarargs(value: ReservedDBInstancesOffering*): Self = StObject.set(x, "ReservedDBInstancesOfferings", js.Array(value :_*))
  }
}
