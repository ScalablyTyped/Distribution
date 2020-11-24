package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbClusterSnapshotDetails extends js.Object {
  
  /**
    * Specifies the allocated storage size in gibibytes (GiB).
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.native
  
  /**
    * A list of Availability Zones where instances in the DB cluster can be created.
    */
  var AvailabilityZones: js.UndefOr[StringList] = js.native
  
  /**
    * Indicates when the DB cluster was created, in Universal Coordinated Time (UTC). Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var ClusterCreateTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The DB cluster identifier.
    */
  var DbClusterIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of the DB cluster snapshot.
    */
  var DbClusterSnapshotIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var Engine: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The version of the database engine to use.
    */
  var EngineVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether mapping of IAM accounts to database accounts is enabled.
    */
  var IamDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The ARN of the AWS KMS master key that is used to encrypt the database instances in the DB cluster.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The license model information for this DB cluster snapshot.
    */
  var LicenseModel: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the master user for the DB cluster.
    */
  var MasterUsername: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Specifies the percentage of the estimated data that has been transferred.
    */
  var PercentProgress: js.UndefOr[Integer] = js.native
  
  /**
    * The port number on which the DB instances in the DB cluster accept connections.
    */
  var Port: js.UndefOr[Integer] = js.native
  
  /**
    * Indicates when the snapshot was taken. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var SnapshotCreateTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of DB cluster snapshot.
    */
  var SnapshotType: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of this DB cluster snapshot.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether the DB cluster is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * The VPC ID that is associated with the DB cluster snapshot.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbClusterSnapshotDetails {
  
  @scala.inline
  def apply(): AwsRdsDbClusterSnapshotDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbClusterSnapshotDetails]
  }
  
  @scala.inline
  implicit class AwsRdsDbClusterSnapshotDetailsOps[Self <: AwsRdsDbClusterSnapshotDetails] (val x: Self) extends AnyVal {
    
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
    def setAllocatedStorage(value: Integer): Self = this.set("AllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocatedStorage: Self = this.set("AllocatedStorage", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: NonEmptyString*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: StringList): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    
    @scala.inline
    def setClusterCreateTime(value: NonEmptyString): Self = this.set("ClusterCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterCreateTime: Self = this.set("ClusterCreateTime", js.undefined)
    
    @scala.inline
    def setDbClusterIdentifier(value: NonEmptyString): Self = this.set("DbClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterIdentifier: Self = this.set("DbClusterIdentifier", js.undefined)
    
    @scala.inline
    def setDbClusterSnapshotIdentifier(value: NonEmptyString): Self = this.set("DbClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterSnapshotIdentifier: Self = this.set("DbClusterSnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setEngine(value: NonEmptyString): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: NonEmptyString): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setIamDatabaseAuthenticationEnabled(value: Boolean): Self = this.set("IamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamDatabaseAuthenticationEnabled: Self = this.set("IamDatabaseAuthenticationEnabled", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: NonEmptyString): Self = this.set("LicenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseModel: Self = this.set("LicenseModel", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: NonEmptyString): Self = this.set("MasterUsername", value.asInstanceOf[js.Any])
    
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
    def setSnapshotCreateTime(value: NonEmptyString): Self = this.set("SnapshotCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotCreateTime: Self = this.set("SnapshotCreateTime", js.undefined)
    
    @scala.inline
    def setSnapshotType(value: NonEmptyString): Self = this.set("SnapshotType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotType: Self = this.set("SnapshotType", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStorageEncrypted(value: Boolean): Self = this.set("StorageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageEncrypted: Self = this.set("StorageEncrypted", js.undefined)
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
