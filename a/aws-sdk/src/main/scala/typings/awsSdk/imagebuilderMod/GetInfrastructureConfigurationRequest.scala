package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInfrastructureConfigurationRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the infrastructure configuration that you wish to retrieve. 
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn = js.native
}

object GetInfrastructureConfigurationRequest {
  @scala.inline
  def apply(infrastructureConfigurationArn: InfrastructureConfigurationArn): GetInfrastructureConfigurationRequest = {
    val __obj = js.Dynamic.literal(infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetInfrastructureConfigurationRequest]
  }
}

