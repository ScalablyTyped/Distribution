package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTableOutput extends js.Object {
  /**
    * The properties of the table.
    */
  var Table: js.UndefOr[TableDescription] = js.native
}

object DescribeTableOutput {
  @scala.inline
  def apply(Table: TableDescription = null): DescribeTableOutput = {
    val __obj = js.Dynamic.literal()
    if (Table != null) __obj.updateDynamic("Table")(Table.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableOutput]
  }
}

