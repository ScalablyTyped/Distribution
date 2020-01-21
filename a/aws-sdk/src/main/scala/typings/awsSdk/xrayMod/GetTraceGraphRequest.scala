package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTraceGraphRequest extends js.Object {
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Trace IDs of requests for which to generate a service graph.
    */
  var TraceIds: TraceIdList = js.native
}

object GetTraceGraphRequest {
  @scala.inline
  def apply(TraceIds: TraceIdList, NextToken: String = null): GetTraceGraphRequest = {
    val __obj = js.Dynamic.literal(TraceIds = TraceIds.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTraceGraphRequest]
  }
}

