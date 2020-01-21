package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlStatementResult extends js.Object {
  /**
    * The number of records updated by a SQL statement.
    */
  var numberOfRecordsUpdated: js.UndefOr[RecordsUpdated] = js.native
  /**
    * The result set of the SQL statement.
    */
  var resultFrame: js.UndefOr[ResultFrame] = js.native
}

object SqlStatementResult {
  @scala.inline
  def apply(numberOfRecordsUpdated: Int | Double = null, resultFrame: ResultFrame = null): SqlStatementResult = {
    val __obj = js.Dynamic.literal()
    if (numberOfRecordsUpdated != null) __obj.updateDynamic("numberOfRecordsUpdated")(numberOfRecordsUpdated.asInstanceOf[js.Any])
    if (resultFrame != null) __obj.updateDynamic("resultFrame")(resultFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlStatementResult]
  }
}

