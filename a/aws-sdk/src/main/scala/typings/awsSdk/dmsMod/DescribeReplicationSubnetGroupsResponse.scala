package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReplicationSubnetGroupsResponse extends StObject {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the replication subnet groups.
    */
  var ReplicationSubnetGroups: js.UndefOr[typings.awsSdk.dmsMod.ReplicationSubnetGroups] = js.undefined
}
object DescribeReplicationSubnetGroupsResponse {
  
  @scala.inline
  def apply(): DescribeReplicationSubnetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationSubnetGroupsResponse]
  }
  
  @scala.inline
  implicit class DescribeReplicationSubnetGroupsResponseMutableBuilder[Self <: DescribeReplicationSubnetGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setReplicationSubnetGroups(value: ReplicationSubnetGroups): Self = StObject.set(x, "ReplicationSubnetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationSubnetGroupsUndefined: Self = StObject.set(x, "ReplicationSubnetGroups", js.undefined)
    
    @scala.inline
    def setReplicationSubnetGroupsVarargs(value: ReplicationSubnetGroup*): Self = StObject.set(x, "ReplicationSubnetGroups", js.Array(value :_*))
  }
}
