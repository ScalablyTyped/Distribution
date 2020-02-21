package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDistributionConfigurationRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the distribution configuration that you want to retrieve. 
    */
  var distributionConfigurationArn: DistributionConfigurationArn = js.native
}

object GetDistributionConfigurationRequest {
  @scala.inline
  def apply(distributionConfigurationArn: DistributionConfigurationArn): GetDistributionConfigurationRequest = {
    val __obj = js.Dynamic.literal(distributionConfigurationArn = distributionConfigurationArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDistributionConfigurationRequest]
  }
}

