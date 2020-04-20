package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDistributionConfigurationRequest extends js.Object {
  /**
    * The idempotency token of the distribution configuration. 
    */
  var clientToken: ClientToken = js.native
  /**
    * The description of the distribution configuration. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration that you want to update. 
    */
  var distributionConfigurationArn: DistributionConfigurationArn = js.native
  /**
    * The distributions of the distribution configuration. 
    */
  var distributions: DistributionList = js.native
}

object UpdateDistributionConfigurationRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken,
    distributionConfigurationArn: DistributionConfigurationArn,
    distributions: DistributionList,
    description: NonEmptyString = null
  ): UpdateDistributionConfigurationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], distributionConfigurationArn = distributionConfigurationArn.asInstanceOf[js.Any], distributions = distributions.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDistributionConfigurationRequest]
  }
}

