package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContinuousBackupsInput extends js.Object {
  /**
    * Name of the table for which the customer wants to check the continuous backups and point in time recovery settings.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName = js.native
}

object DescribeContinuousBackupsInput {
  @scala.inline
  def apply(TableName: TableName): DescribeContinuousBackupsInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContinuousBackupsInput]
  }
}

