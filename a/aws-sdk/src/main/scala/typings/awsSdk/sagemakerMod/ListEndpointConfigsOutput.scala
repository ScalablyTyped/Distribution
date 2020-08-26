package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEndpointConfigsOutput extends js.Object {
  /**
    * An array of endpoint configurations.
    */
  var EndpointConfigs: EndpointConfigSummaryList = js.native
  /**
    *  If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of endpoint configurations, use it in the subsequent request 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListEndpointConfigsOutput {
  @scala.inline
  def apply(EndpointConfigs: EndpointConfigSummaryList): ListEndpointConfigsOutput = {
    val __obj = js.Dynamic.literal(EndpointConfigs = EndpointConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointConfigsOutput]
  }
  @scala.inline
  implicit class ListEndpointConfigsOutputOps[Self <: ListEndpointConfigsOutput] (val x: Self) extends AnyVal {
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
    def setEndpointConfigsVarargs(value: EndpointConfigSummary*): Self = this.set("EndpointConfigs", js.Array(value :_*))
    @scala.inline
    def setEndpointConfigs(value: EndpointConfigSummaryList): Self = this.set("EndpointConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

