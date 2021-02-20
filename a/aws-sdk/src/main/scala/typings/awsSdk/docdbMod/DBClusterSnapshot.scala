package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBClusterSnapshot extends StObject {
  
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
  implicit class DBClusterSnapshotMutableBuilder[Self <: DBClusterSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setClusterCreateTime(value: TStamp): Self = StObject.set(x, "ClusterCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterCreateTimeUndefined: Self = StObject.set(x, "ClusterCreateTime", js.undefined)
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterIdentifierUndefined: Self = StObject.set(x, "DBClusterIdentifier", js.undefined)
    
    @scala.inline
    def setDBClusterSnapshotArn(value: String): Self = StObject.set(x, "DBClusterSnapshotArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterSnapshotArnUndefined: Self = StObject.set(x, "DBClusterSnapshotArn", js.undefined)
    
    @scala.inline
    def setDBClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "DBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterSnapshotIdentifierUndefined: Self = StObject.set(x, "DBClusterSnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: String): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
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
    def setSnapshotCreateTime(value: TStamp): Self = StObject.set(x, "SnapshotCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCreateTimeUndefined: Self = StObject.set(x, "SnapshotCreateTime", js.undefined)
    
    @scala.inline
    def setSnapshotType(value: String): Self = StObject.set(x, "SnapshotType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotTypeUndefined: Self = StObject.set(x, "SnapshotType", js.undefined)
    
    @scala.inline
    def setSourceDBClusterSnapshotArn(value: String): Self = StObject.set(x, "SourceDBClusterSnapshotArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDBClusterSnapshotArnUndefined: Self = StObject.set(x, "SourceDBClusterSnapshotArn", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setStorageEncrypted(value: Boolean): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
