package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateReplicationConfigurationRequest extends StObject {
  
  /**
    * Whether to associate the default Elastic Disaster Recovery Security group with the Replication Configuration.
    */
  var associateDefaultSecurityGroup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configure bandwidth throttling for the outbound data transfer rate of the Source Server in Mbps.
    */
  var bandwidthThrottling: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Whether to create a Public IP for the Recovery Instance by default.
    */
  var createPublicIP: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The data plane routing mechanism that will be used for replication.
    */
  var dataPlaneRouting: js.UndefOr[ReplicationConfigurationDataPlaneRouting] = js.undefined
  
  /**
    * The Staging Disk EBS volume type to be used during replication.
    */
  var defaultLargeStagingDiskType: js.UndefOr[ReplicationConfigurationDefaultLargeStagingDiskType] = js.undefined
  
  /**
    * The type of EBS encryption to be used during replication.
    */
  var ebsEncryption: js.UndefOr[ReplicationConfigurationEbsEncryption] = js.undefined
  
  /**
    * The ARN of the EBS encryption key to be used during replication.
    */
  var ebsEncryptionKeyArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The name of the Replication Configuration.
    */
  var name: js.UndefOr[SmallBoundedString] = js.undefined
  
  /**
    * The Point in time (PIT) policy to manage snapshots taken during replication.
    */
  var pitPolicy: js.UndefOr[PITPolicy] = js.undefined
  
  /**
    * The configuration of the disks of the Source Server to be replicated.
    */
  var replicatedDisks: js.UndefOr[ReplicationConfigurationReplicatedDisks] = js.undefined
  
  /**
    * The instance type to be used for the replication server.
    */
  var replicationServerInstanceType: js.UndefOr[EC2InstanceType] = js.undefined
  
  /**
    * The security group IDs that will be used by the replication server.
    */
  var replicationServersSecurityGroupsIDs: js.UndefOr[ReplicationServersSecurityGroupsIDs] = js.undefined
  
  /**
    * The ID of the Source Server for this Replication Configuration.
    */
  var sourceServerID: SourceServerID
  
  /**
    * The subnet to be used by the replication staging area.
    */
  var stagingAreaSubnetId: js.UndefOr[SubnetID] = js.undefined
  
  /**
    * A set of tags to be associated with all resources created in the replication staging area: EC2 replication server, EBS volumes, EBS snapshots, etc.
    */
  var stagingAreaTags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * Whether to use a dedicated Replication Server in the replication staging area.
    */
  var useDedicatedReplicationServer: js.UndefOr[Boolean] = js.undefined
}
object UpdateReplicationConfigurationRequest {
  
  inline def apply(sourceServerID: SourceServerID): UpdateReplicationConfigurationRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReplicationConfigurationRequest]
  }
  
  extension [Self <: UpdateReplicationConfigurationRequest](x: Self) {
    
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
    
    inline def setPitPolicy(value: PITPolicy): Self = StObject.set(x, "pitPolicy", value.asInstanceOf[js.Any])
    
    inline def setPitPolicyUndefined: Self = StObject.set(x, "pitPolicy", js.undefined)
    
    inline def setPitPolicyVarargs(value: PITPolicyRule*): Self = StObject.set(x, "pitPolicy", js.Array(value*))
    
    inline def setReplicatedDisks(value: ReplicationConfigurationReplicatedDisks): Self = StObject.set(x, "replicatedDisks", value.asInstanceOf[js.Any])
    
    inline def setReplicatedDisksUndefined: Self = StObject.set(x, "replicatedDisks", js.undefined)
    
    inline def setReplicatedDisksVarargs(value: ReplicationConfigurationReplicatedDisk*): Self = StObject.set(x, "replicatedDisks", js.Array(value*))
    
    inline def setReplicationServerInstanceType(value: EC2InstanceType): Self = StObject.set(x, "replicationServerInstanceType", value.asInstanceOf[js.Any])
    
    inline def setReplicationServerInstanceTypeUndefined: Self = StObject.set(x, "replicationServerInstanceType", js.undefined)
    
    inline def setReplicationServersSecurityGroupsIDs(value: ReplicationServersSecurityGroupsIDs): Self = StObject.set(x, "replicationServersSecurityGroupsIDs", value.asInstanceOf[js.Any])
    
    inline def setReplicationServersSecurityGroupsIDsUndefined: Self = StObject.set(x, "replicationServersSecurityGroupsIDs", js.undefined)
    
    inline def setReplicationServersSecurityGroupsIDsVarargs(value: SecurityGroupID*): Self = StObject.set(x, "replicationServersSecurityGroupsIDs", js.Array(value*))
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
    
    inline def setStagingAreaSubnetId(value: SubnetID): Self = StObject.set(x, "stagingAreaSubnetId", value.asInstanceOf[js.Any])
    
    inline def setStagingAreaSubnetIdUndefined: Self = StObject.set(x, "stagingAreaSubnetId", js.undefined)
    
    inline def setStagingAreaTags(value: TagsMap): Self = StObject.set(x, "stagingAreaTags", value.asInstanceOf[js.Any])
    
    inline def setStagingAreaTagsUndefined: Self = StObject.set(x, "stagingAreaTags", js.undefined)
    
    inline def setUseDedicatedReplicationServer(value: Boolean): Self = StObject.set(x, "useDedicatedReplicationServer", value.asInstanceOf[js.Any])
    
    inline def setUseDedicatedReplicationServerUndefined: Self = StObject.set(x, "useDedicatedReplicationServer", js.undefined)
  }
}
