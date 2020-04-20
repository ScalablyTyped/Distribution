package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTimeToLiveInput extends js.Object {
  /**
    * The name of the table to be configured.
    */
  var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  /**
    * Represents the settings used to enable or disable Time to Live for the specified table.
    */
  var TimeToLiveSpecification: typings.awsSdk.documentClientMod.DocumentClient.TimeToLiveSpecification = js.native
}

object UpdateTimeToLiveInput {
  @scala.inline
  def apply(TableName: TableName, TimeToLiveSpecification: TimeToLiveSpecification): UpdateTimeToLiveInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any], TimeToLiveSpecification = TimeToLiveSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTimeToLiveInput]
  }
}

