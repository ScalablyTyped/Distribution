package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClusterRequest extends js.Object {
  
  /**
    * A policy that defines how the service retains backups.
    */
  var BackupRetentionPolicy: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.BackupRetentionPolicy] = js.native
  
  /**
    * The type of HSM to use in the cluster. Currently the only allowed value is hsm1.medium.
    */
  var HsmType: typings.awsSdk.cloudhsmv2Mod.HsmType = js.native
  
  /**
    * The identifier (ID) of the cluster backup to restore. Use this value to restore the cluster from a backup instead of creating a new cluster. To find the backup ID, use DescribeBackups.
    */
  var SourceBackupId: js.UndefOr[BackupId] = js.native
  
  /**
    * The identifiers (IDs) of the subnets where you are creating the cluster. You must specify at least one subnet. If you specify multiple subnets, they must meet the following criteria:   All subnets must be in the same virtual private cloud (VPC).   You can specify only one subnet per Availability Zone.  
    */
  var SubnetIds: typings.awsSdk.cloudhsmv2Mod.SubnetIds = js.native
  
  /**
    * Tags to apply to the CloudHSM cluster during creation.
    */
  var TagList: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.TagList] = js.native
}
object CreateClusterRequest {
  
  @scala.inline
  def apply(HsmType: HsmType, SubnetIds: SubnetIds): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(HsmType = HsmType.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
  
  @scala.inline
  implicit class CreateClusterRequestOps[Self <: CreateClusterRequest] (val x: Self) extends AnyVal {
    
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
    def setHsmType(value: HsmType): Self = this.set("HsmType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = this.set("SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRetentionPolicy(value: BackupRetentionPolicy): Self = this.set("BackupRetentionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupRetentionPolicy: Self = this.set("BackupRetentionPolicy", js.undefined)
    
    @scala.inline
    def setSourceBackupId(value: BackupId): Self = this.set("SourceBackupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceBackupId: Self = this.set("SourceBackupId", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = this.set("TagList", js.Array(value :_*))
    
    @scala.inline
    def setTagList(value: TagList): Self = this.set("TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagList: Self = this.set("TagList", js.undefined)
  }
}
