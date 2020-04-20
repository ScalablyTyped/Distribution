package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDistributionConfigurationResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration that was deleted. 
    */
  var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.native
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object DeleteDistributionConfigurationResponse {
  @scala.inline
  def apply(
    distributionConfigurationArn: DistributionConfigurationArn = null,
    requestId: NonEmptyString = null
  ): DeleteDistributionConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (distributionConfigurationArn != null) __obj.updateDynamic("distributionConfigurationArn")(distributionConfigurationArn.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDistributionConfigurationResponse]
  }
}

