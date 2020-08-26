package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchExecuteStatementResponse extends js.Object {
  /**
    * The execution results of each batch entry.
    */
  var updateResults: js.UndefOr[UpdateResults] = js.native
}

object BatchExecuteStatementResponse {
  @scala.inline
  def apply(): BatchExecuteStatementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchExecuteStatementResponse]
  }
  @scala.inline
  implicit class BatchExecuteStatementResponseOps[Self <: BatchExecuteStatementResponse] (val x: Self) extends AnyVal {
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
    def setUpdateResultsVarargs(value: UpdateResult*): Self = this.set("updateResults", js.Array(value :_*))
    @scala.inline
    def setUpdateResults(value: UpdateResults): Self = this.set("updateResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateResults: Self = this.set("updateResults", js.undefined)
  }
  
}

