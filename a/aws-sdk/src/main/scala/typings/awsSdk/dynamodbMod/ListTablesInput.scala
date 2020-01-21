package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTablesInput extends js.Object {
  /**
    * The first table name that this operation will evaluate. Use the value that was returned for LastEvaluatedTableName in a previous operation, so that you can obtain the next page of results.
    */
  var ExclusiveStartTableName: js.UndefOr[TableName] = js.native
  /**
    * A maximum number of table names to return. If this parameter is not specified, the limit is 100.
    */
  var Limit: js.UndefOr[ListTablesInputLimit] = js.native
}

object ListTablesInput {
  @scala.inline
  def apply(ExclusiveStartTableName: TableName = null, Limit: Int | scala.Double = null): ListTablesInput = {
    val __obj = js.Dynamic.literal()
    if (ExclusiveStartTableName != null) __obj.updateDynamic("ExclusiveStartTableName")(ExclusiveStartTableName.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTablesInput]
  }
}

