package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Snapshot extends StObject {
  
  /**
    * All of the Amazon Web Services accounts that have access to restore a snapshot to a provisioned cluster.
    */
  var accountsWithProvisionedRestoreAccess: js.UndefOr[AccountIdList] = js.undefined
  
  /**
    * All of the Amazon Web Services accounts that have access to restore a snapshot to a namespace.
    */
  var accountsWithRestoreAccess: js.UndefOr[AccountIdList] = js.undefined
  
  /**
    * The size of the incremental backup in megabytes.
    */
  var actualIncrementalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * The username of the database within a snapshot.
    */
  var adminUsername: js.UndefOr[String] = js.undefined
  
  /**
    * The size in megabytes of the data that has been backed up to a snapshot.
    */
  var backupProgressInMegaBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * The rate at which data is backed up into a snapshot in megabytes per second.
    */
  var currentBackupRateInMegaBytesPerSecond: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of time it took to back up data into a snapshot.
    */
  var elapsedTimeInSeconds: js.UndefOr[Long] = js.undefined
  
  /**
    * The estimated amount of seconds until the snapshot completes backup.
    */
  var estimatedSecondsToCompletion: js.UndefOr[Long] = js.undefined
  
  /**
    * The unique identifier of the KMS key used to encrypt the snapshot.
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the namespace the snapshot was created from.
    */
  var namespaceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the namepsace.
    */
  var namespaceName: js.UndefOr[String] = js.undefined
  
  /**
    * The owner Amazon Web Services; account of the snapshot.
    */
  var ownerAccount: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the snapshot.
    */
  var snapshotArn: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp of when the snapshot was created.
    */
  var snapshotCreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the snapshot.
    */
  var snapshotName: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of days until the snapshot is deleted.
    */
  var snapshotRemainingDays: js.UndefOr[Integer] = js.undefined
  
  /**
    * The period of time, in days, of how long the snapshot is retained.
    */
  var snapshotRetentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The timestamp of when data within the snapshot started getting retained.
    */
  var snapshotRetentionStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the snapshot.
    */
  var status: js.UndefOr[SnapshotStatus] = js.undefined
  
  /**
    * The total size, in megabytes, of how big the snapshot is.
    */
  var totalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined
}
object Snapshot {
  
  inline def apply(): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snapshot]
  }
  
  extension [Self <: Snapshot](x: Self) {
    
    inline def setAccountsWithProvisionedRestoreAccess(value: AccountIdList): Self = StObject.set(x, "accountsWithProvisionedRestoreAccess", value.asInstanceOf[js.Any])
    
    inline def setAccountsWithProvisionedRestoreAccessUndefined: Self = StObject.set(x, "accountsWithProvisionedRestoreAccess", js.undefined)
    
    inline def setAccountsWithProvisionedRestoreAccessVarargs(value: String*): Self = StObject.set(x, "accountsWithProvisionedRestoreAccess", js.Array(value*))
    
    inline def setAccountsWithRestoreAccess(value: AccountIdList): Self = StObject.set(x, "accountsWithRestoreAccess", value.asInstanceOf[js.Any])
    
    inline def setAccountsWithRestoreAccessUndefined: Self = StObject.set(x, "accountsWithRestoreAccess", js.undefined)
    
    inline def setAccountsWithRestoreAccessVarargs(value: String*): Self = StObject.set(x, "accountsWithRestoreAccess", js.Array(value*))
    
    inline def setActualIncrementalBackupSizeInMegaBytes(value: Double): Self = StObject.set(x, "actualIncrementalBackupSizeInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setActualIncrementalBackupSizeInMegaBytesUndefined: Self = StObject.set(x, "actualIncrementalBackupSizeInMegaBytes", js.undefined)
    
    inline def setAdminUsername(value: String): Self = StObject.set(x, "adminUsername", value.asInstanceOf[js.Any])
    
    inline def setAdminUsernameUndefined: Self = StObject.set(x, "adminUsername", js.undefined)
    
    inline def setBackupProgressInMegaBytes(value: Double): Self = StObject.set(x, "backupProgressInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setBackupProgressInMegaBytesUndefined: Self = StObject.set(x, "backupProgressInMegaBytes", js.undefined)
    
    inline def setCurrentBackupRateInMegaBytesPerSecond(value: Double): Self = StObject.set(x, "currentBackupRateInMegaBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setCurrentBackupRateInMegaBytesPerSecondUndefined: Self = StObject.set(x, "currentBackupRateInMegaBytesPerSecond", js.undefined)
    
    inline def setElapsedTimeInSeconds(value: Long): Self = StObject.set(x, "elapsedTimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setElapsedTimeInSecondsUndefined: Self = StObject.set(x, "elapsedTimeInSeconds", js.undefined)
    
    inline def setEstimatedSecondsToCompletion(value: Long): Self = StObject.set(x, "estimatedSecondsToCompletion", value.asInstanceOf[js.Any])
    
    inline def setEstimatedSecondsToCompletionUndefined: Self = StObject.set(x, "estimatedSecondsToCompletion", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setNamespaceArn(value: String): Self = StObject.set(x, "namespaceArn", value.asInstanceOf[js.Any])
    
    inline def setNamespaceArnUndefined: Self = StObject.set(x, "namespaceArn", js.undefined)
    
    inline def setNamespaceName(value: String): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    inline def setOwnerAccount(value: String): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
    
    inline def setSnapshotArn(value: String): Self = StObject.set(x, "snapshotArn", value.asInstanceOf[js.Any])
    
    inline def setSnapshotArnUndefined: Self = StObject.set(x, "snapshotArn", js.undefined)
    
    inline def setSnapshotCreateTime(value: js.Date): Self = StObject.set(x, "snapshotCreateTime", value.asInstanceOf[js.Any])
    
    inline def setSnapshotCreateTimeUndefined: Self = StObject.set(x, "snapshotCreateTime", js.undefined)
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNameUndefined: Self = StObject.set(x, "snapshotName", js.undefined)
    
    inline def setSnapshotRemainingDays(value: Integer): Self = StObject.set(x, "snapshotRemainingDays", value.asInstanceOf[js.Any])
    
    inline def setSnapshotRemainingDaysUndefined: Self = StObject.set(x, "snapshotRemainingDays", js.undefined)
    
    inline def setSnapshotRetentionPeriod(value: Integer): Self = StObject.set(x, "snapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "snapshotRetentionPeriod", js.undefined)
    
    inline def setSnapshotRetentionStartTime(value: js.Date): Self = StObject.set(x, "snapshotRetentionStartTime", value.asInstanceOf[js.Any])
    
    inline def setSnapshotRetentionStartTimeUndefined: Self = StObject.set(x, "snapshotRetentionStartTime", js.undefined)
    
    inline def setStatus(value: SnapshotStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTotalBackupSizeInMegaBytes(value: Double): Self = StObject.set(x, "totalBackupSizeInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalBackupSizeInMegaBytesUndefined: Self = StObject.set(x, "totalBackupSizeInMegaBytes", js.undefined)
  }
}
