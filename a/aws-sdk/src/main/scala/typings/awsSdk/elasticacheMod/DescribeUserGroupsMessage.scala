package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserGroupsMessage extends StObject {
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. &gt;
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. 
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The ID of the user group.
    */
  var UserGroupId: js.UndefOr[String] = js.undefined
}
object DescribeUserGroupsMessage {
  
  @scala.inline
  def apply(): DescribeUserGroupsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserGroupsMessage]
  }
  
  @scala.inline
  implicit class DescribeUserGroupsMessageMutableBuilder[Self <: DescribeUserGroupsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setUserGroupId(value: String): Self = StObject.set(x, "UserGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGroupIdUndefined: Self = StObject.set(x, "UserGroupId", js.undefined)
  }
}
