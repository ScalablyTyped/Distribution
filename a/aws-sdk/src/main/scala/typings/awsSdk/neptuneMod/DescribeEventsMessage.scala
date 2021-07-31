package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventsMessage extends StObject {
  
  /**
    * The number of minutes to retrieve events for. Default: 60
    */
  var Duration: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    *  The end of the time interval for which to retrieve events, specified in ISO 8601 format. For more information about ISO 8601, go to the ISO8601 Wikipedia page.  Example: 2009-07-08T18:00Z
    */
  var EndTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * A list of event categories that trigger notifications for a event notification subscription.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
  
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    *  An optional pagination token provided by a previous DescribeEvents request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The identifier of the event source for which events are returned. If not specified, then all sources are included in the response. Constraints:   If SourceIdentifier is supplied, SourceType must also be provided.   If the source type is DBInstance, then a DBInstanceIdentifier must be supplied.   If the source type is DBSecurityGroup, a DBSecurityGroupName must be supplied.   If the source type is DBParameterGroup, a DBParameterGroupName must be supplied.   If the source type is DBSnapshot, a DBSnapshotIdentifier must be supplied.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var SourceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The event source to retrieve events for. If no value is specified, all events are returned.
    */
  var SourceType: js.UndefOr[typings.awsSdk.neptuneMod.SourceType] = js.undefined
  
  /**
    *  The beginning of the time interval to retrieve events for, specified in ISO 8601 format. For more information about ISO 8601, go to the ISO8601 Wikipedia page.  Example: 2009-07-08T18:00Z
    */
  var StartTime: js.UndefOr[TStamp] = js.undefined
}
object DescribeEventsMessage {
  
  @scala.inline
  def apply(): DescribeEventsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventsMessage]
  }
  
  @scala.inline
  implicit class DescribeEventsMessageMutableBuilder[Self <: DescribeEventsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: IntegerOptional): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setEndTime(value: TStamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setEventCategories(value: EventCategoriesList): Self = StObject.set(x, "EventCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCategoriesUndefined: Self = StObject.set(x, "EventCategories", js.undefined)
    
    @scala.inline
    def setEventCategoriesVarargs(value: String*): Self = StObject.set(x, "EventCategories", js.Array(value :_*))
    
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
    
    @scala.inline
    def setSourceIdentifier(value: String): Self = StObject.set(x, "SourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdentifierUndefined: Self = StObject.set(x, "SourceIdentifier", js.undefined)
    
    @scala.inline
    def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    @scala.inline
    def setStartTime(value: TStamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
