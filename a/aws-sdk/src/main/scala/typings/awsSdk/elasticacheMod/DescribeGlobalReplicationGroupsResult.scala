package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGlobalReplicationGroupsResult extends StObject {
  
  /**
    * Indicates the slot configuration and global identifier for each slice group.
    */
  var GlobalReplicationGroups: js.UndefOr[GlobalReplicationGroupList] = js.native
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. &gt;
    */
  var Marker: js.UndefOr[String] = js.native
}
object DescribeGlobalReplicationGroupsResult {
  
  @scala.inline
  def apply(): DescribeGlobalReplicationGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalReplicationGroupsResult]
  }
  
  @scala.inline
  implicit class DescribeGlobalReplicationGroupsResultMutableBuilder[Self <: DescribeGlobalReplicationGroupsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalReplicationGroups(value: GlobalReplicationGroupList): Self = StObject.set(x, "GlobalReplicationGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalReplicationGroupsUndefined: Self = StObject.set(x, "GlobalReplicationGroups", js.undefined)
    
    @scala.inline
    def setGlobalReplicationGroupsVarargs(value: GlobalReplicationGroup*): Self = StObject.set(x, "GlobalReplicationGroups", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
