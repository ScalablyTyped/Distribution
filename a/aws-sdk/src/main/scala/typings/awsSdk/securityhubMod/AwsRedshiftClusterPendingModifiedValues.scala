package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterPendingModifiedValues extends StObject {
  
  /**
    * The pending or in-progress change to the automated snapshot retention period.
    */
  var AutomatedSnapshotRetentionPeriod: js.UndefOr[Integer] = js.native
  
  /**
    * The pending or in-progress change to the identifier for the cluster.
    */
  var ClusterIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The pending or in-progress change to the cluster type.
    */
  var ClusterType: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The pending or in-progress change to the service version.
    */
  var ClusterVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The encryption type for a cluster.
    */
  var EncryptionType: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates whether to create the cluster with enhanced VPC routing enabled.
    */
  var EnhancedVpcRouting: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the maintenance track that the cluster changes to during the next maintenance window.
    */
  var MaintenanceTrackName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The pending or in-progress change to the master user password for the cluster.
    */
  var MasterUserPassword: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The pending or in-progress change to the cluster's node type.
    */
  var NodeType: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The pending or in-progress change to the number of nodes in the cluster.
    */
  var NumberOfNodes: js.UndefOr[Integer] = js.native
  
  /**
    * The pending or in-progress change to whether the cluster can be connected to from the public network.
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.native
}
object AwsRedshiftClusterPendingModifiedValues {
  
  @scala.inline
  def apply(): AwsRedshiftClusterPendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterPendingModifiedValues]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterPendingModifiedValuesMutableBuilder[Self <: AwsRedshiftClusterPendingModifiedValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomatedSnapshotRetentionPeriod(value: Integer): Self = StObject.set(x, "AutomatedSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "AutomatedSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setClusterIdentifier(value: NonEmptyString): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    @scala.inline
    def setClusterType(value: NonEmptyString): Self = StObject.set(x, "ClusterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterTypeUndefined: Self = StObject.set(x, "ClusterType", js.undefined)
    
    @scala.inline
    def setClusterVersion(value: NonEmptyString): Self = StObject.set(x, "ClusterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterVersionUndefined: Self = StObject.set(x, "ClusterVersion", js.undefined)
    
    @scala.inline
    def setEncryptionType(value: NonEmptyString): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
    
    @scala.inline
    def setEnhancedVpcRouting(value: Boolean): Self = StObject.set(x, "EnhancedVpcRouting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedVpcRoutingUndefined: Self = StObject.set(x, "EnhancedVpcRouting", js.undefined)
    
    @scala.inline
    def setMaintenanceTrackName(value: NonEmptyString): Self = StObject.set(x, "MaintenanceTrackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceTrackNameUndefined: Self = StObject.set(x, "MaintenanceTrackName", js.undefined)
    
    @scala.inline
    def setMasterUserPassword(value: NonEmptyString): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
    
    @scala.inline
    def setNodeType(value: NonEmptyString): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    @scala.inline
    def setNumberOfNodes(value: Integer): Self = StObject.set(x, "NumberOfNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfNodesUndefined: Self = StObject.set(x, "NumberOfNodes", js.undefined)
    
    @scala.inline
    def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
  }
}
