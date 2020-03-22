package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreTableToPointInTimeInput extends js.Object {
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
    * Time in the past to restore the table to.
    */
  var RestoreDateTime: js.UndefOr[Date] = js.native
  /**
    * The new server-side encryption settings for the restored table.
    */
  var SSESpecificationOverride: js.UndefOr[SSESpecification] = js.native
  /**
    * The DynamoDB table that will be restored. This value is an Amazon Resource Name (ARN).
    */
  var SourceTableArn: js.UndefOr[TableArn] = js.native
  /**
    * Name of the source table that is being restored.
    */
  var SourceTableName: js.UndefOr[TableName] = js.native
  /**
    * The name of the new table to which it must be restored to.
    */
  var TargetTableName: TableName = js.native
  /**
    * Restore the table to the latest possible time. LatestRestorableDateTime is typically 5 minutes before the current time. 
    */
  var UseLatestRestorableTime: js.UndefOr[BooleanObject] = js.native
}

object RestoreTableToPointInTimeInput {
  @scala.inline
  def apply(
    TargetTableName: TableName,
    BillingModeOverride: BillingMode = null,
    GlobalSecondaryIndexOverride: GlobalSecondaryIndexList = null,
    LocalSecondaryIndexOverride: LocalSecondaryIndexList = null,
    ProvisionedThroughputOverride: ProvisionedThroughput = null,
    RestoreDateTime: Date = null,
    SSESpecificationOverride: SSESpecification = null,
    SourceTableArn: TableArn = null,
    SourceTableName: TableName = null,
    UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined
  ): RestoreTableToPointInTimeInput = {
    val __obj = js.Dynamic.literal(TargetTableName = TargetTableName.asInstanceOf[js.Any])
    if (BillingModeOverride != null) __obj.updateDynamic("BillingModeOverride")(BillingModeOverride.asInstanceOf[js.Any])
    if (GlobalSecondaryIndexOverride != null) __obj.updateDynamic("GlobalSecondaryIndexOverride")(GlobalSecondaryIndexOverride.asInstanceOf[js.Any])
    if (LocalSecondaryIndexOverride != null) __obj.updateDynamic("LocalSecondaryIndexOverride")(LocalSecondaryIndexOverride.asInstanceOf[js.Any])
    if (ProvisionedThroughputOverride != null) __obj.updateDynamic("ProvisionedThroughputOverride")(ProvisionedThroughputOverride.asInstanceOf[js.Any])
    if (RestoreDateTime != null) __obj.updateDynamic("RestoreDateTime")(RestoreDateTime.asInstanceOf[js.Any])
    if (SSESpecificationOverride != null) __obj.updateDynamic("SSESpecificationOverride")(SSESpecificationOverride.asInstanceOf[js.Any])
    if (SourceTableArn != null) __obj.updateDynamic("SourceTableArn")(SourceTableArn.asInstanceOf[js.Any])
    if (SourceTableName != null) __obj.updateDynamic("SourceTableName")(SourceTableName.asInstanceOf[js.Any])
    if (!js.isUndefined(UseLatestRestorableTime)) __obj.updateDynamic("UseLatestRestorableTime")(UseLatestRestorableTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableToPointInTimeInput]
  }
}

