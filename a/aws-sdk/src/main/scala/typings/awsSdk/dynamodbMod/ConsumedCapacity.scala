package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapacityUnits(value: ConsumedCapacityUnits): Self = this.set("CapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityUnits: Self = this.set("CapacityUnits", js.undefined)
    
    @scala.inline
    def setGlobalSecondaryIndexes(value: SecondaryIndexesCapacityMap): Self = this.set("GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalSecondaryIndexes: Self = this.set("GlobalSecondaryIndexes", js.undefined)
    
    @scala.inline
    def setLocalSecondaryIndexes(value: SecondaryIndexesCapacityMap): Self = this.set("LocalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalSecondaryIndexes: Self = this.set("LocalSecondaryIndexes", js.undefined)
    
    @scala.inline
    def setReadCapacityUnits(value: ConsumedCapacityUnits): Self = this.set("ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadCapacityUnits: Self = this.set("ReadCapacityUnits", js.undefined)
    
    @scala.inline
    def setTable(value: Capacity): Self = this.set("Table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("Table", js.undefined)
    
    @scala.inline
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
    
    @scala.inline
    def setWriteCapacityUnits(value: ConsumedCapacityUnits): Self = this.set("WriteCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteCapacityUnits: Self = this.set("WriteCapacityUnits", js.undefined)
  }
}
