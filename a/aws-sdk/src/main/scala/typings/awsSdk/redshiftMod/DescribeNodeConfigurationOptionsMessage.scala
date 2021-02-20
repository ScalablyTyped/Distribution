package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNodeConfigurationOptionsMessage extends StObject {
  
  /**
    * The action type to evaluate for possible node configurations. Specify "restore-cluster" to get configuration combinations based on an existing snapshot. Specify "recommend-node-config" to get configuration recommendations based on an existing cluster or snapshot. Specify "resize-cluster" to get configuration combinations for elastic resize based on an existing cluster. 
    */
  var ActionType: typings.awsSdk.redshiftMod.ActionType = js.native
  
  /**
    * The identifier of the cluster to evaluate for possible node configurations.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * A set of name, operator, and value items to filter the results.
    */
  var Filters: js.UndefOr[NodeConfigurationOptionsFilterList] = js.native
  
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeNodeConfigurationOptions request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 500  Constraints: minimum 100, maximum 500.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
    */
  var OwnerAccount: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the snapshot to evaluate for possible node configurations.
    */
  var SnapshotIdentifier: js.UndefOr[String] = js.native
}
object DescribeNodeConfigurationOptionsMessage {
  
  @scala.inline
  def apply(ActionType: ActionType): DescribeNodeConfigurationOptionsMessage = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodeConfigurationOptionsMessage]
  }
  
  @scala.inline
  implicit class DescribeNodeConfigurationOptionsMessageMutableBuilder[Self <: DescribeNodeConfigurationOptionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: ActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    @scala.inline
    def setFilters(value: NodeConfigurationOptionsFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: NodeConfigurationOptionsFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setOwnerAccount(value: String): Self = StObject.set(x, "OwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccountUndefined: Self = StObject.set(x, "OwnerAccount", js.undefined)
    
    @scala.inline
    def setSnapshotIdentifier(value: String): Self = StObject.set(x, "SnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdentifierUndefined: Self = StObject.set(x, "SnapshotIdentifier", js.undefined)
  }
}
