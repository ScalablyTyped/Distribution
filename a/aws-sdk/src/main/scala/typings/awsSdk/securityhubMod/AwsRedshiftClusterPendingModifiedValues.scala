package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterPendingModifiedValues extends js.Object {
  
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
  implicit class AwsRedshiftClusterPendingModifiedValuesOps[Self <: AwsRedshiftClusterPendingModifiedValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutomatedSnapshotRetentionPeriod(value: Integer): Self = this.set("AutomatedSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomatedSnapshotRetentionPeriod: Self = this.set("AutomatedSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setClusterIdentifier(value: NonEmptyString): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterIdentifier: Self = this.set("ClusterIdentifier", js.undefined)
    
    @scala.inline
    def setClusterType(value: NonEmptyString): Self = this.set("ClusterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterType: Self = this.set("ClusterType", js.undefined)
    
    @scala.inline
    def setClusterVersion(value: NonEmptyString): Self = this.set("ClusterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterVersion: Self = this.set("ClusterVersion", js.undefined)
    
    @scala.inline
    def setEncryptionType(value: NonEmptyString): Self = this.set("EncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionType: Self = this.set("EncryptionType", js.undefined)
    
    @scala.inline
    def setEnhancedVpcRouting(value: Boolean): Self = this.set("EnhancedVpcRouting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnhancedVpcRouting: Self = this.set("EnhancedVpcRouting", js.undefined)
    
    @scala.inline
    def setMaintenanceTrackName(value: NonEmptyString): Self = this.set("MaintenanceTrackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenanceTrackName: Self = this.set("MaintenanceTrackName", js.undefined)
    
    @scala.inline
    def setMasterUserPassword(value: NonEmptyString): Self = this.set("MasterUserPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUserPassword: Self = this.set("MasterUserPassword", js.undefined)
    
    @scala.inline
    def setNodeType(value: NonEmptyString): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeType: Self = this.set("NodeType", js.undefined)
    
    @scala.inline
    def setNumberOfNodes(value: Integer): Self = this.set("NumberOfNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfNodes: Self = this.set("NumberOfNodes", js.undefined)
    
    @scala.inline
    def setPubliclyAccessible(value: Boolean): Self = this.set("PubliclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("PubliclyAccessible", js.undefined)
  }
}
