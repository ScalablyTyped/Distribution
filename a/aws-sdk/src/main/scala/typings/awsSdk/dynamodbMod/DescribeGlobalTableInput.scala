package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGlobalTableInput extends js.Object {
  /**
    * The name of the global table.
    */
  var GlobalTableName: TableName = js.native
}

object DescribeGlobalTableInput {
  @scala.inline
  def apply(GlobalTableName: TableName): DescribeGlobalTableInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalTableInput]
  }
}

