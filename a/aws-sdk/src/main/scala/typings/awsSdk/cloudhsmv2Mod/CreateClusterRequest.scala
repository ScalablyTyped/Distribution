package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterRequest extends StObject {
  
  /**
    * A policy that defines how the service retains backups.
    */
  var BackupRetentionPolicy: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.BackupRetentionPolicy] = js.undefined
  
  /**
    * The type of HSM to use in the cluster. Currently the only allowed value is hsm1.medium.
    */
  var HsmType: typings.awsSdk.cloudhsmv2Mod.HsmType
  
  /**
    * The identifier (ID) of the cluster backup to restore. Use this value to restore the cluster from a backup instead of creating a new cluster. To find the backup ID, use DescribeBackups.
    */
  var SourceBackupId: js.UndefOr[BackupId] = js.undefined
  
  /**
    * The identifiers (IDs) of the subnets where you are creating the cluster. You must specify at least one subnet. If you specify multiple subnets, they must meet the following criteria:   All subnets must be in the same virtual private cloud (VPC).   You can specify only one subnet per Availability Zone.  
    */
  var SubnetIds: typings.awsSdk.cloudhsmv2Mod.SubnetIds
  
  /**
    * Tags to apply to the CloudHSM cluster during creation.
    */
  var TagList: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.TagList] = js.undefined
}
object CreateClusterRequest {
  
  @scala.inline
  def apply(HsmType: HsmType, SubnetIds: SubnetIds): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(HsmType = HsmType.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
  
  @scala.inline
  implicit class CreateClusterRequestMutableBuilder[Self <: CreateClusterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupRetentionPolicy(value: BackupRetentionPolicy): Self = StObject.set(x, "BackupRetentionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRetentionPolicyUndefined: Self = StObject.set(x, "BackupRetentionPolicy", js.undefined)
    
    @scala.inline
    def setHsmType(value: HsmType): Self = StObject.set(x, "HsmType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBackupId(value: BackupId): Self = StObject.set(x, "SourceBackupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBackupIdUndefined: Self = StObject.set(x, "SourceBackupId", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value :_*))
  }
}
