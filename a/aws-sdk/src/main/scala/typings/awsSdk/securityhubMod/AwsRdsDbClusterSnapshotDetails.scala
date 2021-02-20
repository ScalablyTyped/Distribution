package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbClusterSnapshotDetails extends StObject {
  
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
  implicit class AwsRdsDbClusterSnapshotDetailsMutableBuilder[Self <: AwsRdsDbClusterSnapshotDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocatedStorage(value: Integer): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    @scala.inline
    def setAvailabilityZones(value: StringList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: NonEmptyString*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setClusterCreateTime(value: NonEmptyString): Self = StObject.set(x, "ClusterCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterCreateTimeUndefined: Self = StObject.set(x, "ClusterCreateTime", js.undefined)
    
    @scala.inline
    def setDbClusterIdentifier(value: NonEmptyString): Self = StObject.set(x, "DbClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterIdentifierUndefined: Self = StObject.set(x, "DbClusterIdentifier", js.undefined)
    
    @scala.inline
    def setDbClusterSnapshotIdentifier(value: NonEmptyString): Self = StObject.set(x, "DbClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterSnapshotIdentifierUndefined: Self = StObject.set(x, "DbClusterSnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setEngine(value: NonEmptyString): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: NonEmptyString): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setIamDatabaseAuthenticationEnabled(value: Boolean): Self = StObject.set(x, "IamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamDatabaseAuthenticationEnabledUndefined: Self = StObject.set(x, "IamDatabaseAuthenticationEnabled", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: NonEmptyString): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: NonEmptyString): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    @scala.inline
    def setPercentProgress(value: Integer): Self = StObject.set(x, "PercentProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentProgressUndefined: Self = StObject.set(x, "PercentProgress", js.undefined)
    
    @scala.inline
    def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setSnapshotCreateTime(value: NonEmptyString): Self = StObject.set(x, "SnapshotCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCreateTimeUndefined: Self = StObject.set(x, "SnapshotCreateTime", js.undefined)
    
    @scala.inline
    def setSnapshotType(value: NonEmptyString): Self = StObject.set(x, "SnapshotType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotTypeUndefined: Self = StObject.set(x, "SnapshotType", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setStorageEncrypted(value: Boolean): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
