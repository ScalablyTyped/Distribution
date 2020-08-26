package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterSnapshot extends js.Object {
  /**
    * Provides the list of Amazon EC2 Availability Zones that instances in the cluster snapshot can be restored in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.docdbMod.AvailabilityZones] = js.native
  /**
    * Specifies the time when the cluster was created, in Universal Coordinated Time (UTC).
    */
  var ClusterCreateTime: js.UndefOr[TStamp] = js.native
  /**
    * Specifies the cluster identifier of the cluster that this cluster snapshot was created from.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the cluster snapshot.
    */
  var DBClusterSnapshotArn: js.UndefOr[String] = js.native
  /**
    * Specifies the identifier for the cluster snapshot.
    */
  var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the database engine.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * Provides the version of the database engine for this cluster snapshot.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted cluster snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * Provides the master user name for the cluster snapshot.
    */
  var MasterUsername: js.UndefOr[String] = js.native
  /**
    * Specifies the percentage of the estimated data that has been transferred.
    */
  var PercentProgress: js.UndefOr[Integer] = js.native
  /**
    * Specifies the port that the cluster was listening on at the time of the snapshot.
    */
  var Port: js.UndefOr[Integer] = js.native
  /**
    * Provides the time when the snapshot was taken, in UTC.
    */
  var SnapshotCreateTime: js.UndefOr[TStamp] = js.native
  /**
    * Provides the type of the cluster snapshot.
    */
  var SnapshotType: js.UndefOr[String] = js.native
  /**
    * If the cluster snapshot was copied from a source cluster snapshot, the ARN for the source cluster snapshot; otherwise, a null value.
    */
  var SourceDBClusterSnapshotArn: js.UndefOr[String] = js.native
  /**
    * Specifies the status of this cluster snapshot.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * Specifies whether the cluster snapshot is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * Provides the virtual private cloud (VPC) ID that is associated with the cluster snapshot.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object DBClusterSnapshot {
  @scala.inline
  def apply(): DBClusterSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterSnapshot]
  }
  @scala.inline
  implicit class DBClusterSnapshotOps[Self <: DBClusterSnapshot] (val x: Self) extends AnyVal {
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
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    @scala.inline
    def setClusterCreateTime(value: TStamp): Self = this.set("ClusterCreateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterCreateTime: Self = this.set("ClusterCreateTime", js.undefined)
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = this.set("DBClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterIdentifier: Self = this.set("DBClusterIdentifier", js.undefined)
    @scala.inline
    def setDBClusterSnapshotArn(value: String): Self = this.set("DBClusterSnapshotArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterSnapshotArn: Self = this.set("DBClusterSnapshotArn", js.undefined)
    @scala.inline
    def setDBClusterSnapshotIdentifier(value: String): Self = this.set("DBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterSnapshotIdentifier: Self = this.set("DBClusterSnapshotIdentifier", js.undefined)
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setMasterUsername(value: String): Self = this.set("MasterUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterUsername: Self = this.set("MasterUsername", js.undefined)
    @scala.inline
    def setPercentProgress(value: Integer): Self = this.set("PercentProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentProgress: Self = this.set("PercentProgress", js.undefined)
    @scala.inline
    def setPort(value: Integer): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setSnapshotCreateTime(value: TStamp): Self = this.set("SnapshotCreateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotCreateTime: Self = this.set("SnapshotCreateTime", js.undefined)
    @scala.inline
    def setSnapshotType(value: String): Self = this.set("SnapshotType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotType: Self = this.set("SnapshotType", js.undefined)
    @scala.inline
    def setSourceDBClusterSnapshotArn(value: String): Self = this.set("SourceDBClusterSnapshotArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDBClusterSnapshotArn: Self = this.set("SourceDBClusterSnapshotArn", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStorageEncrypted(value: Boolean): Self = this.set("StorageEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageEncrypted: Self = this.set("StorageEncrypted", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

