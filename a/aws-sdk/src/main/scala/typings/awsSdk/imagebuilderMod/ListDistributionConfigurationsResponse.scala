package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDistributionConfigurationsResponse extends js.Object {
  /**
    * The list of distributions. 
    */
  var distributionConfigurationSummaryList: js.UndefOr[DistributionConfigurationSummaryList] = js.native
  /**
    * The next token used for paginated responses. When this is not empty, there are additional elements that the service has not included in this request. Use this token with the next request to retrieve additional objects. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object ListDistributionConfigurationsResponse {
  @scala.inline
  def apply(): ListDistributionConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionConfigurationsResponse]
  }
  @scala.inline
  implicit class ListDistributionConfigurationsResponseOps[Self <: ListDistributionConfigurationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDistributionConfigurationSummaryListVarargs(value: DistributionConfigurationSummary*): Self = this.set("distributionConfigurationSummaryList", js.Array(value :_*))
    @scala.inline
    def setDistributionConfigurationSummaryList(value: DistributionConfigurationSummaryList): Self = this.set("distributionConfigurationSummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistributionConfigurationSummaryList: Self = this.set("distributionConfigurationSummaryList", js.undefined)
    @scala.inline
    def setNextToken(value: NonEmptyString): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
  
}

