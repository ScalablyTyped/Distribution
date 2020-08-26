package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceRegistry extends js.Object {
  /**
    * The container name value, already specified in the task definition, to be used for your service discovery service. If the task definition that your service task specifies uses the bridge or host network mode, you must specify a containerName and containerPort combination from the task definition. If the task definition that your service task specifies uses the awsvpc network mode and a type SRV DNS record is used, you must specify either a containerName and containerPort combination or a port value, but not both.
    */
  var containerName: js.UndefOr[String] = js.native
  /**
    * The port value, already specified in the task definition, to be used for your service discovery service. If the task definition your service task specifies uses the bridge or host network mode, you must specify a containerName and containerPort combination from the task definition. If the task definition your service task specifies uses the awsvpc network mode and a type SRV DNS record is used, you must specify either a containerName and containerPort combination or a port value, but not both.
    */
  var containerPort: js.UndefOr[BoxedInteger] = js.native
  /**
    * The port value used if your service discovery service specified an SRV record. This field may be used if both the awsvpc network mode and SRV records are used.
    */
  var port: js.UndefOr[BoxedInteger] = js.native
  /**
    * The Amazon Resource Name (ARN) of the service registry. The currently supported service registry is AWS Cloud Map. For more information, see CreateService.
    */
  var registryArn: js.UndefOr[String] = js.native
}

object ServiceRegistry {
  @scala.inline
  def apply(): ServiceRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceRegistry]
  }
  @scala.inline
  implicit class ServiceRegistryOps[Self <: ServiceRegistry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerName: Self = this.set("containerName", js.undefined)
    @scala.inline
    def setContainerPort(value: BoxedInteger): Self = this.set("containerPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerPort: Self = this.set("containerPort", js.undefined)
    @scala.inline
    def setPort(value: BoxedInteger): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setRegistryArn(value: String): Self = this.set("registryArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryArn: Self = this.set("registryArn", js.undefined)
  }
  
}

