package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamoDBAction extends js.Object {
  /**
    * The name of the hash key (also called the partition key).
    */
  var hashKeyField: DynamoKeyField = js.native
  /**
    * The data type for the hash key (also called the partition key). You can specify the following values:    STRING - The hash key is a string.    NUMBER - The hash key is a number.   If you don't specify hashKeyType, the default value is STRING.
    */
  var hashKeyType: js.UndefOr[DynamoKeyType] = js.native
  /**
    * The value of the hash key (also called the partition key).
    */
  var hashKeyValue: DynamoKeyValue = js.native
  /**
    * The type of operation to perform. You can specify the following values:     INSERT - Insert data as a new item into the DynamoDB table. This item uses the specified hash key as a partition key. If you specified a range key, the item uses the range key as a sort key.    UPDATE - Update an existing item of the DynamoDB table with new data. This item's partition key must match the specified hash key. If you specified a range key, the range key must match the item's sort key.    DELETE - Delete an existing item of the DynamoDB table. This item's partition key must match the specified hash key. If you specified a range key, the range key must match the item's sort key.   If you don't specify this parameter, AWS IoT Events triggers the INSERT operation.
    */
  var operation: js.UndefOr[DynamoOperation] = js.native
  var payload: js.UndefOr[Payload] = js.native
  /**
    * The name of the DynamoDB column that receives the action payload. If you don't specify this parameter, the name of the DynamoDB column is payload.
    */
  var payloadField: js.UndefOr[DynamoKeyField] = js.native
  /**
    * The name of the range key (also called the sort key).
    */
  var rangeKeyField: js.UndefOr[DynamoKeyField] = js.native
  /**
    * The data type for the range key (also called the sort key), You can specify the following values:    STRING - The range key is a string.    NUMBER - The range key is number.   If you don't specify rangeKeyField, the default value is STRING.
    */
  var rangeKeyType: js.UndefOr[DynamoKeyType] = js.native
  /**
    * The value of the range key (also called the sort key).
    */
  var rangeKeyValue: js.UndefOr[DynamoKeyValue] = js.native
  /**
    * The name of the DynamoDB table.
    */
  var tableName: DynamoTableName = js.native
}

object DynamoDBAction {
  @scala.inline
  def apply(hashKeyField: DynamoKeyField, hashKeyValue: DynamoKeyValue, tableName: DynamoTableName): DynamoDBAction = {
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField.asInstanceOf[js.Any], hashKeyValue = hashKeyValue.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDBAction]
  }
  @scala.inline
  implicit class DynamoDBActionOps[Self <: DynamoDBAction] (val x: Self) extends AnyVal {
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
    def setHashKeyField(value: DynamoKeyField): Self = this.set("hashKeyField", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashKeyValue(value: DynamoKeyValue): Self = this.set("hashKeyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableName(value: DynamoTableName): Self = this.set("tableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashKeyType(value: DynamoKeyType): Self = this.set("hashKeyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashKeyType: Self = this.set("hashKeyType", js.undefined)
    @scala.inline
    def setOperation(value: DynamoOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setPayloadField(value: DynamoKeyField): Self = this.set("payloadField", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayloadField: Self = this.set("payloadField", js.undefined)
    @scala.inline
    def setRangeKeyField(value: DynamoKeyField): Self = this.set("rangeKeyField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeKeyField: Self = this.set("rangeKeyField", js.undefined)
    @scala.inline
    def setRangeKeyType(value: DynamoKeyType): Self = this.set("rangeKeyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeKeyType: Self = this.set("rangeKeyType", js.undefined)
    @scala.inline
    def setRangeKeyValue(value: DynamoKeyValue): Self = this.set("rangeKeyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeKeyValue: Self = this.set("rangeKeyValue", js.undefined)
  }
  
}

