package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Get extends js.Object {
  /**
    * One or more substitution tokens for attribute names in the ProjectionExpression parameter.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
  /**
    * A map of attribute names to AttributeValue objects that specifies the primary key of the item to retrieve.
    */
  var Key: typings.awsSdk.dynamodbMod.Key = js.native
  /**
    * A string that identifies one or more attributes of the specified item to retrieve from the table. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes of the specified item are returned. If any of the requested attributes are not found, they do not appear in the result.
    */
  var ProjectionExpression: js.UndefOr[typings.awsSdk.dynamodbMod.ProjectionExpression] = js.native
  /**
    * The name of the table from which to retrieve the specified item.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName = js.native
}

object Get {
  @scala.inline
  def apply(Key: Key, TableName: TableName): Get = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Get]
  }
  @scala.inline
  implicit class GetOps[Self <: Get] (val x: Self) extends AnyVal {
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
    def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = this.set("ExpressionAttributeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressionAttributeNames: Self = this.set("ExpressionAttributeNames", js.undefined)
    @scala.inline
    def setProjectionExpression(value: ProjectionExpression): Self = this.set("ProjectionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectionExpression: Self = this.set("ProjectionExpression", js.undefined)
  }
  
}

