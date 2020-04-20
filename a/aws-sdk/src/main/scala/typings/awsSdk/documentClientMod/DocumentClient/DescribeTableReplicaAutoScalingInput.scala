package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTableReplicaAutoScalingInput extends js.Object {
  /**
    * The name of the table.
    */
  var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
}

object DescribeTableReplicaAutoScalingInput {
  @scala.inline
  def apply(TableName: TableName): DescribeTableReplicaAutoScalingInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableReplicaAutoScalingInput]
  }
}

