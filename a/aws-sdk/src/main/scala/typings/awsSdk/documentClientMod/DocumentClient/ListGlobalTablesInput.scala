package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGlobalTablesInput extends js.Object {
  /**
    * The first global table name that this operation will evaluate.
    */
  var ExclusiveStartGlobalTableName: js.UndefOr[TableName] = js.native
  /**
    * The maximum number of table names to return, if the parameter is not specified DynamoDB defaults to 100. If the number of global tables DynamoDB finds reaches this limit, it stops the operation and returns the table names collected up to that point, with a table name in the LastEvaluatedGlobalTableName to apply in a subsequent operation to the ExclusiveStartGlobalTableName parameter.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.native
  /**
    * Lists the global tables in a specific Region.
    */
  var RegionName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.RegionName] = js.native
}

object ListGlobalTablesInput {
  @scala.inline
  def apply(
    ExclusiveStartGlobalTableName: TableName = null,
    Limit: js.UndefOr[PositiveIntegerObject] = js.undefined,
    RegionName: RegionName = null
  ): ListGlobalTablesInput = {
    val __obj = js.Dynamic.literal()
    if (ExclusiveStartGlobalTableName != null) __obj.updateDynamic("ExclusiveStartGlobalTableName")(ExclusiveStartGlobalTableName.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGlobalTablesInput]
  }
}

