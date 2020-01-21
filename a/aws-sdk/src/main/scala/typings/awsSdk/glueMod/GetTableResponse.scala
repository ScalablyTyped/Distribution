package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableResponse extends js.Object {
  /**
    * The Table object that defines the specified table.
    */
  var Table: js.UndefOr[typings.awsSdk.glueMod.Table] = js.native
}

object GetTableResponse {
  @scala.inline
  def apply(Table: Table = null): GetTableResponse = {
    val __obj = js.Dynamic.literal()
    if (Table != null) __obj.updateDynamic("Table")(Table.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableResponse]
  }
}

