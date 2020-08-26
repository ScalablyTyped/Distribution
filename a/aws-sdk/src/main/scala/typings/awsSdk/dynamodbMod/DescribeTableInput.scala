package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTableInput extends js.Object {
  /**
    * The name of the table to describe.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName = js.native
}

object DescribeTableInput {
  @scala.inline
  def apply(TableName: TableName): DescribeTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableInput]
  }
  @scala.inline
  implicit class DescribeTableInputOps[Self <: DescribeTableInput] (val x: Self) extends AnyVal {
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
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
  }
  
}

