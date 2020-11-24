package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBClusterSnapshot extends js.Object {
  
  /**
    * Specifies the allocated storage size in gibibytes (GiB).
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.native
  
  /**
    * Provides the list of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.neptuneMod.AvailabilityZones] = js.native
  
  /**
    * Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
    */
  var ClusterCreateTime: js.UndefOr[TStamp] = js.native
  
  /**
    * Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the DB cluster snapshot.
    */
  var DBClusterSnapshotArn: js.UndefOr[String] = js.native
  
  /**
    * Specifies the identifier for a DB cluster snapshot. Must match the identifier of an existing snapshot. After you restore a DB cluster using a DBClusterSnapshotIdentifier, you must specify the same DBClusterSnapshotIdentifier for any future updates to the DB cluster. When you specify this property for an update, the DB cluster is not restored from the snapshot again, and the data in the database is not changed. However, if you don't specify the DBClusterSnapshotIdentifier, an empty DB cluster is created, and the original DB cluster is deleted. If you specify a property that is different from the previous snapshot restore property, the DB cluster is restored from the snapshot specified by the DBClusterSnapshotIdentifier, and the original DB cluster is deleted.
    */
  var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.native
  
  /**
    * Specifies the name of the database engine.
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * Provides the version of the database engine for this DB cluster snapshot.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false.
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * Provides the license model information for this DB cluster snapshot.
    */
  var LicenseModel: js.UndefOr[String] = js.native
  
  /**
    * Provides the master username for the DB cluster snapshot.
    */
  var MasterUsername: js.UndefOr[String] = js.native
  
  /**
    * Specifies the percentage of the estimated data that has been transferred.
    */
  var PercentProgress: js.UndefOr[Integer] = js.native
  
  /**
    * Specifies the port that the DB cluster was listening on at the time of the snapshot.
    */
  var Port: js.UndefOr[Integer] = js.native
  
  /**
    * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
    */
  var SnapshotCreateTime: js.UndefOr[TStamp] = js.native
  
  /**
    * Provides the type of the DB cluster snapshot.
    */
  var SnapshotType: js.UndefOr[String] = js.native
  
  /**
    * If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN) for the source DB cluster snapshot, otherwise, a null value.
    */
  var SourceDBClusterSnapshotArn: js.UndefOr[String] = js.native
  
  /**
    * Specifies the status of this DB cluster snapshot.
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether the DB cluster snapshot is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * Provides the VPC ID associated with the DB cluster snapshot.
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
    def setAllocatedStorage(value: Integer): Self = this.set("AllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocatedStorage: Self = this.set("AllocatedStorage", js.undefined)
    
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
    def setIAMDatabaseAuthenticationEnabled(value: Boolean): Self = this.set("IAMDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIAMDatabaseAuthenticationEnabled: Self = this.set("IAMDatabaseAuthenticationEnabled", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: String): Self = this.set("LicenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseModel: Self = this.set("LicenseModel", js.undefined)
    
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
