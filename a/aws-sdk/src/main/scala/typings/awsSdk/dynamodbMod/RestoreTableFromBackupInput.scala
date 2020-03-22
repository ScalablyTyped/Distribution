package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreTableFromBackupInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) associated with the backup.
    */
  var BackupArn: typings.awsSdk.dynamodbMod.BackupArn = js.native
  /**
    * The billing mode of the restored table.
    */
  var BillingModeOverride: js.UndefOr[BillingMode] = js.native
  /**
    * List of global secondary indexes for the restored table. The indexes provided should match existing secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
    */
  var GlobalSecondaryIndexOverride: js.UndefOr[GlobalSecondaryIndexList] = js.native
  /**
    * List of local secondary indexes for the restored table. The indexes provided should match existing secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
    */
  var LocalSecondaryIndexOverride: js.UndefOr[LocalSecondaryIndexList] = js.native
  /**
    * Provisioned throughput settings for the restored table.
    */
  var ProvisionedThroughputOverride: js.UndefOr[ProvisionedThroughput] = js.native
  /**
    * The new server-side encryption settings for the restored table.
    */
  var SSESpecificationOverride: js.UndefOr[SSESpecification] = js.native
  /**
    * The name of the new table to which the backup must be restored.
    */
  var TargetTableName: TableName = js.native
}

object RestoreTableFromBackupInput {
  @scala.inline
  def apply(
    BackupArn: BackupArn,
    TargetTableName: TableName,
    BillingModeOverride: BillingMode = null,
    GlobalSecondaryIndexOverride: GlobalSecondaryIndexList = null,
    LocalSecondaryIndexOverride: LocalSecondaryIndexList = null,
    ProvisionedThroughputOverride: ProvisionedThroughput = null,
    SSESpecificationOverride: SSESpecification = null
  ): RestoreTableFromBackupInput = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
    if (BillingModeOverride != null) __obj.updateDynamic("BillingModeOverride")(BillingModeOverride.asInstanceOf[js.Any])
    if (GlobalSecondaryIndexOverride != null) __obj.updateDynamic("GlobalSecondaryIndexOverride")(GlobalSecondaryIndexOverride.asInstanceOf[js.Any])
    if (LocalSecondaryIndexOverride != null) __obj.updateDynamic("LocalSecondaryIndexOverride")(LocalSecondaryIndexOverride.asInstanceOf[js.Any])
    if (ProvisionedThroughputOverride != null) __obj.updateDynamic("ProvisionedThroughputOverride")(ProvisionedThroughputOverride.asInstanceOf[js.Any])
    if (SSESpecificationOverride != null) __obj.updateDynamic("SSESpecificationOverride")(SSESpecificationOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableFromBackupInput]
  }
}

