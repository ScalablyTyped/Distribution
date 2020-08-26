package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEndpointsOutput extends js.Object {
  /**
    *  An array or endpoint objects. 
    */
  var Endpoints: EndpointSummaryList = js.native
  /**
    *  If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use it in the subsequent request. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListEndpointsOutput {
  @scala.inline
  def apply(Endpoints: EndpointSummaryList): ListEndpointsOutput = {
    val __obj = js.Dynamic.literal(Endpoints = Endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointsOutput]
  }
  @scala.inline
  implicit class ListEndpointsOutputOps[Self <: ListEndpointsOutput] (val x: Self) extends AnyVal {
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
    def setEndpointsVarargs(value: EndpointSummary*): Self = this.set("Endpoints", js.Array(value :_*))
    @scala.inline
    def setEndpoints(value: EndpointSummaryList): Self = this.set("Endpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

