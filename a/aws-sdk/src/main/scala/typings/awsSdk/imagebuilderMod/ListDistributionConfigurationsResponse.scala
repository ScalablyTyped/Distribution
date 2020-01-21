package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDistributionConfigurationsResponse extends js.Object {
  /**
    *  The list of distributions. 
    */
  var distributionConfigurationSummaryList: js.UndefOr[DistributionConfigurationSummaryList] = js.native
  /**
    *  The next token used for paginated responses. When this is not empty then there are additional elements that the service that not include in this request. Use this token with the next request to retrieve additional object. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object ListDistributionConfigurationsResponse {
  @scala.inline
  def apply(
    distributionConfigurationSummaryList: DistributionConfigurationSummaryList = null,
    nextToken: NonEmptyString = null,
    requestId: NonEmptyString = null
  ): ListDistributionConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (distributionConfigurationSummaryList != null) __obj.updateDynamic("distributionConfigurationSummaryList")(distributionConfigurationSummaryList.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDistributionConfigurationsResponse]
  }
}

