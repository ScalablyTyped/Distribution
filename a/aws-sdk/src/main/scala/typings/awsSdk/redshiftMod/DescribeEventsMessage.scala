package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventsMessage extends StObject {
  
  /**
    * The number of minutes prior to the time of the request for which to retrieve events. For example, if the request is sent at 18:00 and you specify a duration of 60, then only events which have occurred after 17:00 will be returned. Default: 60 
    */
  var Duration: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The end of the time interval for which to retrieve events, specified in ISO 8601 format. For more information about ISO 8601, go to the ISO8601 Wikipedia page.  Example: 2009-07-08T18:00Z 
    */
  var EndTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeEvents request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The identifier of the event source for which events will be returned. If this parameter is not specified, then all sources are included in the response. Constraints: If SourceIdentifier is supplied, SourceType must also be provided.   Specify a cluster identifier when SourceType is cluster.   Specify a cluster security group name when SourceType is cluster-security-group.   Specify a cluster parameter group name when SourceType is cluster-parameter-group.   Specify a cluster snapshot identifier when SourceType is cluster-snapshot.  
    */
  var SourceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The event source to retrieve events for. If no value is specified, all events are returned. Constraints: If SourceType is supplied, SourceIdentifier must also be provided.   Specify cluster when SourceIdentifier is a cluster identifier.   Specify cluster-security-group when SourceIdentifier is a cluster security group name.   Specify cluster-parameter-group when SourceIdentifier is a cluster parameter group name.   Specify cluster-snapshot when SourceIdentifier is a cluster snapshot identifier.  
    */
  var SourceType: js.UndefOr[typings.awsSdk.redshiftMod.SourceType] = js.undefined
  
  /**
    * The beginning of the time interval to retrieve events for, specified in ISO 8601 format. For more information about ISO 8601, go to the ISO8601 Wikipedia page.  Example: 2009-07-08T18:00Z 
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
