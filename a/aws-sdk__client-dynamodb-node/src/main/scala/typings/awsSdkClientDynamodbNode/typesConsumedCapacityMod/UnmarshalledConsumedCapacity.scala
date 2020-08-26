package typings.awsSdkClientDynamodbNode.typesConsumedCapacityMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbNode.typesCapacityMod.UnmarshalledCapacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledConsumedCapacity extends ConsumedCapacity {
  /**
    * <p>The amount of throughput consumed on each global index affected by the operation.</p>
    */
  @JSName("GlobalSecondaryIndexes")
  var GlobalSecondaryIndexes_UnmarshalledConsumedCapacity: js.UndefOr[StringDictionary[UnmarshalledCapacity]] = js.native
  /**
    * <p>The amount of throughput consumed on each local index affected by the operation.</p>
    */
  @JSName("LocalSecondaryIndexes")
  var LocalSecondaryIndexes_UnmarshalledConsumedCapacity: js.UndefOr[StringDictionary[UnmarshalledCapacity]] = js.native
  /**
    * <p>The amount of throughput consumed on the table affected by the operation.</p>
    */
  @JSName("Table")
  var Table_UnmarshalledConsumedCapacity: js.UndefOr[UnmarshalledCapacity] = js.native
}

object UnmarshalledConsumedCapacity {
  @scala.inline
  def apply(): UnmarshalledConsumedCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledConsumedCapacity]
  }
  @scala.inline
  implicit class UnmarshalledConsumedCapacityOps[Self <: UnmarshalledConsumedCapacity] (val x: Self) extends AnyVal {
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
    def setGlobalSecondaryIndexes(value: StringDictionary[UnmarshalledCapacity]): Self = this.set("GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalSecondaryIndexes: Self = this.set("GlobalSecondaryIndexes", js.undefined)
    @scala.inline
    def setLocalSecondaryIndexes(value: StringDictionary[UnmarshalledCapacity]): Self = this.set("LocalSecondaryIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalSecondaryIndexes: Self = this.set("LocalSecondaryIndexes", js.undefined)
    @scala.inline
    def setTable(value: UnmarshalledCapacity): Self = this.set("Table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("Table", js.undefined)
  }
  
}

