package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    distributions: DistributionList
  ): UpdateDistributionConfigurationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], distributionConfigurationArn = distributionConfigurationArn.asInstanceOf[js.Any], distributions = distributions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDistributionConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateDistributionConfigurationRequestOps[Self <: UpdateDistributionConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionConfigurationArn(value: DistributionConfigurationArn): Self = this.set("distributionConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionsVarargs(value: Distribution*): Self = this.set("distributions", js.Array(value :_*))
    
    @scala.inline
    def setDistributions(value: DistributionList): Self = this.set("distributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
