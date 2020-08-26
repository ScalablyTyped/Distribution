package typings.awsSdkClientDynamodbBrowser.typesConsumedCapacityMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.typesCapacityMod.Capacity
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumedCapacity extends js.Object {
  /**
    * <p>The total number of capacity units consumed by the operation.</p>
    */
  var CapacityUnits: js.UndefOr[Double] = js.native
  /**
    * <p>The amount of throughput consumed on each global index affected by the operation.</p>
    */
  var GlobalSecondaryIndexes: js.UndefOr[StringDictionary[Capacity] | (Iterable[js.Tuple2[String, Capacity]])] = js.native
  /**
    * <p>The amount of throughput consumed on each local index affected by the operation.</p>
    */
  var LocalSecondaryIndexes: js.UndefOr[StringDictionary[Capacity] | (Iterable[js.Tuple2[String, Capacity]])] = js.native
  /**
    * <p>The amount of throughput consumed on the table affected by the operation.</p>
    */
  var Table: js.UndefOr[Capacity] = js.native
  /**
    * <p>The name of the table that was affected by the operation.</p>
    */
  var TableName: js.UndefOr[String] = js.native
}

object ConsumedCapacity {
  @scala.inline
  def apply(): ConsumedCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumedCapacity]
  }
  @scala.inline
  implicit class ConsumedCapacityOps[Self <: ConsumedCapacity] (val x: Self) extends AnyVal {
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
    def setCapacityUnits(value: Double): Self = this.set("CapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityUnits: Self = this.set("CapacityUnits", js.undefined)
    @scala.inline
    def setGlobalSecondaryIndexes(value: StringDictionary[Capacity] | (Iterable[js.Tuple2[String, Capacity]])): Self = this.set("GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalSecondaryIndexes: Self = this.set("GlobalSecondaryIndexes", js.undefined)
    @scala.inline
    def setLocalSecondaryIndexes(value: StringDictionary[Capacity] | (Iterable[js.Tuple2[String, Capacity]])): Self = this.set("LocalSecondaryIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalSecondaryIndexes: Self = this.set("LocalSecondaryIndexes", js.undefined)
    @scala.inline
    def setTable(value: Capacity): Self = this.set("Table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("Table", js.undefined)
    @scala.inline
    def setTableName(value: String): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
  }
  
}

