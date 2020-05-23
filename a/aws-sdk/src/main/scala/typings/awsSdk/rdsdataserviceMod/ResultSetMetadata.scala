package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSetMetadata extends js.Object {
  /**
    * The number of columns in the result set.
    */
  var columnCount: js.UndefOr[Long] = js.native
  /**
    * The metadata of the columns in the result set.
    */
  var columnMetadata: js.UndefOr[Metadata] = js.native
}

object ResultSetMetadata {
  @scala.inline
  def apply(columnCount: js.UndefOr[Long] = js.undefined, columnMetadata: Metadata = null): ResultSetMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnCount)) __obj.updateDynamic("columnCount")(columnCount.get.asInstanceOf[js.Any])
    if (columnMetadata != null) __obj.updateDynamic("columnMetadata")(columnMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSetMetadata]
  }
}

