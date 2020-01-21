package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGlobalTableSettingsInput extends js.Object {
  /**
    * The name of the global table to describe.
    */
  var GlobalTableName: TableName = js.native
}

object DescribeGlobalTableSettingsInput {
  @scala.inline
  def apply(GlobalTableName: TableName): DescribeGlobalTableSettingsInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeGlobalTableSettingsInput]
  }
}

