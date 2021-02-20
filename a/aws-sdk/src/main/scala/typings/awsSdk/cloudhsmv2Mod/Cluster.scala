package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cluster extends StObject {
  
  /**
    * The cluster's backup policy.
    */
  var BackupPolicy: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.BackupPolicy] = js.native
  
  /**
    * A policy that defines how the service retains backups.
    */
  var BackupRetentionPolicy: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.BackupRetentionPolicy] = js.native
  
  /**
    * Contains one or more certificates or a certificate signing request (CSR).
    */
  var Certificates: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.Certificates] = js.native
  
  /**
    * The cluster's identifier (ID).
    */
  var ClusterId: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.ClusterId] = js.native
  
  /**
    * The date and time when the cluster was created.
    */
  var CreateTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The type of HSM that the cluster contains.
    */
  var HsmType: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.HsmType] = js.native
  
  /**
    * Contains information about the HSMs in the cluster.
    */
  var Hsms: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.Hsms] = js.native
  
  /**
    * The default password for the cluster's Pre-Crypto Officer (PRECO) user.
    */
  var PreCoPassword: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.PreCoPassword] = js.native
  
  /**
    * The identifier (ID) of the cluster's security group.
    */
  var SecurityGroup: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.SecurityGroup] = js.native
  
  /**
    * The identifier (ID) of the backup used to create the cluster. This value exists only when the cluster was created from a backup.
    */
  var SourceBackupId: js.UndefOr[BackupId] = js.native
  
  /**
    * The cluster's state.
    */
  var State: js.UndefOr[ClusterState] = js.native
  
  /**
    * A description of the cluster's state.
    */
  var StateMessage: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.StateMessage] = js.native
  
  /**
    * A map from availability zone to the cluster’s subnet in that availability zone.
    */
  var SubnetMapping: js.UndefOr[ExternalSubnetMapping] = js.native
  
  /**
    * The list of tags for the cluster.
    */
  var TagList: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.TagList] = js.native
  
  /**
    * The identifier (ID) of the virtual private cloud (VPC) that contains the cluster.
    */
  var VpcId: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.VpcId] = js.native
}
object Cluster {
  
  @scala.inline
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit class ClusterMutableBuilder[Self <: Cluster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPolicy(value: BackupPolicy): Self = StObject.set(x, "BackupPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPolicyUndefined: Self = StObject.set(x, "BackupPolicy", js.undefined)
    
    @scala.inline
    def setBackupRetentionPolicy(value: BackupRetentionPolicy): Self = StObject.set(x, "BackupRetentionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRetentionPolicyUndefined: Self = StObject.set(x, "BackupRetentionPolicy", js.undefined)
    
    @scala.inline
    def setCertificates(value: Certificates): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesUndefined: Self = StObject.set(x, "Certificates", js.undefined)
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    @scala.inline
    def setCreateTimestamp(value: Timestamp): Self = StObject.set(x, "CreateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimestampUndefined: Self = StObject.set(x, "CreateTimestamp", js.undefined)
    
    @scala.inline
    def setHsmType(value: HsmType): Self = StObject.set(x, "HsmType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmTypeUndefined: Self = StObject.set(x, "HsmType", js.undefined)
    
    @scala.inline
    def setHsms(value: Hsms): Self = StObject.set(x, "Hsms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmsUndefined: Self = StObject.set(x, "Hsms", js.undefined)
    
    @scala.inline
    def setHsmsVarargs(value: Hsm*): Self = StObject.set(x, "Hsms", js.Array(value :_*))
    
    @scala.inline
    def setPreCoPassword(value: PreCoPassword): Self = StObject.set(x, "PreCoPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreCoPasswordUndefined: Self = StObject.set(x, "PreCoPassword", js.undefined)
    
    @scala.inline
    def setSecurityGroup(value: SecurityGroup): Self = StObject.set(x, "SecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupUndefined: Self = StObject.set(x, "SecurityGroup", js.undefined)
    
    @scala.inline
    def setSourceBackupId(value: BackupId): Self = StObject.set(x, "SourceBackupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBackupIdUndefined: Self = StObject.set(x, "SourceBackupId", js.undefined)
    
    @scala.inline
    def setState(value: ClusterState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMessage(value: StateMessage): Self = StObject.set(x, "StateMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMessageUndefined: Self = StObject.set(x, "StateMessage", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setSubnetMapping(value: ExternalSubnetMapping): Self = StObject.set(x, "SubnetMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetMappingUndefined: Self = StObject.set(x, "SubnetMapping", js.undefined)
    
    @scala.inline
    def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
