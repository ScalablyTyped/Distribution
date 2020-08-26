package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoverPollEndpointRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster to which the container instance belongs.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * The container instance ID or full ARN of the container instance. The ARN contains the arn:aws:ecs namespace, followed by the Region of the container instance, the AWS account ID of the container instance owner, the container-instance namespace, and then the container instance ID. For example, arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID.
    */
  var containerInstance: js.UndefOr[String] = js.native
}

object DiscoverPollEndpointRequest {
  @scala.inline
  def apply(): DiscoverPollEndpointRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoverPollEndpointRequest]
  }
  @scala.inline
  implicit class DiscoverPollEndpointRequestOps[Self <: DiscoverPollEndpointRequest] (val x: Self) extends AnyVal {
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
    def setCluster(value: String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    @scala.inline
    def setContainerInstance(value: String): Self = this.set("containerInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerInstance: Self = this.set("containerInstance", js.undefined)
  }
  
}

