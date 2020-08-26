package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Update extends js.Object {
  /**
    * A condition that must be satisfied in order for a conditional update to succeed.
    */
  var ConditionExpression: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConditionExpression] = js.native
  /**
    * One or more substitution tokens for attribute names in an expression.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
  /**
    * One or more values that can be substituted in an expression.
    */
  var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
  /**
    * The primary key of the item to be updated. Each element consists of an attribute name and a value for that attribute.
    */
  var Key: typings.awsSdk.documentClientMod.DocumentClient.Key = js.native
  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Update condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW.
    */
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[
    typings.awsSdk.documentClientMod.DocumentClient.ReturnValuesOnConditionCheckFailure
  ] = js.native
  /**
    * Name of the table for the UpdateItem request.
    */
  var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  /**
    * An expression that defines one or more attributes to be updated, the action to be performed on them, and new value(s) for them.
    */
  var UpdateExpression: typings.awsSdk.documentClientMod.DocumentClient.UpdateExpression = js.native
}

object Update {
  @scala.inline
  def apply(Key: Key, TableName: TableName, UpdateExpression: UpdateExpression): Update = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any], UpdateExpression = UpdateExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
  @scala.inline
  implicit class UpdateOps[Self <: Update] (val x: Self) extends AnyVal {
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
    def setKey(value: Key): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateExpression(value: UpdateExpression): Self = this.set("UpdateExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditionExpression(value: ConditionExpression): Self = this.set("ConditionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionExpression: Self = this.set("ConditionExpression", js.undefined)
    @scala.inline
    def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = this.set("ExpressionAttributeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressionAttributeNames: Self = this.set("ExpressionAttributeNames", js.undefined)
    @scala.inline
    def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = this.set("ExpressionAttributeValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressionAttributeValues: Self = this.set("ExpressionAttributeValues", js.undefined)
    @scala.inline
    def setReturnValuesOnConditionCheckFailure(value: ReturnValuesOnConditionCheckFailure): Self = this.set("ReturnValuesOnConditionCheckFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnValuesOnConditionCheckFailure: Self = this.set("ReturnValuesOnConditionCheckFailure", js.undefined)
  }
  
}

