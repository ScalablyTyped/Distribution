package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateContinuousBackupsInput extends js.Object {
  /**
    * Represents the settings used to enable point in time recovery.
    */
  var PointInTimeRecoverySpecification: typings.awsSdk.documentClientMod.DocumentClient.PointInTimeRecoverySpecification = js.native
  /**
    * The name of the table.
    */
  var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
}

object UpdateContinuousBackupsInput {
  @scala.inline
  def apply(PointInTimeRecoverySpecification: PointInTimeRecoverySpecification, TableName: TableName): UpdateContinuousBackupsInput = {
    val __obj = js.Dynamic.literal(PointInTimeRecoverySpecification = PointInTimeRecoverySpecification.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContinuousBackupsInput]
  }
}

