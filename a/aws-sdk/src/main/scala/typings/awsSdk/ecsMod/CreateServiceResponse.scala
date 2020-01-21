package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateServiceResponse extends js.Object {
  /**
    * The full description of your service following the create call. If a service is using the ECS deployment controller, the deploymentController and taskSets parameters will not be returned. If the service is using the CODE_DEPLOY deployment controller, the deploymentController, taskSets and deployments parameters will be returned, however the deployments parameter will be an empty list.
    */
  var service: js.UndefOr[Service] = js.native
}

object CreateServiceResponse {
  @scala.inline
  def apply(service: Service = null): CreateServiceResponse = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceResponse]
  }
}

