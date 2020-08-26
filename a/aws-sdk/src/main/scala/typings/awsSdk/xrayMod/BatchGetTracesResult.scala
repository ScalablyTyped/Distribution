package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetTracesResult extends js.Object {
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Full traces for the specified requests.
    */
  var Traces: js.UndefOr[TraceList] = js.native
  /**
    * Trace IDs of requests that haven't been processed.
    */
  var UnprocessedTraceIds: js.UndefOr[UnprocessedTraceIdList] = js.native
}

object BatchGetTracesResult {
  @scala.inline
  def apply(): BatchGetTracesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetTracesResult]
  }
  @scala.inline
  implicit class BatchGetTracesResultOps[Self <: BatchGetTracesResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTracesVarargs(value: Trace*): Self = this.set("Traces", js.Array(value :_*))
    @scala.inline
    def setTraces(value: TraceList): Self = this.set("Traces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraces: Self = this.set("Traces", js.undefined)
    @scala.inline
    def setUnprocessedTraceIdsVarargs(value: TraceId*): Self = this.set("UnprocessedTraceIds", js.Array(value :_*))
    @scala.inline
    def setUnprocessedTraceIds(value: UnprocessedTraceIdList): Self = this.set("UnprocessedTraceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnprocessedTraceIds: Self = this.set("UnprocessedTraceIds", js.undefined)
  }
  
}

