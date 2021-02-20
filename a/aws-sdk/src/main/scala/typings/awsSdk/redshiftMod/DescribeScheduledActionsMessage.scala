package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScheduledActionsMessage extends StObject {
  
  /**
    * If true, retrieve only active scheduled actions. If false, retrieve only disabled scheduled actions. 
    */
  var Active: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The end time in UTC of the scheduled action to retrieve. Only active scheduled actions that have invocations before this time are retrieved.
    */
  var EndTime: js.UndefOr[TStamp] = js.native
  
  /**
    * List of scheduled action filters. 
    */
  var Filters: js.UndefOr[ScheduledActionFilterList] = js.native
  
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeScheduledActions request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The name of the scheduled action to retrieve. 
    */
  var ScheduledActionName: js.UndefOr[String] = js.native
  
  /**
    * The start time in UTC of the scheduled actions to retrieve. Only active scheduled actions that have invocations after this time are retrieved.
    */
  var StartTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The type of the scheduled actions to retrieve. 
    */
  var TargetActionType: js.UndefOr[ScheduledActionTypeValues] = js.native
}
object DescribeScheduledActionsMessage {
  
  @scala.inline
  def apply(): DescribeScheduledActionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledActionsMessage]
  }
  
  @scala.inline
  implicit class DescribeScheduledActionsMessageMutableBuilder[Self <: DescribeScheduledActionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: BooleanOptional): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    @scala.inline
    def setEndTime(value: TStamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setFilters(value: ScheduledActionFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: ScheduledActionFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setScheduledActionName(value: String): Self = StObject.set(x, "ScheduledActionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledActionNameUndefined: Self = StObject.set(x, "ScheduledActionName", js.undefined)
    
    @scala.inline
    def setStartTime(value: TStamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setTargetActionType(value: ScheduledActionTypeValues): Self = StObject.set(x, "TargetActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetActionTypeUndefined: Self = StObject.set(x, "TargetActionType", js.undefined)
  }
}
