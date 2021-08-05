package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGlobalReplicationGroupsMessage extends StObject {
  
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. 
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Returns the list of members that comprise the Global Datastore.
    */
  var ShowMemberInfo: js.UndefOr[BooleanOptional] = js.undefined
}
object DescribeGlobalReplicationGroupsMessage {
  
  inline def apply(): DescribeGlobalReplicationGroupsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalReplicationGroupsMessage]
  }
  
  extension [Self <: DescribeGlobalReplicationGroupsMessage](x: Self) {
    
    inline def setGlobalReplicationGroupId(value: String): Self = StObject.set(x, "GlobalReplicationGroupId", value.asInstanceOf[js.Any])
    
    inline def setGlobalReplicationGroupIdUndefined: Self = StObject.set(x, "GlobalReplicationGroupId", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setShowMemberInfo(value: BooleanOptional): Self = StObject.set(x, "ShowMemberInfo", value.asInstanceOf[js.Any])
    
    inline def setShowMemberInfoUndefined: Self = StObject.set(x, "ShowMemberInfo", js.undefined)
  }
}
