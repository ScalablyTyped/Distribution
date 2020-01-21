package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultFrame extends js.Object {
  /**
    * The records in the result set.
    */
  var records: js.UndefOr[Records] = js.native
  /**
    * The result-set metadata in the result set.
    */
  var resultSetMetadata: js.UndefOr[ResultSetMetadata] = js.native
}

object ResultFrame {
  @scala.inline
  def apply(records: Records = null, resultSetMetadata: ResultSetMetadata = null): ResultFrame = {
    val __obj = js.Dynamic.literal()
    if (records != null) __obj.updateDynamic("records")(records.asInstanceOf[js.Any])
    if (resultSetMetadata != null) __obj.updateDynamic("resultSetMetadata")(resultSetMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultFrame]
  }
}

