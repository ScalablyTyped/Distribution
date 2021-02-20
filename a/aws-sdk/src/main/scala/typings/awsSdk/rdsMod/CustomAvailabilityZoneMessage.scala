package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAvailabilityZoneMessage extends StObject {
  
  /**
    * The list of CustomAvailabilityZone objects for the AWS account.
    */
  var CustomAvailabilityZones: js.UndefOr[CustomAvailabilityZoneList] = js.native
  
  /**
    * An optional pagination token provided by a previous DescribeCustomAvailabilityZones request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
}
object CustomAvailabilityZoneMessage {
  
  @scala.inline
  def apply(): CustomAvailabilityZoneMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAvailabilityZoneMessage]
  }
  
  @scala.inline
  implicit class CustomAvailabilityZoneMessageMutableBuilder[Self <: CustomAvailabilityZoneMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomAvailabilityZones(value: CustomAvailabilityZoneList): Self = StObject.set(x, "CustomAvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAvailabilityZonesUndefined: Self = StObject.set(x, "CustomAvailabilityZones", js.undefined)
    
    @scala.inline
    def setCustomAvailabilityZonesVarargs(value: CustomAvailabilityZone*): Self = StObject.set(x, "CustomAvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
