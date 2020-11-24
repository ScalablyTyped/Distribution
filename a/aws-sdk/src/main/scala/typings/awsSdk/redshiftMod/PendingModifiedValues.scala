package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingModifiedValues extends js.Object {
  
  /**
    * The pending or in-progress change of the automated snapshot retention period.
    */
  var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The pending or in-progress change of the new identifier for the cluster.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The pending or in-progress change of the cluster type.
    */
  var ClusterType: js.UndefOr[String] = js.native
  
  /**
    * The pending or in-progress change of the service version.
    */
  var ClusterVersion: js.UndefOr[String] = js.native
  
  /**
    * The encryption type for a cluster. Possible values are: KMS and None. 
    */
  var EncryptionType: js.UndefOr[String] = js.native
  
  /**
    * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
    */
  var EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The name of the maintenance track that the cluster will change to during the next maintenance window.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.native
  
  /**
    * The pending or in-progress change of the master user password for the cluster.
    */
  var MasterUserPassword: js.UndefOr[String] = js.native
  
  /**
    * The pending or in-progress change of the cluster's node type.
    */
  var NodeType: js.UndefOr[String] = js.native
  
  /**
    * The pending or in-progress change of the number of nodes in the cluster.
    */
  var NumberOfNodes: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The pending or in-progress change of the ability to connect to the cluster from the public network.
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.native
}
object PendingModifiedValues {
  
  @scala.inline
  def apply(): PendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingModifiedValues]
  }
  
  @scala.inline
  implicit class PendingModifiedValuesOps[Self <: PendingModifiedValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutomatedSnapshotRetentionPeriod(value: IntegerOptional): Self = this.set("AutomatedSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomatedSnapshotRetentionPeriod: Self = this.set("AutomatedSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterIdentifier: Self = this.set("ClusterIdentifier", js.undefined)
    
    @scala.inline
    def setClusterType(value: String): Self = this.set("ClusterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterType: Self = this.set("ClusterType", js.undefined)
    
    @scala.inline
    def setClusterVersion(value: String): Self = this.set("ClusterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterVersion: Self = this.set("ClusterVersion", js.undefined)
    
    @scala.inline
    def setEncryptionType(value: String): Self = this.set("EncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionType: Self = this.set("EncryptionType", js.undefined)
    
    @scala.inline
    def setEnhancedVpcRouting(value: BooleanOptional): Self = this.set("EnhancedVpcRouting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnhancedVpcRouting: Self = this.set("EnhancedVpcRouting", js.undefined)
    
    @scala.inline
    def setMaintenanceTrackName(value: String): Self = this.set("MaintenanceTrackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenanceTrackName: Self = this.set("MaintenanceTrackName", js.undefined)
    
    @scala.inline
    def setMasterUserPassword(value: String): Self = this.set("MasterUserPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUserPassword: Self = this.set("MasterUserPassword", js.undefined)
    
    @scala.inline
    def setNodeType(value: String): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeType: Self = this.set("NodeType", js.undefined)
    
    @scala.inline
    def setNumberOfNodes(value: IntegerOptional): Self = this.set("NumberOfNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfNodes: Self = this.set("NumberOfNodes", js.undefined)
    
    @scala.inline
    def setPubliclyAccessible(value: BooleanOptional): Self = this.set("PubliclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("PubliclyAccessible", js.undefined)
  }
}
