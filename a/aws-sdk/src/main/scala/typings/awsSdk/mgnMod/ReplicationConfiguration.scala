package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationConfiguration extends StObject {
  
  /**
    * Replication Configuration associate default Application Migration Service Security Group.
    */
  var associateDefaultSecurityGroup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Replication Configuration set bandwidth throttling.
    */
  var bandwidthThrottling: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Replication Configuration create Public IP.
    */
  var createPublicIP: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Replication Configuration data plane routing.
    */
  var dataPlaneRouting: js.UndefOr[ReplicationConfigurationDataPlaneRouting] = js.undefined
  
  /**
    * Replication Configuration use default large Staging Disks.
    */
  var defaultLargeStagingDiskType: js.UndefOr[ReplicationConfigurationDefaultLargeStagingDiskType] = js.undefined
  
  /**
    * Replication Configuration EBS encryption.
    */
  var ebsEncryption: js.UndefOr[ReplicationConfigurationEbsEncryption] = js.undefined
  
  /**
    * Replication Configuration EBS encryption key ARN.
    */
  var ebsEncryptionKeyArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Replication Configuration name.
    */
  var name: js.UndefOr[SmallBoundedString] = js.undefined
  
  /**
    * Replication Configuration replicated disks.
    */
  var replicatedDisks: js.UndefOr[ReplicationConfigurationReplicatedDisks] = js.undefined
  
  /**
    * Replication Configuration Replication Server instance type.
    */
  var replicationServerInstanceType: js.UndefOr[EC2InstanceType] = js.undefined
  
  /**
    * Replication Configuration Replication Server Security Group IDs.
    */
  var replicationServersSecurityGroupsIDs: js.UndefOr[ReplicationServersSecurityGroupsIDs] = js.undefined
  
  /**
    * Replication Configuration Source Server ID.
    */
  var sourceServerID: js.UndefOr[SourceServerID] = js.undefined
  
  /**
    * Replication Configuration Staging Area subnet ID.
    */
  var stagingAreaSubnetId: js.UndefOr[SubnetID] = js.undefined
  
  /**
    * Replication Configuration Staging Area tags.
    */
  var stagingAreaTags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * Replication Configuration use Dedicated Replication Server.
    */
  var useDedicatedReplicationServer: js.UndefOr[Boolean] = js.undefined
}
object ReplicationConfiguration {
  
  inline def apply(): ReplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationConfiguration]
  }
  
  extension [Self <: ReplicationConfiguration](x: Self) {
    
    inline def setAssociateDefaultSecurityGroup(value: Boolean): Self = StObject.set(x, "associateDefaultSecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setAssociateDefaultSecurityGroupUndefined: Self = StObject.set(x, "associateDefaultSecurityGroup", js.undefined)
    
    inline def setBandwidthThrottling(value: PositiveInteger): Self = StObject.set(x, "bandwidthThrottling", value.asInstanceOf[js.Any])
    
    inline def setBandwidthThrottlingUndefined: Self = StObject.set(x, "bandwidthThrottling", js.undefined)
    
    inline def setCreatePublicIP(value: Boolean): Self = StObject.set(x, "createPublicIP", value.asInstanceOf[js.Any])
    
    inline def setCreatePublicIPUndefined: Self = StObject.set(x, "createPublicIP", js.undefined)
    
    inline def setDataPlaneRouting(value: ReplicationConfigurationDataPlaneRouting): Self = StObject.set(x, "dataPlaneRouting", value.asInstanceOf[js.Any])
    
    inline def setDataPlaneRoutingUndefined: Self = StObject.set(x, "dataPlaneRouting", js.undefined)
    
    inline def setDefaultLargeStagingDiskType(value: ReplicationConfigurationDefaultLargeStagingDiskType): Self = StObject.set(x, "defaultLargeStagingDiskType", value.asInstanceOf[js.Any])
    
    inline def setDefaultLargeStagingDiskTypeUndefined: Self = StObject.set(x, "defaultLargeStagingDiskType", js.undefined)
    
    inline def setEbsEncryption(value: ReplicationConfigurationEbsEncryption): Self = StObject.set(x, "ebsEncryption", value.asInstanceOf[js.Any])
    
    inline def setEbsEncryptionKeyArn(value: ARN): Self = StObject.set(x, "ebsEncryptionKeyArn", value.asInstanceOf[js.Any])
    
    inline def setEbsEncryptionKeyArnUndefined: Self = StObject.set(x, "ebsEncryptionKeyArn", js.undefined)
    
    inline def setEbsEncryptionUndefined: Self = StObject.set(x, "ebsEncryption", js.undefined)
    
    inline def setName(value: SmallBoundedString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReplicatedDisks(value: ReplicationConfigurationReplicatedDisks): Self = StObject.set(x, "replicatedDisks", value.asInstanceOf[js.Any])
    
    inline def setReplicatedDisksUndefined: Self = StObject.set(x, "replicatedDisks", js.undefined)
    
    inline def setReplicatedDisksVarargs(value: ReplicationConfigurationReplicatedDisk*): Self = StObject.set(x, "replicatedDisks", js.Array(value*))
    
    inline def setReplicationServerInstanceType(value: EC2InstanceType): Self = StObject.set(x, "replicationServerInstanceType", value.asInstanceOf[js.Any])
    
    inline def setReplicationServerInstanceTypeUndefined: Self = StObject.set(x, "replicationServerInstanceType", js.undefined)
    
    inline def setReplicationServersSecurityGroupsIDs(value: ReplicationServersSecurityGroupsIDs): Self = StObject.set(x, "replicationServersSecurityGroupsIDs", value.asInstanceOf[js.Any])
    
    inline def setReplicationServersSecurityGroupsIDsUndefined: Self = StObject.set(x, "replicationServersSecurityGroupsIDs", js.undefined)
    
    inline def setReplicationServersSecurityGroupsIDsVarargs(value: SecurityGroupID*): Self = StObject.set(x, "replicationServersSecurityGroupsIDs", js.Array(value*))
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDUndefined: Self = StObject.set(x, "sourceServerID", js.undefined)
    
    inline def setStagingAreaSubnetId(value: SubnetID): Self = StObject.set(x, "stagingAreaSubnetId", value.asInstanceOf[js.Any])
    
    inline def setStagingAreaSubnetIdUndefined: Self = StObject.set(x, "stagingAreaSubnetId", js.undefined)
    
    inline def setStagingAreaTags(value: TagsMap): Self = StObject.set(x, "stagingAreaTags", value.asInstanceOf[js.Any])
    
    inline def setStagingAreaTagsUndefined: Self = StObject.set(x, "stagingAreaTags", js.undefined)
    
    inline def setUseDedicatedReplicationServer(value: Boolean): Self = StObject.set(x, "useDedicatedReplicationServer", value.asInstanceOf[js.Any])
    
    inline def setUseDedicatedReplicationServerUndefined: Self = StObject.set(x, "useDedicatedReplicationServer", js.undefined)
  }
}
