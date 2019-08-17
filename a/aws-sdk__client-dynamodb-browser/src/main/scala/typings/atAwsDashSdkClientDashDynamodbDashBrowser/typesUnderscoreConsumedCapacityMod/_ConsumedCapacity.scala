package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreConsumedCapacityMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreCapacityMod._Capacity
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ConsumedCapacity extends js.Object {
  /**
    * <p>The total number of capacity units consumed by the operation.</p>
    */
  var CapacityUnits: js.UndefOr[Double] = js.undefined
  /**
    * <p>The amount of throughput consumed on each global index affected by the operation.</p>
    */
  var GlobalSecondaryIndexes: js.UndefOr[StringDictionary[_Capacity] | (Iterable[js.Tuple2[String, _Capacity]])] = js.undefined
  /**
    * <p>The amount of throughput consumed on each local index affected by the operation.</p>
    */
  var LocalSecondaryIndexes: js.UndefOr[StringDictionary[_Capacity] | (Iterable[js.Tuple2[String, _Capacity]])] = js.undefined
  /**
    * <p>The amount of throughput consumed on the table affected by the operation.</p>
    */
  var Table: js.UndefOr[_Capacity] = js.undefined
  /**
    * <p>The name of the table that was affected by the operation.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}

object _ConsumedCapacity {
  @scala.inline
  def apply(
    CapacityUnits: Int | Double = null,
    GlobalSecondaryIndexes: StringDictionary[_Capacity] | (Iterable[js.Tuple2[String, _Capacity]]) = null,
    LocalSecondaryIndexes: StringDictionary[_Capacity] | (Iterable[js.Tuple2[String, _Capacity]]) = null,
    Table: _Capacity = null,
    TableName: String = null
  ): _ConsumedCapacity = {
    val __obj = js.Dynamic.literal()
    if (CapacityUnits != null) __obj.updateDynamic("CapacityUnits")(CapacityUnits.asInstanceOf[js.Any])
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes.asInstanceOf[js.Any])
    if (LocalSecondaryIndexes != null) __obj.updateDynamic("LocalSecondaryIndexes")(LocalSecondaryIndexes.asInstanceOf[js.Any])
    if (Table != null) __obj.updateDynamic("Table")(Table)
    if (TableName != null) __obj.updateDynamic("TableName")(TableName)
    __obj.asInstanceOf[_ConsumedCapacity]
  }
}

