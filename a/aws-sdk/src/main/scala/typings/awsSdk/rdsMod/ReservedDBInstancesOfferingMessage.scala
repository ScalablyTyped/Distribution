package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedDBInstancesOfferingMessage extends StObject {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * A list of reserved DB instance offerings.
    */
  var ReservedDBInstancesOfferings: js.UndefOr[ReservedDBInstancesOfferingList] = js.native
}
object ReservedDBInstancesOfferingMessage {
  
  @scala.inline
  def apply(): ReservedDBInstancesOfferingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedDBInstancesOfferingMessage]
  }
  
  @scala.inline
  implicit class ReservedDBInstancesOfferingMessageMutableBuilder[Self <: ReservedDBInstancesOfferingMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setReservedDBInstancesOfferings(value: ReservedDBInstancesOfferingList): Self = StObject.set(x, "ReservedDBInstancesOfferings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedDBInstancesOfferingsUndefined: Self = StObject.set(x, "ReservedDBInstancesOfferings", js.undefined)
    
    @scala.inline
    def setReservedDBInstancesOfferingsVarargs(value: ReservedDBInstancesOffering*): Self = StObject.set(x, "ReservedDBInstancesOfferings", js.Array(value :_*))
  }
}
