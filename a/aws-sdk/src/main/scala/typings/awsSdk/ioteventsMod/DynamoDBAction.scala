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
  def apply(
    hashKeyField: DynamoKeyField,
    hashKeyValue: DynamoKeyValue,
    tableName: DynamoTableName,
    hashKeyType: DynamoKeyType = null,
    operation: DynamoOperation = null,
    payload: Payload = null,
    payloadField: DynamoKeyField = null,
    rangeKeyField: DynamoKeyField = null,
    rangeKeyType: DynamoKeyType = null,
    rangeKeyValue: DynamoKeyValue = null
  ): DynamoDBAction = {
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField.asInstanceOf[js.Any], hashKeyValue = hashKeyValue.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    if (hashKeyType != null) __obj.updateDynamic("hashKeyType")(hashKeyType.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (payloadField != null) __obj.updateDynamic("payloadField")(payloadField.asInstanceOf[js.Any])
    if (rangeKeyField != null) __obj.updateDynamic("rangeKeyField")(rangeKeyField.asInstanceOf[js.Any])
    if (rangeKeyType != null) __obj.updateDynamic("rangeKeyType")(rangeKeyType.asInstanceOf[js.Any])
    if (rangeKeyValue != null) __obj.updateDynamic("rangeKeyValue")(rangeKeyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDBAction]
  }
}

