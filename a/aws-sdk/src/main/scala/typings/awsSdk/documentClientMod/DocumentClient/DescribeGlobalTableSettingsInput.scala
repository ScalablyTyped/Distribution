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
  @scala.inline
  implicit class DescribeGlobalTableSettingsInputOps[Self <: DescribeGlobalTableSettingsInput] (val x: Self) extends AnyVal {
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
    def setGlobalTableName(value: TableName): Self = this.set("GlobalTableName", value.asInstanceOf[js.Any])
  }
  
}

