package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventsMessage extends js.Object {
  /**
    * The duration of the events to be listed.
    */
  var Duration: js.UndefOr[IntegerOptional] = js.native
  /**
    * The end time for the events to be listed.
    */
  var EndTime: js.UndefOr[TStamp] = js.native
  /**
    * A list of event categories for the source type that you've chosen.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.native
  /**
    * Filters applied to events.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    *  The identifier of an event source.
    */
  var SourceIdentifier: js.UndefOr[String] = js.native
  /**
    * The type of AWS DMS resource that generates events. Valid values: replication-instance | replication-task
    */
  var SourceType: js.UndefOr[typings.awsSdk.dmsMod.SourceType] = js.native
  /**
    * The start time for the events to be listed.
    */
  var StartTime: js.UndefOr[TStamp] = js.native
}

object DescribeEventsMessage {
  @scala.inline
  def apply(): DescribeEventsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventsMessage]
  }
  @scala.inline
  implicit class DescribeEventsMessageOps[Self <: DescribeEventsMessage] (val x: Self) extends AnyVal {
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
    def setDuration(value: IntegerOptional): Self = this.set("Duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    @scala.inline
    def setEndTime(value: TStamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setEventCategoriesVarargs(value: String*): Self = this.set("EventCategories", js.Array(value :_*))
    @scala.inline
    def setEventCategories(value: EventCategoriesList): Self = this.set("EventCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventCategories: Self = this.set("EventCategories", js.undefined)
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
    @scala.inline
    def setSourceIdentifier(value: String): Self = this.set("SourceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceIdentifier: Self = this.set("SourceIdentifier", js.undefined)
    @scala.inline
    def setSourceType(value: SourceType): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("SourceType", js.undefined)
    @scala.inline
    def setStartTime(value: TStamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
  }
  
}

