package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumedCapacity extends js.Object {
  /**
    * The total number of capacity units consumed by the operation.
    */
  var CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
  /**
    * The amount of throughput consumed on each global index affected by the operation.
    */
  var GlobalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.native
  /**
    * The amount of throughput consumed on each local index affected by the operation.
    */
  var LocalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.native
  /**
    * The total number of read capacity units consumed by the operation.
    */
  var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
  /**
    * The amount of throughput consumed on the table affected by the operation.
    */
  var Table: js.UndefOr[Capacity] = js.native
  /**
    * The name of the table that was affected by the operation.
    */
  var TableName: js.UndefOr[typings.awsSdk.dynamodbMod.TableName] = js.native
  /**
    * The total number of write capacity units consumed by the operation.
    */
  var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
}

object ConsumedCapacity {
  @scala.inline
  def apply(
    CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined,
    GlobalSecondaryIndexes: SecondaryIndexesCapacityMap = null,
    LocalSecondaryIndexes: SecondaryIndexesCapacityMap = null,
    ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined,
    Table: Capacity = null,
    TableName: TableName = null,
    WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
  ): ConsumedCapacity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CapacityUnits)) __obj.updateDynamic("CapacityUnits")(CapacityUnits.get.asInstanceOf[js.Any])
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes.asInstanceOf[js.Any])
    if (LocalSecondaryIndexes != null) __obj.updateDynamic("LocalSecondaryIndexes")(LocalSecondaryIndexes.asInstanceOf[js.Any])
    if (!js.isUndefined(ReadCapacityUnits)) __obj.updateDynamic("ReadCapacityUnits")(ReadCapacityUnits.get.asInstanceOf[js.Any])
    if (Table != null) __obj.updateDynamic("Table")(Table.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    if (!js.isUndefined(WriteCapacityUnits)) __obj.updateDynamic("WriteCapacityUnits")(WriteCapacityUnits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumedCapacity]
  }
}

