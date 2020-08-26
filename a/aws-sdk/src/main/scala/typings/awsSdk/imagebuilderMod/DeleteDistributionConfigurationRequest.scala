package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDistributionConfigurationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration to delete. 
    */
  var distributionConfigurationArn: DistributionConfigurationArn = js.native
}

object DeleteDistributionConfigurationRequest {
  @scala.inline
  def apply(distributionConfigurationArn: DistributionConfigurationArn): DeleteDistributionConfigurationRequest = {
    val __obj = js.Dynamic.literal(distributionConfigurationArn = distributionConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDistributionConfigurationRequest]
  }
  @scala.inline
  implicit class DeleteDistributionConfigurationRequestOps[Self <: DeleteDistributionConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setDistributionConfigurationArn(value: DistributionConfigurationArn): Self = this.set("distributionConfigurationArn", value.asInstanceOf[js.Any])
  }
  
}

