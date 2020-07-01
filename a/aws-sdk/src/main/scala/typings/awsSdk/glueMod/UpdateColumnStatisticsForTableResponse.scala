package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateColumnStatisticsForTableResponse extends js.Object {
  /**
    * List of ColumnStatisticsErrors.
    */
  var Errors: js.UndefOr[ColumnStatisticsErrors] = js.native
}

object UpdateColumnStatisticsForTableResponse {
  @scala.inline
  def apply(Errors: ColumnStatisticsErrors = null): UpdateColumnStatisticsForTableResponse = {
    val __obj = js.Dynamic.literal()
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateColumnStatisticsForTableResponse]
  }
}

