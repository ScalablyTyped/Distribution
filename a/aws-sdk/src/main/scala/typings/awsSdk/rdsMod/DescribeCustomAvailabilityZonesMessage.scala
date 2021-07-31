package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomAvailabilityZonesMessage extends StObject {
  
  /**
    * The custom AZ identifier. If this parameter is specified, information from only the specific custom AZ is returned.
    */
  var CustomAvailabilityZoneId: js.UndefOr[String] = js.undefined
  
  /**
    * A filter that specifies one or more custom AZs to describe.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous DescribeCustomAvailabilityZones request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so you can retrieve the remaining results. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}
object DescribeCustomAvailabilityZonesMessage {
  
  @scala.inline
  def apply(): DescribeCustomAvailabilityZonesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomAvailabilityZonesMessage]
  }
  
  @scala.inline
  implicit class DescribeCustomAvailabilityZonesMessageMutableBuilder[Self <: DescribeCustomAvailabilityZonesMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomAvailabilityZoneId(value: String): Self = StObject.set(x, "CustomAvailabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAvailabilityZoneIdUndefined: Self = StObject.set(x, "CustomAvailabilityZoneId", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
