package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInfrastructureConfigurationResponse extends js.Object {
  /**
    *  The infrastructure configuration object. 
    */
  var infrastructureConfiguration: js.UndefOr[InfrastructureConfiguration] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object GetInfrastructureConfigurationResponse {
  @scala.inline
  def apply(infrastructureConfiguration: InfrastructureConfiguration = null, requestId: NonEmptyString = null): GetInfrastructureConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (infrastructureConfiguration != null) __obj.updateDynamic("infrastructureConfiguration")(infrastructureConfiguration.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInfrastructureConfigurationResponse]
  }
}

