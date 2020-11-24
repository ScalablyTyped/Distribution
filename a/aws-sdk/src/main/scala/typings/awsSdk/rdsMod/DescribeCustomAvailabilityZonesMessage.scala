package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCustomAvailabilityZonesMessage extends js.Object {
  
  /**
    * The custom AZ identifier. If this parameter is specified, information from only the specific custom AZ is returned.
    */
  var CustomAvailabilityZoneId: js.UndefOr[String] = js.native
  
  /**
    * A filter that specifies one or more custom AZs to describe.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * An optional pagination token provided by a previous DescribeCustomAvailabilityZones request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so you can retrieve the remaining results. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}
object DescribeCustomAvailabilityZonesMessage {
  
  @scala.inline
  def apply(): DescribeCustomAvailabilityZonesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomAvailabilityZonesMessage]
  }
  
  @scala.inline
  implicit class DescribeCustomAvailabilityZonesMessageOps[Self <: DescribeCustomAvailabilityZonesMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomAvailabilityZoneId(value: String): Self = this.set("CustomAvailabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAvailabilityZoneId: Self = this.set("CustomAvailabilityZoneId", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
  }
}
