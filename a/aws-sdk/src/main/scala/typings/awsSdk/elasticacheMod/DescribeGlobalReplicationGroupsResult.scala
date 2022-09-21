package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGlobalReplicationGroupsResult extends StObject {
  
  /**
    * Indicates the slot configuration and global identifier for each slice group.
    */
  var GlobalReplicationGroups: js.UndefOr[GlobalReplicationGroupList] = js.undefined
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. &gt;
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DescribeGlobalReplicationGroupsResult {
  
  inline def apply(): DescribeGlobalReplicationGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalReplicationGroupsResult]
  }
  
  extension [Self <: DescribeGlobalReplicationGroupsResult](x: Self) {
    
    inline def setGlobalReplicationGroups(value: GlobalReplicationGroupList): Self = StObject.set(x, "GlobalReplicationGroups", value.asInstanceOf[js.Any])
    
    inline def setGlobalReplicationGroupsUndefined: Self = StObject.set(x, "GlobalReplicationGroups", js.undefined)
    
    inline def setGlobalReplicationGroupsVarargs(value: GlobalReplicationGroup*): Self = StObject.set(x, "GlobalReplicationGroups", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
