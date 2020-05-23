package typings.awsSdkClientDynamodbBrowser.typesConsumedCapacityMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.typesCapacityMod.Capacity
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumedCapacity extends js.Object {
  /**
    * <p>The total number of capacity units consumed by the operation.</p>
    */
  var CapacityUnits: js.UndefOr[Double] = js.undefined
  /**
    * <p>The amount of throughput consumed on each global index affected by the operation.</p>
    */
  var GlobalSecondaryIndexes: js.UndefOr[StringDictionary[Capacity] | (Iterable[js.Tuple2[String, Capacity]])] = js.undefined
  /**
    * <p>The amount of throughput consumed on each local index affected by the operation.</p>
    */
  var LocalSecondaryIndexes: js.UndefOr[StringDictionary[Capacity] | (Iterable[js.Tuple2[String, Capacity]])] = js.undefined
  /**
    * <p>The amount of throughput consumed on the table affected by the operation.</p>
    */
  var Table: js.UndefOr[Capacity] = js.undefined
  /**
    * <p>The name of the table that was affected by the operation.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}

object ConsumedCapacity {
  @scala.inline
  def apply(
    CapacityUnits: js.UndefOr[Double] = js.undefined,
    GlobalSecondaryIndexes: StringDictionary[Capacity] | (Iterable[js.Tuple2[String, Capacity]]) = null,
    LocalSecondaryIndexes: StringDictionary[Capacity] | (Iterable[js.Tuple2[String, Capacity]]) = null,
    Table: Capacity = null,
    TableName: String = null
  ): ConsumedCapacity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CapacityUnits)) __obj.updateDynamic("CapacityUnits")(CapacityUnits.get.asInstanceOf[js.Any])
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes.asInstanceOf[js.Any])
    if (LocalSecondaryIndexes != null) __obj.updateDynamic("LocalSecondaryIndexes")(LocalSecondaryIndexes.asInstanceOf[js.Any])
    if (Table != null) __obj.updateDynamic("Table")(Table.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumedCapacity]
  }
}

