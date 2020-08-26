package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  /**
    * The cluster's backup policy.
    */
  var BackupPolicy: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.BackupPolicy] = js.native
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
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
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
    def setBackupPolicy(value: BackupPolicy): Self = this.set("BackupPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupPolicy: Self = this.set("BackupPolicy", js.undefined)
    @scala.inline
    def setCertificates(value: Certificates): Self = this.set("Certificates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificates: Self = this.set("Certificates", js.undefined)
    @scala.inline
    def setClusterId(value: ClusterId): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterId: Self = this.set("ClusterId", js.undefined)
    @scala.inline
    def setCreateTimestamp(value: Timestamp): Self = this.set("CreateTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTimestamp: Self = this.set("CreateTimestamp", js.undefined)
    @scala.inline
    def setHsmType(value: HsmType): Self = this.set("HsmType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsmType: Self = this.set("HsmType", js.undefined)
    @scala.inline
    def setHsmsVarargs(value: Hsm*): Self = this.set("Hsms", js.Array(value :_*))
    @scala.inline
    def setHsms(value: Hsms): Self = this.set("Hsms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsms: Self = this.set("Hsms", js.undefined)
    @scala.inline
    def setPreCoPassword(value: PreCoPassword): Self = this.set("PreCoPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreCoPassword: Self = this.set("PreCoPassword", js.undefined)
    @scala.inline
    def setSecurityGroup(value: SecurityGroup): Self = this.set("SecurityGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroup: Self = this.set("SecurityGroup", js.undefined)
    @scala.inline
    def setSourceBackupId(value: BackupId): Self = this.set("SourceBackupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceBackupId: Self = this.set("SourceBackupId", js.undefined)
    @scala.inline
    def setState(value: ClusterState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStateMessage(value: StateMessage): Self = this.set("StateMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateMessage: Self = this.set("StateMessage", js.undefined)
    @scala.inline
    def setSubnetMapping(value: ExternalSubnetMapping): Self = this.set("SubnetMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetMapping: Self = this.set("SubnetMapping", js.undefined)
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = this.set("TagList", js.Array(value :_*))
    @scala.inline
    def setTagList(value: TagList): Self = this.set("TagList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagList: Self = this.set("TagList", js.undefined)
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

