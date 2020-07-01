package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateColumnStatisticsForPartitionResponse extends js.Object {
  /**
    * Error occurred during updating column statistics data.
    */
  var Errors: js.UndefOr[ColumnStatisticsErrors] = js.native
}

object UpdateColumnStatisticsForPartitionResponse {
  @scala.inline
  def apply(Errors: ColumnStatisticsErrors = null): UpdateColumnStatisticsForPartitionResponse = {
    val __obj = js.Dynamic.literal()
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateColumnStatisticsForPartitionResponse]
  }
}

