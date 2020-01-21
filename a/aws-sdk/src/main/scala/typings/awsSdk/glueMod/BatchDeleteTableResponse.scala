package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteTableResponse extends js.Object {
  /**
    * A list of errors encountered in attempting to delete the specified tables.
    */
  var Errors: js.UndefOr[TableErrors] = js.native
}

object BatchDeleteTableResponse {
  @scala.inline
  def apply(Errors: TableErrors = null): BatchDeleteTableResponse = {
    val __obj = js.Dynamic.literal()
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteTableResponse]
  }
}

