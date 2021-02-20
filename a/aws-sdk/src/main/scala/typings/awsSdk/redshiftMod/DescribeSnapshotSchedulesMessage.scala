package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSnapshotSchedulesMessage extends StObject {
  
  /**
    * The unique identifier for the cluster whose snapshot schedules you want to view.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the marker parameter and retrying the command. If the marker field is empty, all response records have been retrieved for the request.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number or response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * A unique identifier for a snapshot schedule.
    */
  var ScheduleIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The key value for a snapshot schedule tag.
    */
  var TagKeys: js.UndefOr[TagKeyList] = js.native
  
  /**
    * The value corresponding to the key of the snapshot schedule tag.
    */
  var TagValues: js.UndefOr[TagValueList] = js.native
}
object DescribeSnapshotSchedulesMessage {
  
  @scala.inline
  def apply(): DescribeSnapshotSchedulesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotSchedulesMessage]
  }
  
  @scala.inline
  implicit class DescribeSnapshotSchedulesMessageMutableBuilder[Self <: DescribeSnapshotSchedulesMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setScheduleIdentifier(value: String): Self = StObject.set(x, "ScheduleIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleIdentifierUndefined: Self = StObject.set(x, "ScheduleIdentifier", js.undefined)
    
    @scala.inline
    def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysUndefined: Self = StObject.set(x, "TagKeys", js.undefined)
    
    @scala.inline
    def setTagKeysVarargs(value: String*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
    
    @scala.inline
    def setTagValues(value: TagValueList): Self = StObject.set(x, "TagValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagValuesUndefined: Self = StObject.set(x, "TagValues", js.undefined)
    
    @scala.inline
    def setTagValuesVarargs(value: String*): Self = StObject.set(x, "TagValues", js.Array(value :_*))
  }
}
