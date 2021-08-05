package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomAvailabilityZoneMessage extends StObject {
  
  /**
    * The list of CustomAvailabilityZone objects for the AWS account.
    */
  var CustomAvailabilityZones: js.UndefOr[CustomAvailabilityZoneList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous DescribeCustomAvailabilityZones request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object CustomAvailabilityZoneMessage {
  
  inline def apply(): CustomAvailabilityZoneMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAvailabilityZoneMessage]
  }
  
  extension [Self <: CustomAvailabilityZoneMessage](x: Self) {
    
    inline def setCustomAvailabilityZones(value: CustomAvailabilityZoneList): Self = StObject.set(x, "CustomAvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setCustomAvailabilityZonesUndefined: Self = StObject.set(x, "CustomAvailabilityZones", js.undefined)
    
    inline def setCustomAvailabilityZonesVarargs(value: CustomAvailabilityZone*): Self = StObject.set(x, "CustomAvailabilityZones", js.Array(value :_*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
