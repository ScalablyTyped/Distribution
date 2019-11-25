package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreConsumedCapacityMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreCapacityMod._UnmarshalledCapacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledConsumedCapacity extends _ConsumedCapacity {
  /**
    * <p>The amount of throughput consumed on each global index affected by the operation.</p>
    */
  @JSName("GlobalSecondaryIndexes")
  var GlobalSecondaryIndexes__UnmarshalledConsumedCapacity: js.UndefOr[StringDictionary[_UnmarshalledCapacity]] = js.undefined
  /**
    * <p>The amount of throughput consumed on each local index affected by the operation.</p>
    */
  @JSName("LocalSecondaryIndexes")
  var LocalSecondaryIndexes__UnmarshalledConsumedCapacity: js.UndefOr[StringDictionary[_UnmarshalledCapacity]] = js.undefined
  /**
    * <p>The amount of throughput consumed on the table affected by the operation.</p>
    */
  @JSName("Table")
  var Table__UnmarshalledConsumedCapacity: js.UndefOr[_UnmarshalledCapacity] = js.undefined
}

object _UnmarshalledConsumedCapacity {
  @scala.inline
  def apply(
    CapacityUnits: Int | Double = null,
    GlobalSecondaryIndexes: StringDictionary[_UnmarshalledCapacity] = null,
    LocalSecondaryIndexes: StringDictionary[_UnmarshalledCapacity] = null,
    Table: _UnmarshalledCapacity = null,
    TableName: String = null
  ): _UnmarshalledConsumedCapacity = {
    val __obj = js.Dynamic.literal()
    if (CapacityUnits != null) __obj.updateDynamic("CapacityUnits")(CapacityUnits.asInstanceOf[js.Any])
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes.asInstanceOf[js.Any])
    if (LocalSecondaryIndexes != null) __obj.updateDynamic("LocalSecondaryIndexes")(LocalSecondaryIndexes.asInstanceOf[js.Any])
    if (Table != null) __obj.updateDynamic("Table")(Table.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledConsumedCapacity]
  }
}

