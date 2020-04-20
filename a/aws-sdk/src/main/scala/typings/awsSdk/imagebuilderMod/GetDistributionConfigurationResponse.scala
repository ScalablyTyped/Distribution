package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDistributionConfigurationResponse extends js.Object {
  /**
    * The distribution configuration object. 
    */
  var distributionConfiguration: js.UndefOr[DistributionConfiguration] = js.native
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object GetDistributionConfigurationResponse {
  @scala.inline
  def apply(distributionConfiguration: DistributionConfiguration = null, requestId: NonEmptyString = null): GetDistributionConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (distributionConfiguration != null) __obj.updateDynamic("distributionConfiguration")(distributionConfiguration.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDistributionConfigurationResponse]
  }
}

